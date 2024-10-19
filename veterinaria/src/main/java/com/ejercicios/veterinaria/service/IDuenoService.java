package com.ejercicios.veterinaria.service;

import com.ejercicios.veterinaria.model.Dueno;
import java.util.List;

public interface IDuenoService {

    public void saveDueno(Dueno due);
    
    public Dueno findDueno(Long id);
    
    public List<Dueno> getDuenos();
    
    public void deleteDueno(Long id);
    
    public void editDueno(Dueno due);
    
}
