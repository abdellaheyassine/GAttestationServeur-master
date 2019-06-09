package com.example.demo;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.beans.Region;
import com.example.demo.repository.RegionRepository;



@SpringBootApplication
public class GAttestationApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(GAttestationApplication.class, args);
		
	}

}
