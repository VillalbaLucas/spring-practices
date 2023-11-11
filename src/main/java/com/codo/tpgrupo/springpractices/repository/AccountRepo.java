package com.codo.tpgrupo.springpractices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codo.tpgrupo.springpractices.models.Account;

@Repository
public interface AccountRepo extends JpaRepository<Account, Long> {
    
}
