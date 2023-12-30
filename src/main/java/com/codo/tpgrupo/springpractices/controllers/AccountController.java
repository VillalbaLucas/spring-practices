package com.codo.tpgrupo.springpractices.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codo.tpgrupo.springpractices.models.Account;
import com.codo.tpgrupo.springpractices.services.AccountService;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {
 
    private static AccountService service;

    public AccountController(AccountService _service){
        service=_service;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Account>> getAccounts(){
        return ResponseEntity.ok().body(service.findAll());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<?> getAccounts(@PathVariable Long id){
        return ResponseEntity.ok().body(service.geById(id));
    }

    @PostMapping("/save/{id}")
    public ResponseEntity<?> saveAccount(@PathVariable Long id, @RequestBody Account account){
        
        try{
           service.save(account, id);
           return ResponseEntity.ok().body(account); 
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(e);
        }
    }

    //TODO: refactorizar el modify
    @PatchMapping("/{id}/{newUsername}")
    public ResponseEntity<?> setUsername(@PathVariable Long id, @PathVariable String newUsername){
        try{
            Account account = service.geById(id).get();
            account.setUsername(newUsername);
            service.save(account);
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e);
        }
    }


}
