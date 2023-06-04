package com.airnewandorra.airnewandorra.models;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author minak
 */
public class ClaseVuelo {
    private static final AtomicInteger count = new AtomicInteger(0); 
    private final int id;
    private String nombre;
    
    public ClaseVuelo(String nombre, float precio,float precioCancelacion) {
        this.id = count.incrementAndGet();
        this.nombre = nombre;

    }

    public int getId() {
        return id;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.id;
        hash = 29 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ClaseVuelo other = (ClaseVuelo) obj;
        return Objects.equals(this.nombre, other.nombre);
    }
  
}
