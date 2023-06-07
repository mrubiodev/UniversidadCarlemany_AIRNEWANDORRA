package com.airnewandorra.models;

import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author VM_Mainak
 */
public class Vuelo {
  private static final AtomicInteger count = new AtomicInteger(0);
  private final int id;
  private Origen aeropuertoOrigen;
  private Destino aeropuertoDestino;
  private String horaSalida;
  private String horaLlegada;
  private double duracion; //minutos
  private Date fechaVuelo;
  private TipoAvion tipoAvion;
  private int numMaxPasajeros;
  private int numMinPasajeros;


 public Vuelo(Origen aeropuertoOrigen, Destino aeropuertoDestino, String horaSalida, String horaLlegada, double duracion, Date fechaVuelo, TipoAvion tipoAvion, int numMaxPasajeros, int numMinPasajeros) {
    this.id = count.incrementAndGet();
    this.aeropuertoOrigen = aeropuertoOrigen;
    this.aeropuertoDestino = aeropuertoDestino;
    this.horaSalida = horaSalida;
    this.horaLlegada = horaLlegada;
    this.duracion = duracion;
    this.fechaVuelo = fechaVuelo;
    this.tipoAvion = tipoAvion;
    this.numMaxPasajeros = numMaxPasajeros;
    this.numMinPasajeros = numMinPasajeros;
  }

  public int getId() {
    return id;
  }

  public Origen getAeropuertoOrigen() {
    return aeropuertoOrigen;
  }

  public void setAeropuertoOrigen(Origen aeropuertoOrigen) {
    this.aeropuertoOrigen = aeropuertoOrigen;
  }

  public Destino getAeropuertoDestino() {
    return aeropuertoDestino;
  }

  public void setAeropuertoDestino(Destino aeropuertoDestino) {
    this.aeropuertoDestino = aeropuertoDestino;
  }

  public String getHoraSalida() {
    return horaSalida;
  }

  public void setHoraSalida(String horaSalida) {
    this.horaSalida = horaSalida;
  }

  public String getHoraLlegada() {
    return horaLlegada;
  }

  public void setHoraLlegada(String horaLlegada) {
    this.horaLlegada = horaLlegada;
  }

  public double getDuracion() {
    return duracion;
  }

  public void setDuracion(double duracion) {
    this.duracion = duracion;
  }

  public Date getFechaVuelo() {
    return fechaVuelo;
  }

  public void setFechaVuelo(Date fechaVuelo) {
    this.fechaVuelo = fechaVuelo;
  }

  public TipoAvion getTipoAvion() {
    return this.tipoAvion;
  }

  public void setTipoAvion(TipoAvion tipoAvion) {
    this.tipoAvion = tipoAvion;
  }

  public int getNumMaxPasajeros() {
    return numMaxPasajeros;
  }

  public void setNumMaxPasajeros(int numMaxPasajeros) {
    this.numMaxPasajeros = numMaxPasajeros;
  }

  public int getNumMinPasajeros() {
    return numMinPasajeros;
  }

  public void setNumMinPasajeros(int numMinPasajeros) {
    this.numMinPasajeros = numMinPasajeros;
  }
}
