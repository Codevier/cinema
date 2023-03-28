package com.cinema.cinema.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;


@Entity
@Table(name="movie_cinema")
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"propiedadNoSerializable1", "propiedadNoSerializable2"})
public class MovieCinema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    //movie_id
    //@ManyToOne(fetch = FetchType.LAZY)
    @ManyToOne
    @JoinColumn(name = "movie_id")
    private Movie movie;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date publicationDate;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date endDate;
    //cinema_id
    @ManyToOne
    @JoinColumn(name = "cinema_id")
    private  Cinema cinema;

}
