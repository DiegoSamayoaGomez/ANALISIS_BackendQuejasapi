package com.Analisis.QuejasAPI.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "quejas")
public class Queja {

    @Id
    @GeneratedValue
    private Long id_queja;

    @NotBlank
    private String descripcion;

    @NotBlank
    private String imagen;

    @NotBlank
    private String estado;

    private Long id_categoria;

    private Long id_usuario;

    public Queja() {
        super();
    }

    public Queja(Long id_queja, String descripcion, String imagen, String estado, Long id_categoria, Long id_usuario) {
        this.id_queja = id_queja;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.estado = estado;
        this.id_categoria = id_categoria;
        this.id_usuario = id_usuario;
    }

    public Long getId_queja() {
        return id_queja;
    }

    public void setId_queja(Long id_queja) {
        this.id_queja = id_queja;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Long getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(Long id_categoria) {
        this.id_categoria = id_categoria;
    }

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

}
