package com.airnewandorra.enums;

public enum Estado {
  CONFIRMADO("Confirmado"),
  CANCELADO("Cancelado");

  private String estado;

  private Estado(String estado) {
    this.estado = estado;
  }
}
