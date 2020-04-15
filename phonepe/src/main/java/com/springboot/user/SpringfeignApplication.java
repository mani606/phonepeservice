package com.springboot.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.springboot.user.config.RibbonConfiguration;



@SpringBootApplication
@EnableFeignClients("om.springboot.user")
@EnableEurekaClient
@RibbonClient(name="phonepe-service",configuration=RibbonConfiguration.class)
public class SpringfeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringfeignApplication.class, args);
	}

}
