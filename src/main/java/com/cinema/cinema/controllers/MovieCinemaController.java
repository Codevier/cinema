package com.cinema.cinema.controllers;

import com.cinema.cinema.entities.MovieCinema;
import com.cinema.cinema.services.MovieCinemaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/moviescinemas")
public class MovieCinemaController {
    private final MovieCinemaService movieCinemaService;
    public MovieCinemaController(MovieCinemaService movieCinemaService) {
        this.movieCinemaService = movieCinemaService;
    }

    @PostMapping
    public MovieCinema createMovieCinema(@RequestBody MovieCinema movieCinema){
        return movieCinemaService.createMovieCinema(movieCinema);
    }
    @GetMapping("/{id}")
    public MovieCinema getMovieCinemaId(@PathVariable Integer id){
        return movieCinemaService.getMovieCinemaId(id);
    }
    @GetMapping
    public List<MovieCinema> findAll(){
        return movieCinemaService.findAll();
    }

}
