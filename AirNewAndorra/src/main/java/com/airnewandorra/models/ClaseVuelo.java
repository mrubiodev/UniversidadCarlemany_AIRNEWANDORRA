package com.airnewandorra.models;

import com.airnewandorra.enums.Clases;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author minak
 */
public class ClaseVuelo {
  private final int id;
  private Clases nombre;
  private double precio;
  private double precioCancelacion;

  public ClaseVuelo(int id, Clases nombre, double precio, double precioCancelacion) {
    this.id = id;
    this.nombre = nombre;
    this.precio = precio;
    this.precioCancelacion = precioCancelacion;
  }

  public int getId() {
    return id;
  }

  public Clases getNombre() {
    return nombre;
  }

  public void setNombre(Clases nombre) {
    this.nombre = nombre;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public double getPrecioCancelacion() {
    return precioCancelacion;
  }

  public void setPrecioCancelacion(double precioCancelacion) {
    this.precioCancelacion = precioCancelacion;
  }
}
