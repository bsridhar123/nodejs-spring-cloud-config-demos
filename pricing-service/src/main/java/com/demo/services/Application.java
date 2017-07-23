package com.demo.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	
	@Value("${surname}")
	String surname;
	
	@Value("${myname}")
	String myname;
	
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

		@GetMapping("/api/pricing")
        String getName() {
            return "Welcome to pricing:surname::myname:::" + surname + ":::" + myname;
        }
    
   
    
}   
   