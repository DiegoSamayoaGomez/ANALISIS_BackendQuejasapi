package com.Analisis.QuejasAPI.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue
    private Long id_usuario;
    @NotBlank
    private  String apellidos;
    @NotBlank
    private String nombres;
    @NotBlank
    private String dpi;
    @NotBlank
    private  String correo;
    @NotBlank
    private  String contrasena;

    private Long id_jerarquia;

    public Usuario(){
        super();
    }

    public Usuario(Long id_usuario, String apellidos, String nombres, String dpi, String correo, String contrasena, Long id_jerarquia) {
        super();
        this.id_usuario = id_usuario;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.dpi = dpi;
        this.correo = correo;
        this.contrasena = contrasena;
        this.id_jerarquia = id_jerarquia;
    }

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Long getId_jerarquia() {
        return id_jerarquia;
    }

    public void setId_jerarquia(Long id_jerarquia) {
        this.id_jerarquia = id_jerarquia;
    }
}
