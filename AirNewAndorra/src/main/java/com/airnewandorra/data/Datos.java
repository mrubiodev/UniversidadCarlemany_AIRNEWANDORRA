/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.airnewandorra.data;

import com.airnewandorra.enums.Enum_ClasesVuelos;
import com.airnewandorra.models.ClaseVuelo;
import com.airnewandorra.models.Destino;
import com.airnewandorra.models.Pasajero;
import com.airnewandorra.models.Pasajero_Vuelo;
import com.airnewandorra.models.Vuelo;
import com.airnewandorra.models.Vuelo_Clase;

import java.util.ArrayList;
import java.util.List;

/**
 * @author minak
 */
public class Datos {

  private List<Pasajero> listaPasajeros = new ArrayList<>();
  private List<ClaseVuelo> listaClases = new ArrayList<>();
  private List<Destino> listaDestinos = new ArrayList<>();
  private List<Vuelo_Clase> listaClasesVuelo = new ArrayList<>();
  private List<Vuelo> listaVuelos = new ArrayList<>();
  private List<Pasajero_Vuelo> listaPasajerosVuelo = new ArrayList<>();

  public Datos() {
    crearClasesVuelos();
    crearDestinos();
  }

  private void crearClasesVuelos() {
    // Recorremos el enum de clases de vuelo
    for (Enum_ClasesVuelos clase : Enum_ClasesVuelos.values()) {
      // Creamos un objeto de la clase ClaseVuelo
      ClaseVuelo claseVuelo = new ClaseVuelo(clase.getClase());
      // Añadimos el objeto a la lista de clases de vuelo
      listaClases.add(claseVuelo);
    }
  }

  private void crearDestinos() {
    String[] destinos = {"Madrid", "Barcelona", "Bilbao", "Sevilla"};
    for (String destino : destinos) {
      Destino destinoObj = new Destino(destino);
      listaDestinos.add(destinoObj);
    }
  }

}
