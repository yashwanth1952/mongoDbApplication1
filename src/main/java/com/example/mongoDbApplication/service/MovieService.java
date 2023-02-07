package com.example.mongoDbApplication.service;

import com.example.mongoDbApplication.entity.Movie;
import com.example.mongoDbApplication.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    private MovieRepository movieRepository;

    public List<Movie> findAll(){
        return movieRepository.findAll();
    }
    public Movie findById(String id){
        return movieRepository.findById(id).get();
    }
    public void deleteById(String id){
        movieRepository.deleteById(id);
    }
    public Movie save(Movie movie){
        return movieRepository.save(movie);
    }
}
