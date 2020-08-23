package com.claudes.simplestore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.claudes.simplestore.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
