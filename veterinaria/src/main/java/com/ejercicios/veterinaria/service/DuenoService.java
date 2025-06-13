package com.ejercicios.veterinaria.service;

import com.ejercicios.veterinaria.model.Dueno;
import com.ejercicios.veterinaria.repository.IDuenoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DuenoService implements IDuenoService {
    @Autowired
    private IDuenoRepository dueRepo;

    @Override
    public void saveDueno(Dueno due) {
        dueRepo.save(due);
    }

    @Override
    public Dueno findDueno(Long id) {
        return dueRepo.findById(id).orElse(null);
    }

    @Override
    public List<Dueno> getDuenos() {
        return dueRepo.findAll();
    }

    @Override
    public void deleteDueno(Long id) {
        dueRepo.deleteById(id);
    }

    @Override
    public void editDueno(Long id, Dueno nuevoDueno) {
        Dueno duenoEditar = this.findDueno(id);

        duenoEditar.setDni(nuevoDueno.getDni());
        duenoEditar.setNombreDueno(nuevoDueno.getNombreDueno());
        duenoEditar.setApellido(nuevoDueno.getApellido());
        duenoEditar.setCelular(nuevoDueno.getCelular());

        this.saveDueno(duenoEditar);
    }
}
