package com.example.orchestra.controllers;


import com.example.orchestra.entities.User;
import com.example.orchestra.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value="/users")
    public List<User> allUsers(){
        return userService.getAllUsers();
    }

    @PostMapping(value="/userAdd")
    public User addUser(@Valid @RequestBody User user){
        return userService.saveUser(user);
    }

    @GetMapping(value="/user/{id}")
    public User getUserById(@PathVariable Long id){
        return userService.findUserById(id);
    }

    @DeleteMapping(value="/userDelete/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id){
        userService.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping(value="/userUpdate/{id}")
    public User updateUser(@Valid @RequestBody User user , Long id){
        return userService.updateUser(user);
    }
}
