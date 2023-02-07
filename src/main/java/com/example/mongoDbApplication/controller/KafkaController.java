package com.example.mongoDbApplication.controller;

import com.example.mongoDbApplication.entity.Movie;
import com.example.mongoDbApplication.kafka.JsonKafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaController {
    @Autowired
    private JsonKafkaProducer jsonKafkaProducer;

    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody Movie movie) {
        jsonKafkaProducer.sendMessage(movie);
        return ResponseEntity.ok("Movie Json Message sent to the topic");
    }
}
