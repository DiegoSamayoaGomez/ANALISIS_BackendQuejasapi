package com.Analisis.QuejasAPI.exception;

import com.Analisis.QuejasAPI.model.Usuario;

public class UsuarioNotFoundException extends Exception{
    private long usuarioId;

    public UsuarioNotFoundException(long usuarioId){
        super(String.format("Usuario no existe según el ID:  '%s'", usuarioId));
    }

}
