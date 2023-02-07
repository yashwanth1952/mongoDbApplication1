package com.example.mongoDbApplication.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "platforms")
public class Platform {
    @Id
    @Getter
    @Setter
    private String id;
    @Getter
    @Setter
    private String name;

    public Platform(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Platform() {
    }
}
