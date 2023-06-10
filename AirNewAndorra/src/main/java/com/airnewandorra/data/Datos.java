/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.airnewandorra.data;

import com.airnewandorra.enums.Clases;
import com.airnewandorra.models.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

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
  private List<Vuelo> listaVuelos = new ArrayList<>();


  public Datos() {
    crearClasesVuelos();
    crearDestinos();
    crearOrigenes();
    crearPasajeros();
  }

  public List<Pasajero> getListaPasajeros() {
    return listaPasajeros;
  }

  private void crearClasesVuelos() {
    ClaseVuelo clase1 = new ClaseVuelo(1, Clases.ECONOMIC, 100, 50);
    ClaseVuelo clase2 = new ClaseVuelo(2, Clases.BUSINESS, 200, 100);
    ClaseVuelo clase3 = new ClaseVuelo(3, Clases.FIRST, 300, 150);

    ClaseVuelo[] clases = {clase1, clase2, clase3};
    listaClases.addAll(Arrays.asList(clases));
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
  
  private void crearPasajeros() {
    Pasajero pasajero1 = new Pasajero("Pedro Perez Salazar","12345678A","PAS23467hkj","695758586","lennycarl@gmail.com","Bizkaia", "España","68892346","14/03/1995");
    Pasajero pasajero2 = new Pasajero("Ana Ruiz","12785938C","PAS23467hkj","695758586","lennycarl@gmail.com","Bizkaia", "España","68892346","14/03/1995");
    Pasajero pasajero3 = new Pasajero("Daniel Gonzalez","78954235E","PAS23467hkj","695758586","lennycarl@gmail.com","Bizkaia", "España","68892346","14/03/1995");

    Pasajero[] pasajeros = {pasajero1, pasajero2, pasajero3};
    listaPasajeros.addAll(Arrays.asList(pasajeros));
  }

  /**
   * Este método devuelve la lista de destinos en una array de String con formato "ID - Nombre del destino"
   */
  public void MostrarDestinos() {
    for (Destino destino : listaDestinos) {
      System.out.println(destino.getId() + " - " + destino.getNombreDestino());
    }
  }

  public void MostrarOrigenes() {
    for (Origen origen : listaOrigenes) {
      System.out.println(origen.getId() + " - " + origen.getNombreOrigen());
    }
  }

  /**
   * Este método devuelve la lista de clases en una array de String con formato "ID - Nombre de la clase"
   */
  public void MostrarClases() {
    for (ClaseVuelo clase : listaClases) {
      System.out.println(clase.getId() + " - " + clase.getNombre());
    }
  }

  /**
   * Este método dado un nuevo pasajero y lo añade a la lista de pasajeros
   *
   * @param nuevoPasajero
   */
  public void nuevoPasajero(Pasajero nuevoPasajero) {
    listaPasajeros.add(nuevoPasajero);
  }

  /**
   * Este método devuelve la lista de pasajeros en una array de String con formato "ID - Nombre Apellido"
   *
   * @return
   */
  public String[] getlistaPasajeros() {
    String[] listaPasajerosString = new String[listaPasajeros.size()];
    int i = 0;
    for (Pasajero pasajero : listaPasajeros) {
      listaPasajerosString[i] = pasajero.getID() + " - " + pasajero.getNombreApellido();
      i++;
    }
    return listaPasajerosString;
  }

  /**
   * Este método devuelve un objeto de tipo Pasajero dado un ID
   *
   * @param id
   * @return
   */
  public Pasajero returnPasajeroObjById(int id) {
    Pasajero pasajero = null;
    for (Pasajero pasajero1 : listaPasajeros) {
      if (pasajero1.getID() == id) {
        pasajero = pasajero1;
      }
    }
    return pasajero;
  }


  /**
   *  Esta funcion rellena las listas de la aplicacion con datos de prueba
   */
  public void modoDemo() {

  }

  /**
   * Mostrara todo los campos del pasajero
   * @param pasajeroSeleccionado
   */
  public void mostrarDatosPasajeroByObj(Pasajero pasajeroSeleccionado) {
  }

  /**
   * Recibe un pasajero modificado se tiene que buscar en la lista por el id que es el unico campo que no se puede cambiar y modificar un objeto de la lista por el nuevo que se recibe
   * @param pasajeroModificador
   */
  public void modificarPasajerosByObj(Pasajero pasajeroModificador) {

  }

  /**
   * Mostara todos los vuelos y sus datos mas relevantes
   */
  public void MostrarVuelos() {
  }

  /**
   *  Este método dado un nuevo vuelo y lo añade a la lista de vuelos
   * @param nuevoVuelo
   */
  public void nuevoVuelo(Vuelo nuevoVuelo) {
  }


  /**
   * Imprime la lista de pasajeros de un vuelo en concreto
   * @param vueloSeleccionado
   */
  public void mostarListaPasajerosVuelo(Vuelo vueloSeleccionado) {
  }

  /**
   * * Este método devuelve un objeto de tipo Vuelo dado un ID
   * @param option
   * @return
   */
  public Vuelo returnVueloObjById(int option) {
    return null;
  }

  /**
   * Este método devuelve la lista de vuelos en una array de String con formato "ID - Origen -> Destino - fechaVuelo - horaSalida -> horaLlegada "
   *
   * @return
   */
  public String[] getlistaVuelos() {
    return null;
  }

  /**
   * Este metodo recibe un objeto vuelo que tiene que ser borrado de la lista.
   * @param vueloSeleccionado
   */
  public void BorrarVuelo(Vuelo vueloSeleccionado) {
  }
}