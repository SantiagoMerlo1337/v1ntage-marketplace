package com.v1ntage.marketplace.users;

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
        try {

            userService.saveOrUpdate(user);
            return new ResponseEntity<>(user, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable("userId") UUID id){
        userService.delete(id);
    }
}
