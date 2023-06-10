package com.airnewandorra.models;

import com.airnewandorra.enums.Enum_ClasesVuelos;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author minak
 */
public class ClaseVuelo {
  private static final AtomicInteger count = new AtomicInteger(0);
  private final int id;
  private Enum_ClasesVuelos nombre;
  private double precio;
  private double precioCancelacion;

  public ClaseVuelo(int id, Enum_ClasesVuelos nombre, double precio, double precioCancelacion) {
    this.id = id;
    this.nombre = nombre;
    this.precio = precio;
    this.precioCancelacion = precioCancelacion;
  }

  public int getId() {
    return id;
  }

  public Enum_ClasesVuelos getNombre() {
    return nombre;
  }

  public void setNombre(Enum_ClasesVuelos nombre) {
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
