package com.example.mongoDbApplication.repository;

import com.example.mongoDbApplication.entity.Platform;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlatformRepository extends MongoRepository<Platform,String> {
}
