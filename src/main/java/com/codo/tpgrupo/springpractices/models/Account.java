package com.codo.tpgrupo.springpractices.models;


import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter @Getter @NoArgsConstructor
public class Account {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    private String username;
    private String password;
    private Integer amount;

    @ManyToOne
    @JoinColumn(name="user_id")
    @JsonIgnore
    private User user;

    public Account(String _username, String _password, Integer _amount){
        username=_username;
        password=_password;
        amount=_amount;
    }
    public Account(String _username, String _password, Integer _amount, User _user){
        username=_username;
        password=_password;
        amount=_amount;
        user=_user;
    }

    public void setUser(Optional<?> _user){
        user= (User)_user.get();
    }
    public void setUser(User _user){
        user=_user;
    }
}
