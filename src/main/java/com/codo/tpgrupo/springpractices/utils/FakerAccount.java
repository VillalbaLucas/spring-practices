package com.codo.tpgrupo.springpractices.utils;

import com.codo.tpgrupo.springpractices.models.Account;
import com.codo.tpgrupo.springpractices.models.User;

import net.datafaker.Faker;

public class FakerAccount {
    
    private static Faker faker = new Faker();

    private final static int AMOUNT_MIN = 20_000;
    private final static int AMOUNT_MAX = 100_000;

    public static Account createAccount(User user){
        return new Account(
            faker.internet().emailAddress(user.getName()),
            faker.internet().password(),
            faker.number().numberBetween(AMOUNT_MIN, AMOUNT_MAX),
            user
        );
    }

}
