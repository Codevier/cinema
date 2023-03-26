package com.cinema.cinema.services;

import com.cinema.cinema.entities.MovieCinema;
import com.cinema.cinema.repository.MovieCinemaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieCinemaService {
    private final MovieCinemaRepository movieCinemaRepository;

    public MovieCinemaService(MovieCinemaRepository movieCinemaRepository) {
        this.movieCinemaRepository = movieCinemaRepository;
    }

    public MovieCinema createMovieCinema(MovieCinema MovieCinema){
        return movieCinemaRepository.save(MovieCinema);
    }

    public MovieCinema getMovieCinemaId(Integer id){
        return movieCinemaRepository.findById(id).get();
    }
    public List<MovieCinema> findAll(){
        return movieCinemaRepository.findAll();
    }
}