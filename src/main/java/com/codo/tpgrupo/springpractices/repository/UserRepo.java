package com.codo.tpgrupo.springpractices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codo.tpgrupo.springpractices.models.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long>{
}
