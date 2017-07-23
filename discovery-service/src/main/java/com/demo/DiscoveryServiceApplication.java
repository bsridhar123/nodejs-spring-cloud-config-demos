package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
//import org.springframework.cloud.sleuth.Sampler;
//import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
//import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaServer
public class DiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryServiceApplication.class, args);
	}
	
	/*@Bean
	public Sampler defaultSampler() {
		return new AlwaysSampler();
	}
	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}*/
}
