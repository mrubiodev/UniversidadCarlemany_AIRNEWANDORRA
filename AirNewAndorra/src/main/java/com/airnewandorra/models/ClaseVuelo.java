package com.airnewandorra.models;

import com.airnewandorra.enums.Clases;


/**
 * @author minak
 */
public class ClaseVuelo {
  private final int id;
  private String nombre;
  private double precio;
  private double precioCancelacion;

  public ClaseVuelo(int id, Clases clase, double precio, double precioCancelacion) {
    this.id = id;
    this.nombre = clase.name();
    this.precio = precio;
    this.precioCancelacion = precioCancelacion;
  }

  public int getId() {
    return id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(Clases clase) {
    this.nombre = clase.name();
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
