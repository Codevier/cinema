package com.cinema.cinema.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

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
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="fk_id_movie")
    private Movie movie;
    private Date publication_date;
    private Date end_date;
    //cinema_id
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="fk_id_cinema")
    private  Cinema cinema;

}
