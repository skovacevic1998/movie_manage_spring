package com.moviemanage.controller;

import com.moviemanage.model.Movie;
import com.moviemanage.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MovieController {

    private final MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("fetchMovies")
    public List<Movie> getAllMovies() {
        return movieService.getAllMovies();
    }

    @PostMapping("addMovie")
    public Movie addMovie(@RequestBody Movie movie) {
        return movieService.addMovie(movie);
    }
}
