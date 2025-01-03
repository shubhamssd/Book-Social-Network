package com.bookSocialNetwork;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableJpaAuditing
@EnableAsync
@SpringBootApplication
public class BookSocialNetworkApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookSocialNetworkApiApplication.class, args);
	}

}
