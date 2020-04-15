package com.springboot.user.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.user.entity.BankAccount;




@Repository

public interface BankAccountRepository extends JpaRepository <BankAccount,Integer> {

	
	

}
