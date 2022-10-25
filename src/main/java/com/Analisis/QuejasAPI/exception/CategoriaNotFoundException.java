package com.Analisis.QuejasAPI.exception;

public class CategoriaNotFoundException extends Exception {
    private long categoriaId;

    public CategoriaNotFoundException(long categoriaId) {
        super(String.format("Categoria no existe según el ID: '%s'", categoriaId));
    }
}
