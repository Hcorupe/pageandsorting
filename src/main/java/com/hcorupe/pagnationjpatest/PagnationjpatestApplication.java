package com.hcorupe.pagnationjpatest;

import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PagnationjpatestApplication {

	public static void main(String[] args) {
		SpringApplication.run(PagnationjpatestApplication.class, args);
	}


	@Bean
	Faker faker() {
		return new Faker();
	}

}
