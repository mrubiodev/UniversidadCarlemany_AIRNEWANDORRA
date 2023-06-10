package com.airnewandorra.enums;

public enum Equipaje {
  MANO("Mano"),
  FACTURADO("Facturado"),
  AMBOS("Ambos");

  private String equipaje;

  private Equipaje(String equipaje) {
    this.equipaje = equipaje;
  }
}
