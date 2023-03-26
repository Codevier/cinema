package com.cinema.cinema.controllers;

import com.cinema.cinema.entities.Movie;
import com.cinema.cinema.services.MovieService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MovieControllers {
    private final MovieService movieService;

    public MovieControllers(MovieService movieService) {
        this.movieService = movieService;
    }

    @PostMapping
    public Movie createMovie(@RequestBody Movie movie){
        return movieService.createMovie(movie);
    }

    @GetMapping("/{id}")
    public Movie getMovieById(@PathVariable Integer id){
        return  movieService.getMovieById(id);
    }

    @GetMapping
    public List<Movie> findAll(){
        return movieService.findAll();
    }
}
