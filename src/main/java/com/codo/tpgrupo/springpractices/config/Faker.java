package com.codo.tpgrupo.springpractices.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class Faker {

    @Bean
    public Faker createFaker(){
        return new Faker();
    }
}

