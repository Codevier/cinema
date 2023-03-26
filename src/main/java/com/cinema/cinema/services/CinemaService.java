package com.cinema.cinema.services;

import com.cinema.cinema.entities.Cinema;
import com.cinema.cinema.repository.CinemaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CinemaService {
    private final CinemaRepository cinemaRepository;

    public CinemaService(CinemaRepository cinemaRepository) {
        this.cinemaRepository = cinemaRepository;
    }

    public Cinema createCinema(Cinema cinema){
        return cinemaRepository.save(cinema);
    }

    public Cinema getCinemaById(Integer id){
        return cinemaRepository.findById(id).get();
    }

    public List<Cinema> findAll(){
        return cinemaRepository.findAll();
    }
}
