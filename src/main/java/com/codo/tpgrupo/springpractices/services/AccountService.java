package com.codo.tpgrupo.springpractices.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codo.tpgrupo.springpractices.models.Account;
import com.codo.tpgrupo.springpractices.repository.AccountRepo;

@Service
public class AccountService {

    private static AccountRepo repository;
    private static UserService userService;

    public AccountService(AccountRepo repo, UserService _userService){
        repository = repo;
        userService = _userService;
    }

    public void  save(Account account, Long id){ 
        account.setUser(userService.getById(id));
        repository.save(account);
    } 

    public void  save(Account account){ 
        repository.save(account);
    } 

    public Optional<Account> geById(Long id){
        return repository.findById(id);
    }

    public List<Account> findAll(){
        return repository.findAll();
    }
}
