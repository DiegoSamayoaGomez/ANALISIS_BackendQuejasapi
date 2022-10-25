package com.Analisis.QuejasAPI.controller;

import com.Analisis.QuejasAPI.exception.CategoriaNotFoundException;
import com.Analisis.QuejasAPI.model.Categoria;
import com.Analisis.QuejasAPI.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class CategoriaController {

    @Autowired
    CategoriaRepository categoriaRepository;

    //Listar todas las categorias
    @GetMapping("/categoria")
    public List<Categoria> getAllCategorias() {
        return categoriaRepository.findAll();
    }

    //Crear nueva categoria
    @PostMapping("/categoria")
    public Categoria createCategoria(@Valid @RequestBody Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    //Conseguir categoria por ID
    @GetMapping("/categoria/{id_categoria}")
    public Categoria getCategoriaById(@PathVariable(value = "id_categoria") Long categoriaId) throws CategoriaNotFoundException {
        return categoriaRepository.findById(categoriaId).orElseThrow(() -> new CategoriaNotFoundException(categoriaId));
    }

    //Actualizar categoria por ID
    @PutMapping("/categoria/{id_categoria}")
    public Categoria updateCategoria(@PathVariable(value = "id_categoria") Long categoriaId, @Valid @RequestBody Categoria categoriaDetalles) throws CategoriaNotFoundException {
        Categoria categoria = categoriaRepository.findById(categoriaId).orElseThrow(() -> new CategoriaNotFoundException(categoriaId));

        categoria.setNombre_categoria(categoriaDetalles.getNombre_categoria());
        categoria.setDepartamento(categoriaDetalles.getDepartamento());

        Categoria updatedCategoria = categoriaRepository.save(categoria);
        return updatedCategoria;

    }

}
