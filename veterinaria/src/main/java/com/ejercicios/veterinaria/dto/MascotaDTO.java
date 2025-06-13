package com.ejercicios.veterinaria.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class MascotaDTO {
    private String nombreMascota;
    private String especie;
    private String raza;
    private String color;
    private Long idDueno;

    public MascotaDTO() {
    }

    public MascotaDTO(String nombreMascota, String especie, String raza, String color, Long idDueno) {
        this.nombreMascota = nombreMascota;
        this.especie = especie;
        this.raza = raza;
        this.color = color;
        this.idDueno = idDueno;
    }
}
