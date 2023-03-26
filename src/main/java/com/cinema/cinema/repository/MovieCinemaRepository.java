package com.cinema.cinema.repository;

import com.cinema.cinema.entities.MovieCinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.sql.Date;
import java.util.List;

public interface MovieCinemaRepository extends JpaRepository<MovieCinema, Integer> {
    @Query( value = "SELECT mc.* FROM movie_cinema mc join movies m on mc.movie_id=m.id\n" +
            "where m.name= :name and mc.id= :id", nativeQuery = true)
    List<MovieCinema> getMovieWithIdCincemaMovieAndNameMovie(@Param("name") String name, @Param("id") Integer id);

    List<MovieCinema> findByPublicationDate(Date publication_date);
}
