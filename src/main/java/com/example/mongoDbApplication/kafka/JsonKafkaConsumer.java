package com.example.mongoDbApplication.kafka;

import com.example.mongoDbApplication.entity.Movie;
import com.example.mongoDbApplication.service.MovieService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {
    private static final Logger LOGGER= LoggerFactory.getLogger(JsonKafkaConsumer.class);
    @Autowired
    private MovieService movieService;

    @KafkaListener(topics = "movies_json",groupId = "myKafkaGroup")
    public void consume(Movie movie){
        LOGGER.info(String.format("Json message recieved -> %s",movie.toString()));
        movieService.save(movie);
    }
}
