package com.ejercicios.veterinaria.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Dueno {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id_dueno;
    private String dni;
    private String nombreDueno;
    private String apellido;
    private String celular;
    @OneToMany (mappedBy = "dueno", cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Mascota> listaMascotas = new ArrayList<>();

    public Dueno() {
    }

    public Dueno(Long id_dueno, String dni, String nombreDueno, String apellido, String celular) {
        this.id_dueno = id_dueno;
        this.dni = dni;
        this.nombreDueno = nombreDueno;
        this.apellido = apellido;
        this.celular = celular;
    }
    
}
