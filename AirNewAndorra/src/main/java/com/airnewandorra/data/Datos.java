/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.airnewandorra.data;

import com.airnewandorra.enums.Enum_ClasesVuelos;
import com.airnewandorra.models.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Esta clase crea los datos iniciales de la aplicación.
 *
 * @author minak
 */
public class Datos {

  private List<Pasajero> listaPasajeros = new ArrayList<>();
  private List<ClaseVuelo> listaClases = new ArrayList<>();
  private List<Destino> listaDestinos = new ArrayList<>();
  private List<Origen> listaOrigenes = new ArrayList<>();
  private List<Vuelo_Clase> listaClasesVuelo = new ArrayList<>();
  private List<Vuelo> listaVuelos = new ArrayList<>();
  private List<Pasajero_Vuelo> listaPasajerosVuelo = new ArrayList<>();

  public Datos() {
    crearClasesVuelos();
    crearDestinos();
    crearOrigenes();
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
    Destino destino1 = new Destino("Madrid");
    Destino destino2 = new Destino("Barcelona");
    Destino destino3 = new Destino("Bilbao");
    Destino destino4 = new Destino("Sevilla");

    Destino[] destinos = {destino1, destino2, destino3, destino4};
    listaDestinos.addAll(Arrays.asList(destinos));
  }

  private void crearOrigenes() {
    Origen origen1 = new Origen("Andorra");
    Origen origen2 = new Origen("Toulouse");
    Origen origen3 = new Origen("Lleida");
    Origen origen4 = new Origen("Barcelona");

    Origen[] origenes = {origen1, origen2, origen3, origen4};
    listaOrigenes.addAll(Arrays.asList(origenes));
  }

  public void MostrarDestinos() {
  }

  public void MostrarClases() {
  }
}
