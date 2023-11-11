package com.codo.tpgrupo.springpractices.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codo.tpgrupo.springpractices.models.User;
import com.codo.tpgrupo.springpractices.repository.UserRepo;
import com.codo.tpgrupo.springpractices.utils.FakeUser;

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

    public Optional<User> getById(Long id){
        return repository.findById(id);
    }

    public void deleteUser(Long id){
        repository.deleteById(id);
    }


    //Genera User con datos falsos para agilizar el ingreso de datos.
    public void generateAndSaveAll(int quantity){
        repository.saveAll(FakeUser.generateUsers(quantity));
    }
    
    public void generateAndSave(){
        repository.save(FakeUser.generateUser());
    }
}
