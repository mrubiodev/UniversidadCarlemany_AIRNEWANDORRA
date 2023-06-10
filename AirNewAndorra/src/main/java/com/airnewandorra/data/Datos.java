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

  /**
   * Este método devuelve la lista de destinos en una array de String con formato "ID - Nombre del destino"
   * 
   */
  public void MostrarDestinos() {
  }

  /**
   * Este método devuelve la lista de destinos en una array de String con formato "ID - Nombre de la clase"
   * 
   */
  public void MostrarClases() {
  }

  /**
   * Este método dado un nuevo pasajero y lo añade a la lista de pasajeros
   * @param nuevoPasajero
   */
  public void nuevoPasajero(Pasajero nuevoPasajero) {
  }

  /**
   * Este método devuelve la lista de pasajeros en una array de String con formato "ID - Nombre Apellido"
   * @return
   */
  public String[] getlistaPasajeros() {
    final String[] pasajerosEnSistema = { "1 - Pepe", "2 - Juan", "3 - Maria" };
    return pasajerosEnSistema;
  }

  /**
   * Este método devuelve un objeto de tipo Pasajero dado un ID
   * @param id
   * @return
   */
  public Pasajero returnPasajeroObjById(int id) {
    
      final Pasajero pasajeroByID = new Pasajero("Pedro Perez Salazar","12345678A","PAS23467hkj","695758586","lennycarl@gmail.com","Bizkaia", "España","68892346",null);
      return pasajeroByID;
  }
}
