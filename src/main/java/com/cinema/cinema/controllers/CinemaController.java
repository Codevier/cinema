package com.cinema.cinema.controllers;

import com.cinema.cinema.entities.Cinema;
import com.cinema.cinema.services.CinemaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cinemas")
public class CinemaController {
    private  final CinemaService cinemaService;

    public CinemaController(CinemaService cinemaService) {
        this.cinemaService = cinemaService;
    }

    @PostMapping
    public Cinema createCinema(@RequestBody Cinema cinema){
        return cinemaService.createCinema(cinema);
    }

    @GetMapping("/{id}")
    public Cinema getCinemaById(@PathVariable Integer id){
        return cinemaService.getCinemaById(id);

    }

    @GetMapping
    public List<Cinema> findAll(){
        return cinemaService.findAll();
    }
}
