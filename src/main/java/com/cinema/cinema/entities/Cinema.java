package com.cinema.cinema.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Entity
@Table(name="cinemas")
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"propiedadNoSerializable1", "propiedadNoSerializable2"})
public class Cinema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Boolean status;

}
