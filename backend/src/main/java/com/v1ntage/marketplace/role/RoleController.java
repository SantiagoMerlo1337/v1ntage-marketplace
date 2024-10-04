package com.v1ntage.marketplace.role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/roles")
public class RoleController {
    @Autowired
    RoleService roleService;

    @GetMapping
    public List<Role> getRoles(){
        return roleService.getAll();
    }

    @GetMapping("/{roleId}")
    public Optional<Role> getRole(@PathVariable("roleId") Integer id){
        return roleService.get(id);
    }

    @PostMapping
    public ResponseEntity<Role> createProvince(@RequestBody Role role) {
        try {
            roleService.saveOrUpdate(role);
            return new ResponseEntity<>(role, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
