package com.airnewandorra.enums;

/**
 * @author David Salazar
 */
public enum Clases {
  ECONOMIC("Economic"),
  BUSINESS("Business"),
  FIRST("First");

  private final String clase;

  Clases(String clase) {
    this.clase = clase;
  }

  public String getClase() {
    return clase;
  }
}
