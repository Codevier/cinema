package com.cinema.cinema.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;


@Entity
@Table(name="MovieCinema")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieCinema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    //movie_id
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "movie_id", nullable = false)
    private Movie movie;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date publication_date;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date end_date;
    //cinema_id
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "cinema_id", nullable = false)
    private  Cinema cinema;

}
