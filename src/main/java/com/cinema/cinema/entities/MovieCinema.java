package com.cinema.cinema.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

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
    private Date publication_date;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date end_date;
    //cinema_id
    @ManyToOne
    @JoinColumn(name = "cinema_id")
    private  Cinema cinema;

}
