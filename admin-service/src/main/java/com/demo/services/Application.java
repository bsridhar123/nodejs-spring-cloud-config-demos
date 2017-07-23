package com.demo.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import de.codecentric.boot.admin.config.EnableAdminServer;
import com.demo.services.model.MyRequest;

@SpringBootApplication
@RestController
@EnableAdminServer
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

		@GetMapping("/api/pricing")
        String getName() {
            return "Welcome to pricing";
        }
    
   
    
}   
   