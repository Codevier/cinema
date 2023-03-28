package com.cinema.cinema.controllers;

import com.cinema.cinema.entities.MovieCinema;
import com.cinema.cinema.services.MovieCinemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@RestController
@RequestMapping("/api/moviescinemas")
public class MovieCinemaController {
    @Autowired
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

    /*
    @GetMapping("/moviesPublicationDate")
    public List<MovieCinema> getMovieCinemaPublicationDate(@PathVariable Date publicationDate){
        return movieCinemaService.getMovieCinemaPublicationDate(publicationDate);
    }

     */

    @GetMapping
    public List<MovieCinema> findAll(){
        return movieCinemaService.findAll();
    }



    @GetMapping("/filter")
    public ResponseEntity<List<MovieCinema>> search(@RequestParam("name")  String name, @RequestParam("id")  Integer id){
        List<MovieCinema> movieCinemas =movieCinemaService.search(name,id);
        return ResponseEntity.ok(movieCinemas);
    }







}
