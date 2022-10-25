package com.Analisis.QuejasAPI.controller;

import com.Analisis.QuejasAPI.exception.QuejaNotFoundException;
import com.Analisis.QuejasAPI.model.Queja;
import com.Analisis.QuejasAPI.repository.QuejaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class QuejaController {

    @Autowired
    QuejaRepository quejaRepository;

    //Listar todas las quejas
    @GetMapping("/quejas")
    public List<Queja> getAllQueja() {
        return quejaRepository.findAll();
    }

    //Listar quejas por ID
    @GetMapping("/quejas/{id_queja}")
    public Queja getQuejaById(@PathVariable(value = "id_queja") Long quejaId) throws QuejaNotFoundException {
        return quejaRepository.findById(quejaId).orElseThrow(() -> new QuejaNotFoundException(quejaId));

    }

    //Crear nueva queja
    @PostMapping("/quejas")
    public Queja createQueja(@Valid @RequestBody Queja queja) {
        return quejaRepository.save(queja);
    }

    //Actualizar estado de queja
    @PutMapping("/quejas/{id_queja")
    public Queja updateQueja(@PathVariable(value = "id_queja") Long quejaId, @Valid @RequestBody Queja quejaDetalle) throws QuejaNotFoundException {
        Queja queja = quejaRepository.findById(quejaId).orElseThrow(() -> new QuejaNotFoundException(quejaId));

        queja.setEstado(quejaDetalle.getEstado());

        Queja updatedQueja = quejaRepository.save(queja);
        return updatedQueja;

    }


}
