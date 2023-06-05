package com.airnewandorra.models;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author minak
 */
public class Destino {
    private static final AtomicInteger count = new AtomicInteger(0); 
    private final int id;
    String nombreDestino;

    public Destino(String nombreDestino) {
        this.id = count.incrementAndGet();
        this.nombreDestino = nombreDestino;
    }

    public int getId() {
        return id;
    }

    public String getNombreDestino() {
        return nombreDestino;
    }

    public void setNombreDestino(String nombreDestino) {
        this.nombreDestino = nombreDestino;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 13 * hash + this.id;
        hash = 13 * hash + Objects.hashCode(this.nombreDestino);
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
        final Destino other = (Destino) obj;
        if (this.id != other.id) {
            return false;
        }
        return Objects.equals(this.nombreDestino, other.nombreDestino);
    }
    
}
