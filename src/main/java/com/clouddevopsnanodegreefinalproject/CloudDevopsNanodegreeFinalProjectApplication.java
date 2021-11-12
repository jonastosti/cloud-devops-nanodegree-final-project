package com.clouddevopsnanodegreefinalproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CloudDevopsNanodegreeFinalProjectApplication {
	
	
	@GetMapping(path = "/home")
	public String home() {
		return "Hello Jonas! This is running in a container! Version 2";
	}


	public static void main(String[] args) {
		SpringApplication.run(CloudDevopsNanodegreeFinalProjectApplication.class, args);
	}

}
