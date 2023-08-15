package com.example.blog;

import com.example.blog.entities.Post;
import com.example.blog.repositories.PostRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(PostRepository postRepository) {
		return args -> {
			Post post = new Post();
			post.setTitle("This is my first comment");
			postRepository.save(post);
		};
	}
}

