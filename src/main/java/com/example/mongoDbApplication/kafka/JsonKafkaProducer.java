package com.example.mongoDbApplication.kafka;

import com.example.mongoDbApplication.entity.Movie;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaProducer {
    private static final Logger LOGGER= LoggerFactory.getLogger(JsonKafkaProducer.class);
    private final KafkaTemplate<String, Movie> kafkaTemplate;

    @Autowired
    public JsonKafkaProducer(KafkaTemplate<String ,Movie> kafkaTemplate){
        this.kafkaTemplate=kafkaTemplate;
    }

    public void sendMessage(Movie data){
        LOGGER.info(String.format("Message sent -> %s",data.toString()));
        Message<Movie> message= MessageBuilder
                .withPayload(data)
                .setHeader(KafkaHeaders.TOPIC,"movies_json")
                .build();
        kafkaTemplate.send(message);
    }
}
