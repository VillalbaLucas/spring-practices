package com.codo.tpgrupo.springpractices.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codo.tpgrupo.springpractices.models.Account;
import com.codo.tpgrupo.springpractices.services.AccountService;

@RestController
@RequestMapping("/accounts")
public class AccountController {
 
    private static AccountService service;

    public AccountController(AccountService _service){
        service=_service;
    }

    @GetMapping("")
    public ResponseEntity<List<Account>> getAccounts(){
        return ResponseEntity.ok().body(service.findAll());
    }

    @PostMapping("")
    public ResponseEntity<?> saveAccount(@RequestBody Account account){
        try{
           service.save(account);
           return ResponseEntity.ok().body(account); 
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body(e);
        }
    }
}