package com.springboot.user.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.user.entity.Transaction;




@Repository
public interface TransactionRepository extends JpaRepository<Transaction,Integer> {

}
