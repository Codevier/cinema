package com.cinema.cinema.services;

import com.cinema.cinema.entities.Movie;
import com.cinema.cinema.repository.MovieReporsitory;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    private final MovieReporsitory movieReporsitory;

    public MovieService(MovieReporsitory movieReporsitory) {
        this.movieReporsitory = movieReporsitory;
    }

    public Movie createMovie(Movie movie){
        return movieReporsitory.save(movie);
    }

    public Movie getMovieById(Integer id){
        return movieReporsitory.findById(id).get();
    }

    public List<Movie> findAll(){
        return movieReporsitory.findAll();
    }
}
