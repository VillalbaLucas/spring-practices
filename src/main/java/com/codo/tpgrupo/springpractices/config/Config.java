package com.codo.tpgrupo.springpractices.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import net.datafaker.Faker;

@Configuration
public class Config {

    @Bean
    public Faker createFaker(){
        return new Faker();
    }
}

