package com.ejercicios.veterinaria.controller;

import com.ejercicios.veterinaria.model.Dueno;
import com.ejercicios.veterinaria.service.DuenoService;
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
public class DuenoController {
    @Autowired
    private DuenoService dueServ;
    
    @PostMapping("/duenos/crear")
    public String crearDueno(@RequestBody Dueno due){
        dueServ.saveDueno(due);
        return "El dueno se creo con exito";
    }
    
    @GetMapping("/duenos/traer")
    public List<Dueno> traerDuenos(){
        return dueServ.getDuenos();
    }
    
    @PutMapping("/duenos/editar/{id}")
    public Dueno editarDueno(@PathVariable Long id, @RequestBody Dueno due){
        dueServ.editDueno(id, due);
        return dueServ.findDueno(id);
    }
    
    @DeleteMapping("/duenos/borrar/{id}")
    public String borrarDueno(@PathVariable Long id){
        dueServ.deleteDueno(id);
        return "El dueno se elimino correctamente";
    }
}
