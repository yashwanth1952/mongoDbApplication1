package com.example.mongoDbApplication.repository;

import com.example.mongoDbApplication.entity.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends MongoRepository<Movie,String> {
}
