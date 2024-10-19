package com.ejercicios.veterinaria.repository;

import com.ejercicios.veterinaria.model.Dueno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDuenoRepository extends JpaRepository<Dueno, Long>{
    
}
