/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.airnewandorra.airnewandorra.models;

import java.text.SimpleDateFormat;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Date;
import java.text.SimpleDateFormat;
/**
 *
 * @author minak
 */
public class Pasajero_Vuelo {
    private static final AtomicInteger count = new AtomicInteger(0); 
    private final int id;
    private Vuelo    vuelo;
    private Pasajero pasajero;
    private ClaseVuelo clase;
    private final String fechaReserva;
    private final String horaReserva;
    private boolean equipajeMano;
    private boolean equipajeBodega;
    private boolean mascota;
    private boolean reservaConfirmada;
    private boolean reservaAnulada;

    public Pasajero_Vuelo(Vuelo vuelo, Pasajero pasajero, ClaseVuelo clase, boolean equipajeMano, boolean equipajeBodega, boolean mascota) {
        this.id = count.incrementAndGet();
        this.vuelo = vuelo;
        this.pasajero = pasajero;
        this.clase = clase;
        this.fechaReserva = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        this.horaReserva = new SimpleDateFormat("hh:mm:ss").format(new Date());
        this.equipajeMano = equipajeMano;
        this.equipajeBodega = equipajeBodega;
        this.mascota = mascota;
        this.reservaAnulada = false;
        this.reservaConfirmada= false;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public ClaseVuelo getClase() {
        return clase;
    }

    public void setClase(ClaseVuelo clase) {
        this.clase = clase;
    }

    public boolean isEquipajeMano() {
        return equipajeMano;
    }

    public void setEquipajeMano(boolean equipajeMano) {
        this.equipajeMano = equipajeMano;
    }

    public boolean isEquipajeBodega() {
        return equipajeBodega;
    }

    public void setEquipajeBodega(boolean equipajeBodega) {
        this.equipajeBodega = equipajeBodega;
    }

    public boolean isMascota() {
        return mascota;
    }

    public void setMascota(boolean mascota) {
        this.mascota = mascota;
    }

    public boolean isReservaConfirmada() {
        return reservaConfirmada;
    }

    public void setReservaConfirmada(boolean reservaConfirmada) {
        this.reservaConfirmada = reservaConfirmada;
    }

    public boolean isReservaAnulada() {
        return reservaAnulada;
    }

    public void setReservaAnulada(boolean reservaAnulada) {
        this.reservaAnulada = reservaAnulada;
    }

    public int getId() {
        return id;
    }

    public String getFechaReserva() {
        return fechaReserva;
    }

    public String getHoraReserva() {
        return horaReserva;
    }
    
    
    
}
