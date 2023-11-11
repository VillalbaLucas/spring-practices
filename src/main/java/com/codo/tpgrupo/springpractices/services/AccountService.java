package com.codo.tpgrupo.springpractices.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codo.tpgrupo.springpractices.models.Account;
import com.codo.tpgrupo.springpractices.repository.AccountRepo;

@Service
public class AccountService {
    
    
    private AccountRepo repository;
    
    public AccountService(AccountRepo repo){
        repository = repo;
    }

    public void save(Account account){
        repository.save(account);
    }

    public Optional<Account> geById(Long id){
        return repository.findById(id);
    }

    public List<Account> findAll(){
        return repository.findAll();
    }
}
