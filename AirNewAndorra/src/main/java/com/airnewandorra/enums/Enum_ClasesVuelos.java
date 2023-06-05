package com.airnewandorra.enums;

/**
 * @author David Salazar
 */
public enum Enum_ClasesVuelos {
  ECONOMIC("Economic"),
  BUSINESS("Business"),
  FIRST("First");

  private final String clase;

  Enum_ClasesVuelos(String clase) {
    this.clase = clase;
  }

  public String getClase() {
    return clase;
  }
}
