package com.Analisis.QuejasAPI.controller;

import com.Analisis.QuejasAPI.exception.UsuarioNotFoundException;

import com.Analisis.QuejasAPI.model.Usuario;
import com.Analisis.QuejasAPI.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import javax.validation.Valid;
import java.util.List;

@RestController

public class UsuarioController {

    @Autowired
    UsuarioRepository usuarioRepository;

    //Conseguir todos los usuarios
    @GetMapping("usuario")
    public List<Usuario> getAllUsuarios() {
        return usuarioRepository.findAll();
    }

    //Crear nuevo usuario
    @PostMapping("usuario")
    public Usuario createUsuario(@Valid @RequestBody Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    //Buscar usuario por ID
    @GetMapping("usuario/{id_usuario}")
    public Usuario getUsuarioById(@PathVariable(value = "id_usuario") Long usuarioId) throws UsuarioNotFoundException {
        return usuarioRepository.findById(usuarioId).orElseThrow(() -> new UsuarioNotFoundException(usuarioId));
    }

    // Actualizar usuarios
    @PutMapping("/usuario/{id_usuario}")
    public Usuario updateUsuario(@PathVariable(value = "id_usuario") Long usuarioId, @Valid @RequestBody Usuario usuarioDetalles) throws UsuarioNotFoundException {

        Usuario usuario = usuarioRepository.findById(usuarioId).orElseThrow(() -> new UsuarioNotFoundException(usuarioId));

        usuario.setApellidos(usuarioDetalles.getApellidos());
        usuario.setNombres(usuarioDetalles.getNombres());
        usuario.setDpi(usuarioDetalles.getDpi());
        usuario.setCorreo(usuarioDetalles.getCorreo());
        usuario.setContrasena(usuarioDetalles.getContrasena());
        usuario.setId_jerarquia(usuarioDetalles.getId_jerarquia());

        Usuario updatedUsuario = usuarioRepository.save(usuario);
        return updatedUsuario;

    }




}
