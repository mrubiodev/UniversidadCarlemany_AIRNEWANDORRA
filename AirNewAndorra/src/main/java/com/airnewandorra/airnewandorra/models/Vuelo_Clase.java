/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.airnewandorra.airnewandorra.models;

import java.util.Objects;

/**
 *
 * @author minak
 */
public class Vuelo_Clase {
    private Vuelo vuelo;
    private ClaseVuelo claseVuelos;
    private float precio;
    private float precioCancelacion;

    public Vuelo_Clase(Vuelo vuelo, ClaseVuelo claseVuelos, float precio, float precioCancelacion) {
        this.vuelo = vuelo;
        this.claseVuelos = claseVuelos;
        this.precio = precio;
        this.precioCancelacion = precioCancelacion;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public ClaseVuelo getClaseVuelos() {
        return claseVuelos;
    }

    public void setClaseVuelos(ClaseVuelo claseVuelos) {
        this.claseVuelos = claseVuelos;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getPrecioCancelacion() {
        return precioCancelacion;
    }

    public void setPrecioCancelacion(float precioCancelacion) {
        this.precioCancelacion = precioCancelacion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.vuelo);
        hash = 47 * hash + Objects.hashCode(this.claseVuelos);
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
        final Vuelo_Clase other = (Vuelo_Clase) obj;
        if (!Objects.equals(this.vuelo, other.vuelo)) {
            return false;
        }
        return Objects.equals(this.claseVuelos, other.claseVuelos);
    }
    
}
