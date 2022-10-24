package com.Analisis.QuejasAPI.exception;

public class JerarquiaNotFoundException extends Exception {
    private long jerarquia_id;


    public JerarquiaNotFoundException(long jerarquia_id) {
        super(String.format("Jerarquia no existe según el ID: '%s'", jerarquia_id));

    }
}
