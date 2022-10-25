package com.Analisis.QuejasAPI.exception;

public class JerarquiaNotFoundException extends Exception {
    private long jerarquiaId;


    public JerarquiaNotFoundException(long jerarquiaId) {
        super(String.format("Jerarquia no existe según el ID: '%s'", jerarquiaId));

    }
}
