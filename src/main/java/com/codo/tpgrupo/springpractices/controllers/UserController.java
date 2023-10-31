package com.codo.tpgrupo.springpractices.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter;

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
    @GetMapping("/users/{id}")
    public ResponseEntity<String> getById(@PathVariable Long id){
        Optional<User> user = service.getById(id);

        if(user.isPresent())
            return new ResponseEntity<String>(user.toString(), HttpStatus.OK);
        else{
            return new ResponseEntity<String>("Recurso no encontrado", HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/users")
    public void saveUser(@RequestBody User user){
        service.save(user);
    }
}
