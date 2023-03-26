package com.cinema.cinema.repository;

import com.cinema.cinema.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieReporsitory extends JpaRepository<Movie, Integer> {
}
