/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.airnewandorra.data;

import com.airnewandorra.enums.*;
import com.airnewandorra.models.*;
import com.airnewandorra.utils.Utils;

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

    Scanner sc = new Scanner(System.in);
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
        Pasajero pasajero1 = new Pasajero("Pedro Perez Salazar", "12345678A", "PAS23467hkj", "695758586", "lennycarl@gmail.com", "Bizkaia", "España", "68892346", "14/03/1995");
        Pasajero pasajero2 = new Pasajero("Ana Ruiz", "12785938C", "PAS23467hkj", "695758586", "lennycarl@gmail.com", "Bizkaia", "España", "68892346", "14/03/1995");
        Pasajero pasajero3 = new Pasajero("Daniel Gonzalez", "78954235E", "PAS23467hkj", "695758586", "lennycarl@gmail.com", "Bizkaia", "España", "68892346", "14/03/1995");

        Pasajero[] pasajeros = {pasajero1, pasajero2, pasajero3};
        listaPasajeros.addAll(Arrays.asList(pasajeros));
    }

    /**
     * Este método devuelve la lista de destinos en una array de String con
     * formato "ID - Nombre del destino"
     */
    public void MostrarDestinos() {
        for (Destino destino : listaDestinos) {
            System.out.println("\t" + destino.getId() + " - " + destino.getNombreDestino());
        }
    }

    private void MostrarTiposAvion() {
        for (TipoAvion tipo : TipoAvion.values()) {
            System.out.println("\t" + tipo.name());
        }
    }

    public void MostrarOrigenes() {
        for (Origen origen : listaOrigenes) {
            System.out.println("\t" + origen.getId() + " - " + origen.getNombreOrigen());
        }
    }

    /**
     * Este método devuelve la lista de clases en una array de String con
     * formato "ID - Nombre de la clase"
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
     * Este método devuelve la lista de pasajeros en una array de String con
     * formato "ID - Nombre Apellido"
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
     * Muestra una lista de vuelos
     * @param listaVuelos 
     */
    public void MostrarVuelos(List<Vuelo> listaVuelos) {
        System.out.println("Datos actuales de los pasajeros:");
        for (Vuelo vuelo : listaVuelos) {
            System.out.println("ID: " + vuelo.getId());
            System.out.println("Aeropuerto de origen: " + vuelo.getAeropuertoOrigen());
            System.out.println("Aeropuerto de destino: " + vuelo.getAeropuertoDestino());
            System.out.println("Hora de salida: " + vuelo.getHoraSalida());
            System.out.println("Hora de llegada: " + vuelo.getHoraLlegada());
            System.out.println("Duración: " + vuelo.getDuracion() + " minutos");
            System.out.println("Fecha de vuelo: " + vuelo.getFechaVuelo());
            System.out.println("Tipo de avión: " + vuelo.getTipoAvion());
            System.out.println("Número máximo de pasajeros: " + vuelo.getNumMaxPasajeros());
            System.out.println("Número mínimo de pasajeros: " + vuelo.getNumMinPasajeros());

        }
    }

    /**
     * Se crea un nuevo vuelo
     */
    public void nuevoVuelo() {
        Vuelo vuelo = new Vuelo();
        boolean datosIncorrectos = false;
        do {
            System.out.println("Orígenes disponibles: ");
            MostrarOrigenes();

            System.out.println("Aeropuesto de origen: ");
            int opcionOrigen = sc.nextInt();

            Origen origen = listaOrigenes.get(opcionOrigen - 1);

            System.out.println("Destinos disponibles: ");
            MostrarDestinos();

            System.out.println("Aeropuesto de destino: ");
            int opcionDestino = sc.nextInt();

            Destino destino = listaDestinos.get(opcionDestino - 1);

            System.out.println("Hora salida: ");
            String salida = sc.nextLine();

            System.out.println("Hora llegada: ");
            String llegada = sc.nextLine();

            System.out.println("Duración: ");
            double duracion = sc.nextDouble();

            System.out.println("Fecha del vuelo (dd/MM/yyyy): ");
            String fechaVuelo = sc.nextLine();

            MostrarTiposAvion();
            System.out.println("Tipo de avión: ");
            int tipoAvion = sc.nextInt();
            TipoAvion tipo = TipoAvion.values()[tipoAvion - 1];

            System.out.println("Número máximo de pasajeros: ");
            int numMax = sc.nextInt();

            System.out.println("Número mínimo de pasajeros: ");
            int numMin = sc.nextInt();

            vuelo.setTipoAvion(tipo);
            vuelo.setFechaVuelo(fechaVuelo);
            vuelo.setDuracion(duracion);
            vuelo.setHoraSalida(salida);
            vuelo.setHoraLlegada(llegada);
            vuelo.setAeropuertoOrigen(origen);
            vuelo.setAeropuertoDestino(destino);
            vuelo.setNumMaxPasajeros(numMax);
            vuelo.setNumMinPasajeros(numMin);

            // Validar la información ingresada utilizando los métodos de Utils
            if (!Utils.isDate(vuelo.getFechaVuelo())) {
                System.out.println("La fecha de vuelo ingresada no es válida.");
                datosIncorrectos = true;
            } else if (!Utils.isNumeric(Double.toString(vuelo.getDuracion()))) {
                System.out.println("La duración ingresada no es válida.");
                datosIncorrectos = true;
            } else if (!vuelo.getHoraSalida().contains(":")) {
                System.out.println("La hora de salida ingresada no es válida.");
                datosIncorrectos = true;
            } else if (!vuelo.getHoraLlegada().contains(":")) {
                System.out.println("La hora de llegada ingresada no es válida.");
                datosIncorrectos = true;
            } else {
                datosIncorrectos = false;  // Todos los datos son válidos, salimos del bucle
            }

        } while (datosIncorrectos);
    }

    /**
     * Crea un nuevo pasajero
     * @param listaPasajeros1 
     */
    public void crearPasajero(List<Pasajero> listaPasajeros1) {
        Pasajero pasajero = new Pasajero();
        boolean datosIncorrectos = false;

        do {
            // Recopilar información del pasajero
            System.out.println("1 Nombre y apellidos: ");
            String nombreApellidos = sc.nextLine();
            pasajero.setNombreApellido(nombreApellidos);

            // Validar la información recopilada
            if (!Utils.isEmail(pasajero.getCorreo())) {
                System.out.println("El correo electrónico ingresado no es válido.");
                datosIncorrectos = true;
            }

            if (!Utils.isValidDNI(pasajero.getDni())) {
                System.out.println("El DNI ingresado no es válido.");
                datosIncorrectos = true;
            }

            if (!Utils.isNumeric(pasajero.getTelefono())) {
                System.out.println("El teléfono ingresado no es válido.");
                datosIncorrectos = true;
            }

            if (!Utils.isNumeric(pasajero.getContactoDeEmergencia())) {
                System.out.println("El contacto de emergencia ingresado no es válido.");
                datosIncorrectos = true;
            }

            if (datosIncorrectos) {
                // Mostrar mensaje de datos incorrectos y repetir el bucle
                System.out.println("Por favor, ingrese los datos nuevamente.");
            } else {
                System.out.println("Pasajero creado correctamente.");
            }

            listaPasajeros1.add(pasajero);
        } while (datosIncorrectos);

    }

    public void modificarPasajeros(List<Pasajero> listaPasajeros) {
        System.out.print("Ingrese el número de DNI del pasajero que desea modificar: ");
        String dni = sc.nextLine();
        boolean encontrado = false;

        for (Pasajero pasajero : listaPasajeros) {
            if (pasajero.getDni().equals(dni)) {
                encontrado = true;

                sc = new Scanner(System.in);
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

                    opcion = sc.nextInt();

                    switch (opcion) {
                        case 1:
                            System.out.print("Ingrese el nuevo nombre y apellidos del pasajero: ");
                            String nuevoNombre = sc.nextLine();
                            sc.nextLine(); // Limpia el buffer
                            pasajero.setNombreApellido(nuevoNombre);
                            System.out.println("Datos del pasajero actualizados con éxito.");

                        case 2:
                            System.out.print("Ingrese el nuevo DNI del pasajero: ");
                            String nuevoDNI = sc.nextLine();
                            sc.nextLine(); // Limpia el buffer
                            pasajero.setDni(nuevoDNI);
                            System.out.println("Datos del pasajero actualizados con éxito.");

                        case 3:
                            System.out.print("Ingrese el nuevo pasaporte del pasajero: ");
                            String nuevoPasaporte = sc.nextLine();
                            sc.nextLine(); // Limpia el buffer
                            pasajero.setPasaporte(nuevoPasaporte);
                            System.out.println("Datos del pasajero actualizados con éxito.");

                        case 4:
                            System.out.print("Ingrese la nueva fecha de nacimiento del pasajero: ");
                            String nuevaFechaNacimiento = sc.nextLine();
                            sc.nextLine(); // Limpia el buffer
                            pasajero.setFechaNacimiento(nuevaFechaNacimiento);
                            System.out.println("Datos del pasajero actualizados con éxito.");

                        case 5:
                            System.out.print("Ingrese el nuevo teléfono del pasajero: ");
                            String nuevoTelefono = sc.nextLine();
                            sc.nextLine(); // Limpia el buffer
                            pasajero.setTelefono(nuevoTelefono);
                            System.out.println("Datos del pasajero actualizados con éxito.");

                        case 6:
                            System.out.print("Ingrese el nuevo correo: ");
                            String nuevoCorreo = sc.nextLine();
                            sc.nextLine(); // Limpia el buffer
                            pasajero.setCorreo(nuevoCorreo);
                            System.out.println("Datos del pasajero actualizados con éxito.");

                        case 7:
                            System.out.print("Ingrese la nueva provincia del pasajero: ");
                            String nuevaProvincia = sc.nextLine();
                            sc.nextLine(); // Limpia el buffer
                            pasajero.setProvincia(nuevaProvincia);
                            System.out.println("Datos del pasajero actualizados con éxito.");

                        case 8:
                            System.out.print("Ingrese el nuevo pais: ");
                            String nuevoPais = sc.nextLine();
                            sc.nextLine(); // Limpia el buffer
                            pasajero.setPais(nuevoPais);
                            System.out.println("Datos del pasajero actualizados con éxito.");

                        case 9:
                            System.out.print("Ingrese el nuevo pais: ");
                            String nuevoContactoDeEmergencia = sc.nextLine();
                            sc.nextLine(); // Limpia el buffer
                            pasajero.setContactoDeEmergencia(nuevoContactoDeEmergencia);
                            System.out.println("Datos del pasajero actualizados con éxito.");

                        case 10:
                            System.out.print("Ha seleccionado 'Salir' ");
                            break;

                        default:
                            System.out.print("Opción no válida. Inténtelo de nuevo");

                    }
                } while (opcion != 10);

            } else {
                System.out.println("No se ha encontrado ningún pasajero con ese DNI.");
            }
        }
    }

    public void mostrarPasajeros(List<Pasajero> mostrarListaPasajeros) {
        System.out.println("Datos actuales de los pasajeros:");
        for (Pasajero pasajero : mostrarListaPasajeros) {

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
        }

    }

    public List<Vuelo> getlistaVuelos() {
        return listaVuelos;
    }

    public void crearReserva() {
        Reserva reserva = new Reserva();
        boolean datosIncorrectos = false;

        do {
            // Recopilar información del pasajero
            System.out.println("1. ID de reserva: ");
            int id = Integer.parseInt(sc.nextLine());
            reserva.setId(id);

            System.out.println("2. Datos del vuelo: ");
            // Aquí deberías tener la lógica para recopilar los datos del vuelo

            System.out.println("3. Clase de vuelo: ");
            // Aquí deberías tener la lógica para recopilar la clase de vuelo

            System.out.println("4. Nombre y apellidos del pasajero: ");
            String nombreApellidos = sc.nextLine();
            Pasajero pasajero = new Pasajero();
            pasajero.setNombreApellido(nombreApellidos);
            reserva.setPasajero(pasajero);

            System.out.println("5. Fecha de reserva: ");
            String fechaReserva = sc.nextLine();
            reserva.setFechaReserva(fechaReserva);

            System.out.println("6. Datos del equipaje: ");
            // Aquí deberías tener la lógica para recopilar los datos del equipaje

            System.out.println("7. ¿Lleva mascota? (true/false): ");
            boolean mascota = Boolean.parseBoolean(sc.nextLine());
            reserva.setMascota(mascota);

            System.out.println("8. Estado de la reserva (confirmado/cancelado): ");
            String estadoReservaStr = sc.nextLine().toUpperCase(); // Leer la opción y convertirla a mayúsculas
            Estado estadoReserva;

            // Validar la opción ingresada y asignar el estado correspondiente
            if (estadoReservaStr.equals("CONFIRMADO")) {
                estadoReserva = Estado.CONFIRMADO;
            } else if (estadoReservaStr.equals("CANCELADO")) {
                estadoReserva = Estado.CANCELADO;
            } else {
                System.out.println("La opción ingresada no es válida. Se asignará el estado 'CONFIRMADO' por defecto.");
                estadoReserva = Estado.CONFIRMADO;
            }

            reserva.setEstado(estadoReserva);

            // Validar la información recopilada
            if (!Utils.isEmail(pasajero.getCorreo())) {
                System.out.println("El correo electrónico ingresado no es válido.");
                datosIncorrectos = true;
            }

            if (!Utils.isValidDNI(pasajero.getDni())) {
                System.out.println("El DNI ingresado no es válido.");
                datosIncorrectos = true;
            }

            if (!Utils.isNumeric(pasajero.getTelefono())) {
                System.out.println("El teléfono ingresado no es válido.");
                datosIncorrectos = true;
            }

            if (!Utils.isNumeric(pasajero.getContactoDeEmergencia())) {
                System.out.println("El contacto de emergencia ingresado no es válido.");
                datosIncorrectos = true;
            }

            if (datosIncorrectos) {
                // Mostrar mensaje de datos incorrectos y repetir el bucle
                System.out.println("Por favor, ingrese los datos nuevamente.");
            } else {
                System.out.println("Reserva creada correctamente.");
            }

        } while (datosIncorrectos);
    }
}
