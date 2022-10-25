package com.Analisis.QuejasAPI.model;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "categoria")
public class Categoria {

    @Id
    @GeneratedValue
    private Long id_categoria;

    @NotBlank
    private String nombre_categoria;

    @NotBlank
    private String departamento;


    public Categoria(){
        super();
    }

    public Categoria(Long id_categoria, String nombre_categoria, String departamento) {
        this.id_categoria = id_categoria;
        this.nombre_categoria = nombre_categoria;
        this.departamento = departamento;
    }

    public Long getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(Long id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getNombre_categoria() {
        return nombre_categoria;
    }

    public void setNombre_categoria(String nombre_categoria) {
        this.nombre_categoria = nombre_categoria;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }


}
