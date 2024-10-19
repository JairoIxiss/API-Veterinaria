package com.ejercicios.veterinaria.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class DuenoMascotaDTO {
    
    private String nomMasc;
    private String espec;
    private String raz;
    private String nomDue;
    private String apellDue;

    public DuenoMascotaDTO() {
    }

    public DuenoMascotaDTO(String nomMasc, String espec, String raz, String nomDue, String apellDue) {
        this.nomMasc = nomMasc;
        this.espec = espec;
        this.raz = raz;
        this.nomDue = nomDue;
        this.apellDue = apellDue;
    }
            
}
