package com.cinema.cinema.services;

import com.cinema.cinema.entities.MovieCinema;
import com.cinema.cinema.repository.MovieCinemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class MovieCinemaService {
    @Autowired
    private final MovieCinemaRepository movieCinemaRepository;

    public MovieCinemaService(MovieCinemaRepository movieCinemaRepository) {
        this.movieCinemaRepository = movieCinemaRepository;
    }

    public MovieCinema createMovieCinema(MovieCinema MovieCinema) {
        return movieCinemaRepository.save(MovieCinema);
    }

    public MovieCinema getMovieCinemaId(Integer id) {
        return movieCinemaRepository.findById(id).get();
    }



    public List<MovieCinema> search(String name, Integer id ){
        return movieCinemaRepository.search(name,id);
    }

    public List<MovieCinema> findAll(){
        return movieCinemaRepository.findAll();
    }
}
