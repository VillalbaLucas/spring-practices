package com.codo.tpgrupo.springpractices.utils;

import java.util.ArrayList;
import java.util.List;

import com.codo.tpgrupo.springpractices.models.User;

import lombok.experimental.UtilityClass;
import net.datafaker.Faker;

@UtilityClass
public class FakeUser {

    // @Autowired
    private Faker faker = new Faker();

    public static void main(String ...args){
        User user = FakeUser.generateUser();
        System.out.println(user.toString());
    }

    public User generateUser(){
        User user = new User(
            faker.name().firstName(),
            faker.name().lastName(),
            faker.number().numberBetween(12, 80)
        ); 
        user.addAccount(FakerAccount.createAccount(user));
        
        return user;
    }

    public static List<User> generateUsers(int quantity){
        List<User> users = new ArrayList<>();
        for(int i=0; i<quantity; i++){
            users.add(generateUser());
        }
        return users;
    }
}
