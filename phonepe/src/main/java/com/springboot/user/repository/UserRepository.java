package com.springboot.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.user.entity.User;



public interface UserRepository extends JpaRepository<User, Integer> {

}
