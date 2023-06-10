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

  private void modificarPasajeros(listaPasajeros){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese el número de DNI del pasajero que desea modificar: ");
    String dni = scanner.nextLine();
    boolean encontrado = false;

    for (Pasajero pasajero : listaPasajeros) {
      if (pasajero.getDni().equals(dni)) {
        encontrado = true;

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {

          System.out.println("Datos actuales del pasajero:");
          System.out.println("1 Nombre y apellidos: " + pasajero.getNombreApellido());
          System.out.println("2 DNI: " + pasajero.getDni());
          System.out.println("3 Pasaporte: " + pasajero.getPasaporte());
          System.out.println("4 Fecha de nacimiento: " + pasajero.getFechaNacimiento());
          System.out.println("5 Teléfono: " + pasajero.getTelefono());
          System.out.println("6 Email: " + pasajero.getCorreo());
          System.out.println("7 Provincia: " + pasajero.getProvincia());
          System.out.println("8 País: " + pasajero.getPais());
          System.out.println("9 Contacto de emergencia: " + pasajero.getContactoDeEmergencia());
          System.out.println("10 Salir: " + pasajero.getContactoDeEmergencia());
          System.out.print("Ingrese una opción: ");

          opcion = scanner.nextInt();

          switch (opcion) {
            case 1:
              System.out.print("Ingrese el nuevo nombre y apellidos del pasajero: ");
              String nuevoNombre = scanner.nextLine();
              scanner.nextLine(); // Limpia el buffer
              pasajero.setNombreApellido(nuevoNombre);
              System.out.println("Datos del pasajero actualizados con éxito.");

            case 2:
              System.out.print("Ingrese el nuevo DNI del pasajero: ");
              String nuevoDNI = scanner.nextLine();
              scanner.nextLine(); // Limpia el buffer
              pasajero.setDni(nuevoDNI);
              System.out.println("Datos del pasajero actualizados con éxito.");

            case 3:
              System.out.print("Ingrese el nuevo pasaporte del pasajero: ");
              String nuevoPasaporte = scanner.nextLine();
              scanner.nextLine(); // Limpia el buffer
              pasajero.setPasaporte(nuevoPasaporte);
              System.out.println("Datos del pasajero actualizados con éxito.");

            case 4:
              System.out.print("Ingrese la nueva fecha de nacimiento del pasajero: ");
              String nuevaFechaNacimiento = scanner.nextLine();
              scanner.nextLine(); // Limpia el buffer
              pasajero.setFechaNacimiento(nuevaFechaNacimiento);
              System.out.println("Datos del pasajero actualizados con éxito.");

            case 5:
              System.out.print("Ingrese el nuevo teléfono del pasajero: ");
              String nuevoTelefono = scanner.nextLine();
              scanner.nextLine(); // Limpia el buffer
              pasajero.setTelefono(nuevoTelefono);
              System.out.println("Datos del pasajero actualizados con éxito.");

            case 6:
              System.out.print("Ingrese el nuevo correo: ");
              String nuevoCorreo = scanner.nextLine();
              scanner.nextLine(); // Limpia el buffer
              pasajero.setCorreo(nuevoCorreo);
              System.out.println("Datos del pasajero actualizados con éxito.");

            case 7:
              System.out.print("Ingrese la nueva provincia del pasajero: ");
              String nuevaProvincia = scanner.nextLine();
              scanner.nextLine(); // Limpia el buffer
              pasajero.setProvincia(nuevaProvincia);
              System.out.println("Datos del pasajero actualizados con éxito.");

            case 8:
              System.out.print("Ingrese el nuevo pais: ");
              String nuevoPais = scanner.nextLine();
              scanner.nextLine(); // Limpia el buffer
              pasajero.setPais(nuevoPais);
              System.out.println("Datos del pasajero actualizados con éxito.");

            case 9:
              System.out.print("Ingrese el nuevo pais: ");
              String nuevoContactoDeEmergencia = scanner.nextLine();
              scanner.nextLine(); // Limpia el buffer
              pasajero.setContactoDeEmergencia(nuevoContactoDeEmergencia);
              System.out.println("Datos del pasajero actualizados con éxito.");

            case 10:
              System.out.print("Ha seleccionado 'Salir' ");
              break;

            default:
              System.out.print("Opción no válida. Inténtelo de nuevo");

          }
        } while (opcion!=10);

        scanner.close();

          /*
          // Solicitar los nuevos datos
          System.out.print("Ingrese el nuevo nombre del pasajero: ");
          String nuevoNombre = scanner.nextLine();
          System.out.print("Ingrese la nueva edad del pasajero: ");
          int nuevaEdad = scanner.nextInt();
          scanner.nextLine(); // Limpia el buffer

          // Actualizar los datos del pasajero
          pasajero.setNombre(nuevoNombre);
          pasajero.setEdad(nuevaEdad);

          System.out.println("Datos del pasajero actualizados con éxito.");
          break;

           */


      }

  private void modificarDestinos(){

  }

  private void origen (){


  }

  private void vuelo_clase(){

  }



}

