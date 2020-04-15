package com.springboot.user.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.user.client.BankAccountclient;
import com.springboot.user.entity.Transaction;
import com.springboot.user.entity.User;
import com.springboot.user.exception.AccountNotFoundException;
import com.springboot.user.exception.DBException;
import com.springboot.user.repository.TransactionRepository;
import com.springboot.user.repository.UserRepository;

@RestController 
	 @RequestMapping("/user") 
	 public class UserController { 
	 	@Autowired 
		private UserRepository repository;
		 
	@Autowired 
	 	TransactionRepository  repo;
	 	 
		@Autowired 
    private 	BankAccountclient bac; 
	 
	 	@GetMapping("/allusers") 
		public List<User> getAllUsers(){ 
 		return repository.findAll(); 
		} 
	 	@DeleteMapping("accs/{id}")
		public List<User> deleteUserByID(@RequestBody User user, @PathVariable int id){
			return repository.findAll();
		}
	 	@GetMapping("/gettransaction") 
	 	public List<Transaction> getTransactions() { 
	 		return repo.findAll(); 
	 	} 
	 	 
	 	@GetMapping("/gettransactions/{id}") 
	 	public Optional<Transaction> getTransactionsByCount(@PathVariable int id) { 
	 		return repo.findById(id); 
	 	} 
	 	 
	 	@PostMapping("/registeruser") 
	 	public User RegisterUser(@RequestBody User user) { 
	 		Double balance = bac.getAcctNumber(user.getPhonenumber()); 
	 		user.setBalanceamt(balance);		 
	 		repository.save(user); 
	 		return user; 
	 	} 
	 	 
	 	
	 	 
	 	@PostMapping("/transferamount") 
	 	public Transaction saveTransaction(@RequestBody Transaction trans) { 
	 		return repo.save(trans);		 
	 	} 
	 	
}
	
	 
	  


