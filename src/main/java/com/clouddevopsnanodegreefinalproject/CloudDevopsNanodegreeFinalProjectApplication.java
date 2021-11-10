package com.clouddevopsnanodegreefinalproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CloudDevopsNanodegreeFinalProjectApplication {
	
	@RequestMapping("/")
	public String home() {
		return "Hello Jonas! This is running in a container ";
	}


	public static void main(String[] args) {
		SpringApplication.run(CloudDevopsNanodegreeFinalProjectApplication.class, args);
	}

}
