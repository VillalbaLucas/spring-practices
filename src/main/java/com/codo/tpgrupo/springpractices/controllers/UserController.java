package com.codo.tpgrupo.springpractices.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/users/{id}")
    public ResponseEntity<?> getById(@PathVariable Long id){
        Optional<User> user = service.getById(id);

        if(user.isPresent())
            return new ResponseEntity<>( user.get(), HttpStatus.OK);
        else{
            return new ResponseEntity<>("", HttpStatus.NO_CONTENT);
        }
    }

    @PostMapping("/users")
    public void saveUser(@RequestBody User user){
        service.save(user);
    }

    @DeleteMapping("/users/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable Long id){
        ResponseEntity<?> response;
        if(service.getById(id).isPresent()){
            service.deleteUser(id);
            response = new ResponseEntity<>("El user a sido eliminado!", HttpStatus.OK);
        }else{
            response = new ResponseEntity<>("El user no se encuentra en la base de datos", HttpStatus.BAD_REQUEST);                                   
        }
        return response;
    }

    @GetMapping("/users/generate/{quantity}")
    public void generateUsers(@PathVariable int quantity){
        service.generateAndSaveAll(quantity);
    }
}
