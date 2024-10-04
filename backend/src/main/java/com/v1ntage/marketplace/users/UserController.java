package com.v1ntage.marketplace.users;

import com.v1ntage.marketplace.exception.BusinessException;
import com.v1ntage.marketplace.exception.RequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping(path = "api/v1/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getUsers(){
        return userService.getAll();
    }

    @GetMapping("/{userId}")
    public Optional<User> getUser(@PathVariable("userId") UUID userId){
        return userService.get(userId);
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        if(user.getEmailAddress() == null || user.getEmailAddress() == "" ){
            throw new RequestException("P-500", "Email not found.");
        }

        boolean emailExists = userService.getAll().stream()
                .anyMatch(existingUser -> existingUser.getEmailAddress().equals(user.getEmailAddress()));

        if(emailExists){
            throw new RequestException("P-500", "User with this email already exist.");
        }

        userService.saveOrUpdate(user);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable("userId") UUID id){
        userService.delete(id);
    }
}
