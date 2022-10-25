package com.Analisis.QuejasAPI.exception;

import com.Analisis.QuejasAPI.model.Usuario;

public class UsuarioNotFoundException extends Exception{
    private long usuario_id;

    public UsuarioNotFoundException(long usuario_id){
        super(String.format("Usuario no existe según el ID:  '%s'", usuario_id));
    }

}
