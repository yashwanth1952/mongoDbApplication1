package com.example.mongoDbApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("com.example.mongoDbApplication.repository")
public class MongoDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoDbApplication.class, args);
	}

}
