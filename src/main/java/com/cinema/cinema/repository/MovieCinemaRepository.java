package com.cinema.cinema.repository;

import com.cinema.cinema.entities.MovieCinema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieCinemaRepository extends JpaRepository<MovieCinema, Integer> {
}
