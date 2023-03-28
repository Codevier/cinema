package com.cinema.cinema.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@Table(name="movies")
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"propiedadNoSerializable1", "propiedadNoSerializable2"})
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Double duration;
}
