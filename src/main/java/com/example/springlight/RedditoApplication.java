package com.example.springlight;

import com.example.springlight.domain.Comment;
import com.example.springlight.domain.Link;
import com.example.springlight.repos.CommentsRepo;
import com.example.springlight.repos.LinkRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RedditoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedditoApplication.class, args);
	}
	@Bean
	CommandLineRunner runner(LinkRepo LinkRepo, CommentsRepo CommentsRepo) {
		return args -> {
           // create some data
			Link link = new Link("Welcome to spring boot","https://springboot.com");
			LinkRepo.save(link);
		  // create a comment
			Comment comment = new Comment("The rabbit spoke many languages including java",link);
			CommentsRepo.save(comment);
			link.addComment(comment);

			System.out.println("Saving our data to the database .......");
		};
	}

}
