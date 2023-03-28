package com.cinema.cinema.repository;

import com.cinema.cinema.entities.MovieCinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface MovieCinemaRepository extends JpaRepository<MovieCinema, Integer> {



    List<MovieCinema> findAllByMovieNameAndCinemaId(String movie_name, Integer cinema_id);







}
