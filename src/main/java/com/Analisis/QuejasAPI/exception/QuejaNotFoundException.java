package com.Analisis.QuejasAPI.exception;

public class QuejaNotFoundException extends Exception {
    private long quejaId;

    public QuejaNotFoundException(long quejaId) {
        super(String.format("Queja no existe según la ID: '%s' ", quejaId));
    }
}
