package com.airnewandorra.airnewandorra.models;

import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author VM_Mainak
 */
public class Vuelo {
    private static final AtomicInteger count = new AtomicInteger(0); 
    private final int id;
    private String aeropuertoOrigen;
    private String aeropuertoDestino;
    private String tipoVuelo;
    private Date fechaVuelo;
    private int numMaxPasajeros;
    private Date horaLlegada;
    private Date horaSalida;  
    private ClaseVuelo clase;

    public Vuelo(String aeropuertoOrigen, String aeropuertoDestino, String tipoVuelo, Date fechaVuelo, int numMaxPasajeros, Date horaLlegada, Date horaSalida, ClaseVuelo clase) {
        this.id = count.incrementAndGet();
        this.aeropuertoOrigen = aeropuertoOrigen;
        this.aeropuertoDestino = aeropuertoDestino;
        this.tipoVuelo = tipoVuelo;
        this.fechaVuelo = fechaVuelo;
        this.numMaxPasajeros = numMaxPasajeros;
        this.horaLlegada = horaLlegada;
        this.horaSalida = horaSalida;
        this.clase = clase;
    }

    public int getId() {
        return id;
    }

    public String getAeropuertoOrigen() {
        return aeropuertoOrigen;
    }

    public void setAeropuertoOrigen(String aeropuertoOrigen) {
        this.aeropuertoOrigen = aeropuertoOrigen;
    }

    public String getAeropuertoDestino() {
        return aeropuertoDestino;
    }

    public void setAeropuertoDestino(String aeropuertoDestino) {
        this.aeropuertoDestino = aeropuertoDestino;
    }

    public String getTipoVuelo() {
        return tipoVuelo;
    }

    public void setTipoVuelo(String tipoVuelo) {
        this.tipoVuelo = tipoVuelo;
    }

    public Date getFechaVuelo() {
        return fechaVuelo;
    }

    public void setFechaVuelo(Date fechaVuelo) {
        this.fechaVuelo = fechaVuelo;
    }

    public int getNumMaxPasajeros() {
        return numMaxPasajeros;
    }

    public void setNumMaxPasajeros(int numMaxPasajeros) {
        this.numMaxPasajeros = numMaxPasajeros;
    }

    public Date getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(Date horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public Date getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Date horaSalida) {
        this.horaSalida = horaSalida;
    }

    public ClaseVuelo getClase() {
        return clase;
    }

    public void setClase(ClaseVuelo clase) {
        this.clase = clase;
    }
    
 

}
