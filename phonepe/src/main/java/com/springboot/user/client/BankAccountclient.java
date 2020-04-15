package com.springboot.user.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="banking-service", url ="http://localhost:8080") 
 public interface BankAccountclient { 
 	 
 	@GetMapping("/banking/checkExistance/{phonenumber}") 
 	public Double getAcctNumber(@PathVariable Long phonenumber); 
 } 
