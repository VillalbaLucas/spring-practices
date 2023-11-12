package com.codo.tpgrupo.springpractices.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = { "classpath:/application-env.properties" }  )
public class DBConfig {

    @Value("${USERNAME}")
    private String username;

    @Value("${PASSWORD}")
    private String password;

}
