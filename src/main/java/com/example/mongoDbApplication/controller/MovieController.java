package com.example.mongoDbApplication.controller;

import com.example.mongoDbApplication.entity.Movie;
import com.example.mongoDbApplication.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {
    @Autowired
    private MovieService movieService;

    @GetMapping("/")
    public List<Movie> getAllMovies() {

        return movieService.findAll();
    }

    @GetMapping("/{id}")
    public Movie getMovie(@PathVariable String id) {
        return movieService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteMovie(@PathVariable String id) {
        movieService.deleteById(id);
    }

    @PostMapping("/")
    public Movie save(@RequestBody Movie movie) {
        return movieService.save(movie);
    }

    @PutMapping("/")
    public Movie saveOrUpdate(@RequestBody Movie movie) {
        return movieService.save(movie);
    }
}
