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

    public List<MovieCinema> findAll(){
        return movieCinemaRepository.findAll();
    }

    public List<MovieCinema> findAllByMovieNameAndCinemaId(String movie_name, Integer cinema_id ){
        return movieCinemaRepository.findAllByMovieNameAndCinemaId(movie_name,cinema_id);

    }

    public List<MovieCinema> findAllByPublication_date(Date publicationDate){
        return movieCinemaRepository.findByPublicationDate(publicationDate);
    }

    public long countByPublicationDate(Date publicationDate){
        return movieCinemaRepository.countByPublicationDate(publicationDate);
    }

    public String statusCinema(String cinemaName){
        int count= movieCinemaRepository.countByCinemaName(cinemaName);
        if(count<3){
            return "Sala casi Vacía";
        }
        else{
            if(count<=5){
                return "Sala casi Llena";
            }
            else{
                return "Sala Llena";
            }
        }
    }






}
