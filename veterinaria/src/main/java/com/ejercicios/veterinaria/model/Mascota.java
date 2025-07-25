package com.ejercicios.veterinaria.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Mascota {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_mascota;
    private String nombreMascota;
    private String especie;
    private String raza;
    private String color;
    @ManyToOne
    @JoinColumn(name = "id_dueno")
    @JsonBackReference
    private Dueno dueno;
    
    public Mascota() {
    }

    public Mascota(Long id_mascota, String nombreMascota, String especie, String raza, String color) {
        this.id_mascota = id_mascota;
        this.nombreMascota = nombreMascota;
        this.especie = especie;
        this.raza = raza;
        this.color = color;
    }
    
}
