package com.ejercicios.veterinaria.service;

import com.ejercicios.veterinaria.dto.DuenoMascotaDTO;
import com.ejercicios.veterinaria.model.Mascota;
import java.util.List;

public interface IMascotaService {
    
    public void saveMascota(Mascota masco);
    
    public Mascota findMascota(Long id);
    
    public List<Mascota> getMascotas();
    
    public void deleteMascota(Long id);
    
    public void editMascota(Mascota masco);
    
    public List<Mascota> perrosCaniches();
    
    public List<DuenoMascotaDTO> datosMascota();
        
}