package com.ejercicios.veterinaria.service;

import com.ejercicios.veterinaria.dto.DuenoMascotaDTO;
import com.ejercicios.veterinaria.model.Mascota;
import com.ejercicios.veterinaria.repository.IMascotaRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MascotaService implements IMascotaService{
    @Autowired
    private IMascotaRepository mascoRepo;

    @Override
    public void saveMascota(Mascota masco) {
        mascoRepo.save(masco);
    }

    @Override
    public Mascota findMascota(Long id) {
        return mascoRepo.findById(id).orElse(null);
    }

    @Override
    public List<Mascota> getMascotas() {
        return mascoRepo.findAll();
    }

    @Override
    public void deleteMascota(Long id) {
        mascoRepo.deleteById(id);
    }

    @Override
    public void editMascota(Mascota masco) {
        this.saveMascota(masco);
    }

    @Override
    public List<Mascota> perrosCaniches() {
        String pal1 = "Perro";
        String pal2 = "Caniche";
        String comp1;
        String comp2;
        
        List<Mascota> listaMasc = mascoRepo.findAll();
        List<Mascota> listaCaniches = new ArrayList<>();
        
        for (Mascota mascota : listaMasc) {
            comp1 = mascota.getRaza();
            comp2 = mascota.getEspecie();
            boolean cani = comp1.contains(pal2);
            boolean perr = comp2.contains(pal1);
            if(cani == true && perr == true){
                listaCaniches.add(mascota);
            }
        }
        return listaCaniches;
    }

    @Override
    public List<DuenoMascotaDTO> datosMascota(){
        DuenoMascotaDTO dto = new DuenoMascotaDTO();
        List<Mascota> listaMasco = this.getMascotas();
        List<DuenoMascotaDTO> listaDTO= new ArrayList<>();
        
        for (Mascota masco : listaMasco) {
            dto.setNomMasc(masco.getNombreMascota());
            dto.setEspec(masco.getEspecie());
            dto.setRaz(masco.getRaza());
            dto.setNomDue(masco.getDueno().getNombreDueno());
            dto.setApellDue(masco.getDueno().getApellido());
            listaDTO.add(dto);
            dto = new DuenoMascotaDTO();
        }
        return listaDTO;
    }
}
