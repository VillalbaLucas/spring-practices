package com.codo.tpgrupo.springpractices.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.codo.tpgrupo.springpractices.models.User;
import com.codo.tpgrupo.springpractices.services.UserService;


@RestController
public class UserController {
    
    private UserService service;

    public UserController(UserService _service){
        service=_service;
    }

    @GetMapping("/users")
    public List<User> getUsers(){
        return service.getUsers();
    }

    @PostMapping("/users")
    public void saveUser(@RequestBody User user){
        service.save(user);
    }
}
