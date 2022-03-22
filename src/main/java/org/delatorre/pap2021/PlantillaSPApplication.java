package org.delatorre.pap2021;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class PlantillaSPApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(PlantillaSPApplication.class, args);
	}

}
