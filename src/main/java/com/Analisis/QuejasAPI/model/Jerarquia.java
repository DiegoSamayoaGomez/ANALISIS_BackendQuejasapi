package com.Analisis.QuejasAPI.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "jerarquia")
public class Jerarquia {
    @Id
    @GeneratedValue
    private Long id_jerarquia;
    @NotBlank
    private String nombre;

    public Jerarquia() {
        super();
    }

    public Jerarquia(Long id_jerarquia, String nombre) {
        super();
        this.id_jerarquia = id_jerarquia;
        this.nombre = nombre;
    }

    public Long getId_jerarquia() {
        return id_jerarquia;
    }

    public void setId_jerarquia(Long id_jerarquia) {
        this.id_jerarquia = id_jerarquia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
