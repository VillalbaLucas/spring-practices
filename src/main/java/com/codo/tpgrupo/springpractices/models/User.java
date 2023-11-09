package com.codo.tpgrupo.springpractices.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter @Getter @NoArgsConstructor @ToString
public class User{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    private String name;
    private String lastname;
    private int age;

    public User(String _name, String _lastname, int _age){
        name=_name;
        lastname=_lastname;
        age=_age;
    }
}
