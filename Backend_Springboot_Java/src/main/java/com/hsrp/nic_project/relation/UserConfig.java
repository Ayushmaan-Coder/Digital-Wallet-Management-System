package com.hsrp.nic_project.relation;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hsrp.nic_project.repository.UserRepository;

@Configuration
public class UserConfig {
	
	@Bean
	CommandLineRunner commandLineRunner (UserRepository repository) {
		return args -> {
			
		};
	}
}