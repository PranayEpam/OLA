package com.ola.test;

import com.ola.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OlaTestApplication {

	@Autowired
	private  UserService userService ;
	public static void main(String[] args) {

		SpringApplication.run(OlaTestApplication.class, args);
	}

}
