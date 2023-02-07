package com.example.mongoDbApplication.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "movies")
public class Movie {
    @Id
    @Getter
    @Setter
    private String id;
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private double rating;
    @Getter
    @Setter
    private String summary;
    @DBRef
    @Getter
    @Setter
    private List<Platform> availablePlatforms;

    public Movie(String id, String name, double rating, String summary, List<Platform> availablePlatforms) {
        this.id = id;
        this.name = name;
        this.rating = rating;
        this.summary = summary;
        this.availablePlatforms = availablePlatforms;
    }

    public Movie() {
    }
}
//