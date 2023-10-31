package com.codo.tpgrupo.springpractices.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codo.tpgrupo.springpractices.models.User;
import com.codo.tpgrupo.springpractices.repository.UserRepo;

@Service
public class UserService {
    private UserRepo repository;

    public UserService(UserRepo _repository){
        repository=_repository;
    }

    public void save(User user){
        repository.save(user);
    }

    public List<User> getUsers(){
        return repository.findAll();
    }
}
