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



    @GetMapping("/filterMovie_nameAndCinema_id")
    public ResponseEntity<List<MovieCinema>> search(@RequestParam("movie_name")  String movie_name, @RequestParam("cinema_id")  Integer cinema_id){
        List<MovieCinema> movieCinemas =movieCinemaService.findAllByMovieNameAndCinemaId(movie_name,cinema_id);
        return ResponseEntity.ok(movieCinemas);
    }

    @GetMapping("/filterPublication_date")
    public ResponseEntity<List<MovieCinema>> findAllByPublication_date(@RequestParam("publicationDate")  Date publicationDate){
        List<MovieCinema> movieCinemas =movieCinemaService.findAllByPublication_date(publicationDate);
        return ResponseEntity.ok(movieCinemas);
    }

    @GetMapping("/countMovieCinemaPublication_date")
    public long countByPublicationDate(@RequestParam("publicationDate")  Date publicationDate){
        return movieCinemaService.countByPublicationDate(publicationDate);
    }

    @GetMapping("/statusCinemaName")
    public String statusCinema(@RequestParam("cinemaName")  String cinemaName){
        return movieCinemaService.statusCinema(cinemaName);
    }









}
