package com.airnewandorra.models;


import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author minak
 */
public class Origen {
  private static final AtomicInteger count = new AtomicInteger(0);
  private final int id;
  String nombreOrigen;

  public Origen(String nombreOrigen) {
    this.id = count.incrementAndGet();
    this.nombreOrigen = nombreOrigen;
  }

  public int getId() {
    return id;
  }

  public String getNombreOrigen() {
    return nombreOrigen;
  }

  public void setNombreDestino(String nombreOrigen) {
    this.nombreOrigen = nombreOrigen;
  }

  @Override
  public int hashCode() {
    int hash = 3;
    hash = 13 * hash + this.id;
    hash = 13 * hash + Objects.hashCode(this.nombreOrigen);
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
    final Origen other = (Origen) obj;
    if (this.id != other.id) {
      return false;
    }
    return Objects.equals(this.nombreOrigen, other.nombreOrigen);
  }

}
