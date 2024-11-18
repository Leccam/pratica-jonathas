package com.example.pratica_jonathas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories
@EnableFeignClients
@SpringBootApplication
public class PraticaJonathasApplication {

	public static void main(String[] args) {
		SpringApplication.run(PraticaJonathasApplication.class, args);
	}

}
