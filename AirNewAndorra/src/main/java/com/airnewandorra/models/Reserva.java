package com.airnewandorra.models;

import com.airnewandorra.enums.Clases;
import com.airnewandorra.enums.Equipaje;
import com.airnewandorra.enums.Estado;

/**
 * @author David Salazar
 */
public class Reserva {
  private int id;
  private Vuelo vuelo;
  private Clases claseVuelo;
  private Pasajero pasajero;
  private String fechaReserva; //con hora dd/MM/yyyy HH:mm
  private Equipaje equipaje; // Mano, facturado, ambos
  private boolean mascota;
  private Estado estado; // Confirmado, cancelado

  public Reserva(){}
  
  public Reserva(int id, Vuelo vuelo, Clases claseVuelo, Pasajero pasajero, String fechaReserva, Equipaje equipaje, boolean mascota, Estado estado) {
    this.id = id;
    this.vuelo = vuelo;
    this.claseVuelo = claseVuelo;
    this.pasajero = pasajero;
    this.fechaReserva = fechaReserva;
    this.equipaje = equipaje;
    this.mascota = mascota;
    this.estado = estado;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Vuelo getVuelo() {
    return vuelo;
  }

  public void setVuelo(Vuelo vuelo) {
    this.vuelo = vuelo;
  }

  public Clases getClaseVuelo() {
    return claseVuelo;
  }

  public void setClaseVuelo(Clases claseVuelo) {
    this.claseVuelo = claseVuelo;
  }

  public Pasajero getPasajero() {
    return pasajero;
  }

  public void setPasajero(Pasajero pasajero) {
    this.pasajero = pasajero;
  }

  public String getFechaReserva() {
    return fechaReserva;
  }

  public void setFechaReserva(String fechaReserva) {
    this.fechaReserva = fechaReserva;
  }

  public Equipaje getEquipaje() {
    return equipaje;
  }

  public void setEquipaje(Equipaje equipaje) {
    this.equipaje = equipaje;
  }

  public boolean isMascota() {
    return mascota;
  }

  public void setMascota(boolean mascota) {
    this.mascota = mascota;
  }

  public Estado getEstado() {
    return estado;
  }

  public void setEstado(Estado estado) {
    this.estado = estado;
  }
}
