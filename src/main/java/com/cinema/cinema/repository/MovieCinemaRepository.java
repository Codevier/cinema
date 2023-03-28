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


    @Query("SELECT mc FROM MovieCinema mc")
    List<MovieCinema> search(@Param("name") String name, @Param("id") Integer id);






}
