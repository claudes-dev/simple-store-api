package com.claudes.simplestore.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.claudes.simplestore.model.User;
import com.claudes.simplestore.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Slf4j
public class LoadDatabase {
	
	 private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

	@Bean
	public CommandLineRunner initDatabase(UserRepository repository) {

		return args -> {
			log.info("Preloading " + repository.save(
					new User("Claudes", "claudesferreira99@gmail.com", "123")
					));
		};
	}

}
