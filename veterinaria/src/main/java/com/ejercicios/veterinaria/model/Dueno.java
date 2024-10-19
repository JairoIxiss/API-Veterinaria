package com.ejercicios.veterinaria.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

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
