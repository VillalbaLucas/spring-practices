package com.codo.tpgrupo.springpractices.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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

    @OneToMany( mappedBy = "user")
    private List<Account> accounts = new ArrayList<>() ;
    

    public User(String _name, String _lastname, int _age){
        name=_name;
        lastname=_lastname;
        age=_age;
    }

    public void addAccount(Account account){
        if(!accounts.contains(account))
            accounts.add(account);
    }

    public void removeAccount(Account account){
        accounts.remove(account);
    }

    public List<Account> getAccounts(){
        return accounts;
    }
}
