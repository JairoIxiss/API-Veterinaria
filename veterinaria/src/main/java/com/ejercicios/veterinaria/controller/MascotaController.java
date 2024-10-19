package com.ejercicios.veterinaria.controller;

import com.ejercicios.veterinaria.dto.DuenoMascotaDTO;
import com.ejercicios.veterinaria.model.Mascota;
import com.ejercicios.veterinaria.service.MascotaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MascotaController {
    @Autowired
    private MascotaService mascServ;
    
    @PostMapping("/mascotas/crear")
    public String crearMascota(@RequestBody Mascota masco){
        mascServ.saveMascota(masco);
        return "La mascota se ha creado con exito";
    }
    
    @GetMapping("/mascotas/traer")
    public List<Mascota> listaMascotas(){
        return mascServ.getMascotas();
    }
    
    @PutMapping("/mascotas/editar")
    public Mascota editarMascota(@RequestBody Mascota masco){
        mascServ.saveMascota(masco);
        return mascServ.findMascota(masco.getId_mascota());
    }
    
    @DeleteMapping("/mascotas/eliminar/{id}")
    public String eliminarMascota(@PathVariable Long id){
        mascServ.deleteMascota(id);
        return "La mascota se elimino correctamente";
    }
    
    @GetMapping("/mascotas/caniches")
    public List<Mascota> listaCaniches(){
        return mascServ.perrosCaniches();
    }
    
    @GetMapping("/mascotas/datos")
    public List<DuenoMascotaDTO> datosMascota(){
        return mascServ.datosMascota();
    }
}
