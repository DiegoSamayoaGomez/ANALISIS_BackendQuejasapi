package com.Analisis.QuejasAPI.controller;

import com.Analisis.QuejasAPI.model.Jerarquia;
import com.Analisis.QuejasAPI.repository.JerarquiaRepository;

import com.Analisis.QuejasAPI.exception.JerarquiaNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import javax.validation.Valid;
import java.util.List;


@RestController
public class JerarquiaController {

    @Autowired
    JerarquiaRepository jerarquiaRepository;

    //Conseguir todas las jerarquias
    @GetMapping("/jerarquia")
    public List<Jerarquia> getALLJerarquia() {
        return jerarquiaRepository.findAll();
    }

    //Crear nueva jerarquia
    @GetMapping("/jerarquia")
    public Jerarquia crearJerarquia(@Valid @RequestBody Jerarquia jerarquia) {
        return jerarquiaRepository.save(jerarquia);
    }

    //Obtener Jerarquia Unica por ID
    @GetMapping("/jerarquia/{id_jerarquia}")
    public Jerarquia getJerarquiaById(@PathVariable(value = "id_jerarquia") Long jerarquiaId) throws JerarquiaNotFoundException {
        return jerarquiaRepository.findById(jerarquiaId).orElseThrow(() -> new JerarquiaNotFoundException(jerarquiaId));

    }

    //Actualizar Jerarquia unica por ID
    @PutMapping("/jerarquia/{id_jerarquia}")
    public Jerarquia updateJerarquia(@PathVariable(value = "id_jerarquia") Long jerarquiaID,
                                     @Valid @RequestBody Jerarquia jerarquiaDetalle) throws UsuarioNotFoundException {

        Jerarquia jerarquia = jerarquiaRepository.findById(jerarquiaID).orElseThrow(() -> new JerarquiaNotFoundException(jerarquiaId));

        jerarquia.setNombre(jerarquiaDetalle.getNombre());

        Jerarquia updatedJerarquia = jerarquiaRepository.save(jerarquia);
        return updatedJerarquia;

    }

    //Eliminar Jerarquia por ID
    @DeleteMapping("jerarquia/{id_jerarquia}")
    public ResponseEntity<?> deleteJerarquia(@PathVariable(value = "id_jerarquia") Long jerarquiaId) throws UsuarioNotFoundException{

        Jerarquia jerarquia = jerarquiaRepository.findById(jerarquiaId).orElseThrow(() -> new UsuarioNotFoundException(jerarquiaId));

        jerarquiaRepository.delete(jerarquia);
        return ResponseEntity.ok().build();
    }





}
