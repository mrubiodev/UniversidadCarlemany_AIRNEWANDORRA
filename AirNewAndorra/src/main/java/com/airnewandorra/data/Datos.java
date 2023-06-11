package com.airnewandorra.data;

import com.airnewandorra.enums.*;
import com.airnewandorra.models.*;
import com.airnewandorra.utils.Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Esta clase crea los datos iniciales de la aplicacion.
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
    private List<Reserva> listaReservas = new ArrayList<>();

    public Datos() {
        crearClasesVuelos();
        crearDestinos();
        crearOrigenes();
        crearPasajeros();
    }

    public List<Pasajero> getListaPasajeros() {
        return listaPasajeros;
    }

    public List<Vuelo> getlistaVuelos() {
        return listaVuelos;
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
     * Este metodo devuelve la lista de destinos en una array de String con
     * formato "ID - Nombre del destino"
     */
    public void MostrarDestinos() {
        for (Destino destino : listaDestinos) {
            System.out.println("\t" + destino.getId() + " - " + destino.getNombreDestino());
        }
    }

    private void MostrarTiposAvion() {
        int c = 0;
        for (TipoAvion tipo : TipoAvion.values()) {
            c++;
            System.out.println("\t" + c + " - " + tipo.name());
        }
    }

    public void MostrarOrigenes() {
        for (Origen origen : listaOrigenes) {
            System.out.println("\t" + origen.getId() + " - " + origen.getNombreOrigen());
        }
    }

    /**
     * Este metodo devuelve la lista de clases en una array de String con
     * formato "ID - Nombre de la clase"
     */
    public void MostrarClases() {
        for (ClaseVuelo clase : listaClases) {
            System.out.println(clase.getId() + " - " + clase.getNombre());
        }
    }

    /**
     * Este metodo dado un nuevo pasajero y lo añade a la lista de pasajeros
     *
     * @param nuevoPasajero
     */
    public void nuevoPasajero(Pasajero nuevoPasajero) {
        listaPasajeros.add(nuevoPasajero);
    }

    /**
     * Este metodo devuelve la lista de pasajeros en una array de String con
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
     *
     * @param listaVuelos
     */
    public void MostrarVuelos(List<Vuelo> listaVuelos) {
        System.out.println("Datos actuales de los vuelos: \n");
        for (Vuelo vuelo : listaVuelos) {
            System.out.println("ID: " + vuelo.getId());
            System.out.println("Aeropuerto de origen: " + vuelo.getAeropuertoOrigen());
            System.out.println("Aeropuerto de destino: " + vuelo.getAeropuertoDestino());
            System.out.println("Hora de salida: " + vuelo.getHoraSalida());
            System.out.println("Hora de llegada: " + vuelo.getHoraLlegada());
            System.out.println("Duracion: " + vuelo.getDuracion() + " minutos");
            System.out.println("Fecha de vuelo: " + vuelo.getFechaVuelo());
            System.out.println("Tipo de avion: " + vuelo.getTipoAvion());
            System.out.println("Numero maximo de pasajeros: " + vuelo.getNumMaxPasajeros());
            System.out.println("Numero minimo de pasajeros: " + vuelo.getNumMinPasajeros() + "\n");

        }
    }

    /**
     * Se crea un nuevo vuelo
     */
    public void nuevoVuelo() {
        Vuelo vuelo = new Vuelo();
        boolean datosIncorrectos = false;
        do {
            System.out.println("Origenes disponibles: ");
            MostrarOrigenes();

            System.out.println("Selecciona un aeropuerto de origen: ");
            int opcionOrigen = sc.nextInt();

            while (opcionOrigen == 0 || opcionOrigen > listaOrigenes.size()) {
                System.out.println("El valor seleccionado no es válido. Debe estar entre 1 y " + (listaOrigenes.size()));
                System.out.println("Selecciona un aeropuesto de origen: ");
                opcionOrigen = sc.nextInt();
            }

            Origen origen = listaOrigenes.get(opcionOrigen - 1);

            System.out.println("Destinos disponibles: ");
            MostrarDestinos();

            System.out.println("Selecciona un aeropuerto de destino: ");
            int opcionDestino = sc.nextInt();

            while (opcionDestino == 0 || opcionDestino > listaDestinos.size()) {
                System.out.println("El valor seleccionado no es válido. Debe estar entre 1 y " + (listaDestinos.size()));
                System.out.println("Selecciona un aeropuerto de destino: ");
                opcionDestino = sc.nextInt();
            }

            sc.nextLine(); //limpiamos

            Destino destino = listaDestinos.get(opcionDestino - 1);

            System.out.println("Hora salida: ");
            String salida = sc.nextLine();

            System.out.println("Hora llegada: ");
            String llegada = sc.nextLine();

            System.out.println("Duracion (min): ");
            double duracion = sc.nextDouble();

            sc.nextLine(); //limpiamos

            System.out.println("Fecha del vuelo (dd/MM/yyyy): ");
            String fechaVuelo = sc.nextLine();

            MostrarTiposAvion();
            System.out.println("Selecciona un tipo de avion: ");
            int tipoAvion = sc.nextInt();
            TipoAvion tipo = TipoAvion.values()[tipoAvion - 1];

            System.out.println("Numero maximo de pasajeros: ");
            int numMax = sc.nextInt();

            System.out.println("Numero minimo de pasajeros: ");
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

            // Validar la informacion ingresada utilizando los metodos de Utils
            if (!Utils.isDate(vuelo.getFechaVuelo())) {
                System.out.println("La fecha de vuelo ingresada no es valida.");
                datosIncorrectos = true;
            } else if (!Utils.isNumeric(Double.toString(vuelo.getDuracion()))) {
                System.out.println("La duracion ingresada no es valida.");
                datosIncorrectos = true;
            } else if (!vuelo.getHoraSalida().contains(":")) {
                System.out.println("La hora de salida ingresada no es valida.");
                datosIncorrectos = true;
            } else if (!vuelo.getHoraLlegada().contains(":")) {
                System.out.println("La hora de llegada ingresada no es valida.");
                datosIncorrectos = true;
            } else {
                datosIncorrectos = false;  // Todos los datos son validos, salimos del bucle
            }

            System.out.println("Vuelo creado correctamente. \n");
            listaVuelos.add(vuelo);
        } while (datosIncorrectos);
    }

    /**
     * Crea un nuevo pasajero
     *
     * @param listaPasajeros1
     */
    public void crearPasajero(List<Pasajero> listaPasajeros1) {

        boolean datosIncorrectos = true;
        String nombreApellidos = "";
        String dni = "";
        String pasaporte = "";
        String telefono = "";
        String correo = "";
        String provincia = "";
        String pais = "";
        String contactoEmergencia = "";
        String fechaNacimiento = "";

        while (datosIncorrectos) {
            // Recopilar información del pasajero
            if (nombreApellidos.isEmpty()) {
                System.out.println("1. Nombre y apellidos: ");
                nombreApellidos = sc.nextLine();
            }

            if (Utils.isNumeric(nombreApellidos)) {
                System.out.println("El nombre y los apellidos no deberian ser numericos");
                nombreApellidos = ""; // Reiniciar el valor para volver a solicitarlo
                continue;
            }

            if (dni.isEmpty()) {
                System.out.println("2. DNI: ");
                dni = sc.nextLine();
            }

            if (!Utils.isValidDNI(dni)) {
                System.out.println("El DNI ingresado no es valido (11111111-X).");
                dni = ""; // Reiniciar el valor para volver a solicitarlo
                continue;
            }

            if (pasaporte.isEmpty()) {
                System.out.println("3. Pasaporte: ");
                pasaporte = sc.nextLine();
            }

            if (telefono.isEmpty()) {
                System.out.println("4. Telefono: ");
                telefono = sc.nextLine();
            }

            if (!Utils.isNumeric(telefono)) {
                System.out.println("El teléfono ingresado no es valido.");
                telefono = ""; // Reiniciar el valor para volver a solicitarlo
                continue;
            }

            if (correo.isEmpty()) {
                System.out.println("5. Correo electrónico: ");
                correo = sc.nextLine();
            }

            if (!Utils.isEmail(correo)) {
                System.out.println("El correo electronico ingresado no es valido.");
                correo = ""; // Reiniciar el valor para volver a solicitarlo
                continue;
            }

            if (provincia.isEmpty()) {
                System.out.println("6. Provincia: ");
                provincia = sc.nextLine();
            }

            if (pais.isEmpty()) {
                System.out.println("7. Pais: ");
                pais = sc.nextLine();
            }

            if (contactoEmergencia.isEmpty()) {
                System.out.println("8. Contacto de emergencia: ");
                contactoEmergencia = sc.nextLine();
            }

            if (!Utils.isNumeric(contactoEmergencia)) {
                System.out.println("El contacto de emergencia ingresado no es valido.");
                contactoEmergencia = ""; // Reiniciar el valor para volver a solicitarlo
                continue;
            }

            if (fechaNacimiento.isEmpty()) {
                System.out.println("9. Fecha de nacimiento: ");
                fechaNacimiento = sc.nextLine();
            }

            if (!Utils.isDate(fechaNacimiento)) {
                System.out.println("Formato icorrecto en la fecha de nacimiento (dd/MM/yyyy).");
                contactoEmergencia = ""; // Reiniciar el valor para volver a solicitarlo
                continue;
            }

            datosIncorrectos = false; // Si se llega hasta aquí, todos los datos son correctos

            if (datosIncorrectos) {
                // Mostrar mensaje de datos incorrectos y repetir el bucle
                System.out.println("Por favor, ingrese los datos nuevamente.\n");
                // Reiniciar todas las variables de datos ingresados
                nombreApellidos = "";
                dni = "";
                pasaporte = "";
                telefono = "";
                correo = "";
                provincia = "";
                pais = "";
                contactoEmergencia = "";
                fechaNacimiento = "";
            } else {
                System.out.println("Pasajero creado correctamente.\n");
            }

            // Crear objeto pasajero y agregarlo a la lista de pasajeros
            Pasajero pasajero = new Pasajero();
            pasajero.setNombreApellido(nombreApellidos);
            pasajero.setDni(dni);
            pasajero.setPasaporte(pasaporte);
            pasajero.setTelefono(telefono);
            pasajero.setCorreo(correo);
            pasajero.setProvincia(provincia);
            pasajero.setPais(pais);
            pasajero.setContactoDeEmergencia(contactoEmergencia);
            pasajero.setFechaNacimiento(fechaNacimiento);

            listaPasajeros1.add(pasajero);

        }
    }

    public void modificarPasajero(Pasajero pasajero) {
        int opcion = 0;

        System.out.println("¿Que quieres modificar?: \n");
        System.out.println("1 Nombre y apellidos: " + pasajero.getNombreApellido());
        System.out.println("2 DNI: " + pasajero.getDni());
        System.out.println("3 Pasaporte: " + pasajero.getPasaporte());
        System.out.println("4 Fecha de nacimiento: " + pasajero.getFechaNacimiento());
        System.out.println("5 Telefono: " + pasajero.getTelefono());
        System.out.println("6 Email: " + pasajero.getCorreo());
        System.out.println("7 Provincia: " + pasajero.getProvincia());
        System.out.println("8 Pais: " + pasajero.getPais());
        System.out.println("9 Contacto de emergencia: " + pasajero.getContactoDeEmergencia());
        System.out.println("10 Salir: \n");

        System.out.print("Ingrese una opcion: ");

        opcion = sc.nextInt();
        sc.nextLine();

        switch (opcion) {
            case 1:
                System.out.print("Ingrese el nuevo nombre y apellidos del pasajero: ");
                String nuevoNombre = sc.nextLine();
                pasajero.setNombreApellido(nuevoNombre);
                break;

            case 2:
                System.out.print("Ingrese el nuevo DNI del pasajero: ");
                String nuevoDNI = sc.nextLine();
                pasajero.setDni(nuevoDNI);
                break;

            case 3:
                System.out.print("Ingrese el nuevo pasaporte del pasajero: ");
                String nuevoPasaporte = sc.nextLine();
                pasajero.setPasaporte(nuevoPasaporte);
                break;

            case 4:
                System.out.print("Ingrese la nueva fecha de nacimiento del pasajero: ");
                String nuevaFechaNacimiento = sc.nextLine();
                pasajero.setFechaNacimiento(nuevaFechaNacimiento);
                break;

            case 5:
                System.out.print("Ingrese el nuevo telefono del pasajero: ");
                String nuevoTelefono = sc.nextLine();
                pasajero.setTelefono(nuevoTelefono);
                break;

            case 6:
                System.out.print("Ingrese el nuevo correo: ");
                String nuevoCorreo = sc.nextLine();
                pasajero.setCorreo(nuevoCorreo);
                break;

            case 7:
                System.out.print("Ingrese la nueva provincia del pasajero: ");
                String nuevaProvincia = sc.nextLine();
                pasajero.setProvincia(nuevaProvincia);
                break;

            case 8:
                System.out.print("Ingrese el nuevo pais: ");
                String nuevoPais = sc.nextLine();
                pasajero.setPais(nuevoPais);
                break;

            case 9:
                System.out.print("Ingrese el nuevo pais: ");
                String nuevoContactoDeEmergencia = sc.nextLine();
                pasajero.setContactoDeEmergencia(nuevoContactoDeEmergencia);
                break;

            case 10:
                System.out.print("Ha seleccionado 'Salir' \n");
                break;

            default:
                System.out.print("Opcion no valida. Intentelo de nuevo \n");

        }
        System.out.println("Datos del pasajero actualizados con exito. \n");
    }

    public void mostrarPasajeros(List<Pasajero> mostrarListaPasajeros) {
        System.out.println("Datos actuales de los pasajeros: \n");
        for (Pasajero pasajero : mostrarListaPasajeros) {

            System.out.println("1 Nombre y apellidos: " + pasajero.getNombreApellido());
            System.out.println("2 DNI: " + pasajero.getDni());
            System.out.println("3 Pasaporte: " + pasajero.getPasaporte());
            System.out.println("4 Fecha de nacimiento: " + pasajero.getFechaNacimiento());
            System.out.println("5 Telefono: " + pasajero.getTelefono());
            System.out.println("6 Email: " + pasajero.getCorreo());
            System.out.println("7 Provincia: " + pasajero.getProvincia());
            System.out.println("8 Pais: " + pasajero.getPais());
            System.out.println("9 Contacto de emergencia: " + pasajero.getContactoDeEmergencia() + "\n");
        }

    }

    public void modificarVuelo(Vuelo vuelo) {
        int opcion = 0;

        System.out.println("¿Que quieres modificar del vuelo?: \n");
        System.out.println("1 Origen del aeropuerto: " + vuelo.getAeropuertoOrigen());
        System.out.println("2 Destino del aeropuerto: " + vuelo.getAeropuertoDestino());
        System.out.println("3 Hora de salida: " + vuelo.getHoraSalida());
        System.out.println("4 Hora de llegada: " + vuelo.getHoraLlegada());
        System.out.println("5 Duracion: " + vuelo.getDuracion());
        System.out.println("6 Fecha del vuelo: " + vuelo.getFechaVuelo());
        System.out.println("7 Tipo de avion: " + vuelo.getTipoAvion());
        System.out.println("8 Numero maximo de pasajeros: " + vuelo.getNumMaxPasajeros());
        System.out.println("9 Numero minimo de pasajeros: " + vuelo.getNumMinPasajeros());
        System.out.println("10 Salir: \n");

        System.out.print("Ingrese una opcion: ");

        opcion = sc.nextInt();
        sc.nextLine();

        switch (opcion) {

            case 1:
                System.out.print("Ingrese el nuevo origen del vuelo: ");
                System.out.println("Origenes disponibles: ");
                MostrarOrigenes();
                int opcionOrigen = sc.nextInt();

                while (opcionOrigen == 0 || opcionOrigen > listaOrigenes.size()) {
                    System.out.println("El valor seleccionado no es válido. Debe estar entre 1 y " + (listaOrigenes.size()));
                    System.out.println("Selecciona un aeropuerto de origen: ");
                    opcionOrigen = sc.nextInt();
                }

                Origen origen = listaOrigenes.get(opcionOrigen - 1);
                vuelo.setAeropuertoOrigen(origen);
                break;

            case 2:
                System.out.print("Ingrese el nuevo destino del vuelo: ");
                System.out.println("Destinos disponibles: ");
                MostrarDestinos();
                int opcionDestino = sc.nextInt();

                while (opcionDestino == 0 || opcionDestino > listaDestinos.size()) {
                    System.out.println("El valor seleccionado no es válido. Debe estar entre 1 y " + (listaDestinos.size()));
                    System.out.println("Selecciona un aeropuerto de destino: ");
                    opcionDestino = sc.nextInt();
                }

                Destino destino = listaDestinos.get(opcionDestino - 1);
                vuelo.setAeropuertoDestino(destino);
                break;

            case 3:
                System.out.print("Ingrese la nueva hora de salida del vuelo: ");
                String nuevaHoraSalida = sc.nextLine();
                vuelo.setHoraSalida(nuevaHoraSalida);
                break;

            case 4:
                System.out.print("Ingrese la nueva hora de llegada del vuelo: ");
                String nuevaHoraLlegada = sc.nextLine();
                vuelo.setHoraLlegada(nuevaHoraLlegada);
                break;

            case 5:
                System.out.print("Ingrese la nueva duracion del vuelo: ");
                Double nuevaDuracion = sc.nextDouble();
                vuelo.setDuracion(nuevaDuracion);
                break;

            case 6:
                System.out.print("Ingrese la nueva fecha del vuelo: ");
                String nuevaFecha = sc.nextLine();
                vuelo.setFechaVuelo(nuevaFecha);
                break;

            case 7:
                System.out.print("Ingrese el nuevo tipo del vuelo: ");
                String nuevoTipoAvionStr = sc.nextLine();
                TipoAvion nuevoTipoAvion = TipoAvion.valueOf(nuevoTipoAvionStr);
                vuelo.setTipoAvion(nuevoTipoAvion);
                break;

            case 8:
                System.out.print("Ingrese el nuevo numero maximo de pasajeros del vuelo: ");
                int nuevoNumMaxPasajeros = sc.nextInt();
                vuelo.setNumMaxPasajeros(nuevoNumMaxPasajeros);
                break;

            case 9:
                System.out.print("Ingrese el nuevo numero minimo de pasajeros del vuelo: ");
                int nuevoNumMinPasajeros = sc.nextInt();
                vuelo.setNumMinPasajeros(nuevoNumMinPasajeros);
                break;

            case 10:
                System.out.print("Ha seleccionado 'Salir' \n");
                break;

            default:
                System.out.print("Opcion no valida. Intentelo de nuevo \n");

        }
        System.out.println("Datos del vuelo actualizado con exito. \n");
    }

    public String[] getListaVuelos() {
        String[] listaVuelosString = new String[listaVuelos.size()];
        int i = 0;
        for (Vuelo vuelo : listaVuelos) {
            listaVuelosString[i] = vuelo.getId() + " - " + vuelo.getAeropuertoOrigen() + " a " + vuelo.getAeropuertoDestino() + " -Horario: " + vuelo.getHoraSalida()
                    + "-" + vuelo.getHoraLlegada() + " Fecha: " + vuelo.getFechaVuelo() + "\n";
            i++;
        }
        return listaVuelosString;
    }

    public void crearReserva(Pasajero pasajeroSeleccionado) {
        Reserva reserva = new Reserva();

        // Recopilar informacion de la reserva
        int lastId = listaPasajeros.get(listaPasajeros.size() - 1).getID();
        reserva.setId(lastId + 1);

        System.out.println("2. Datos del vuelo: ");
        // Aqui deberias tener la logica para recopilar los datos del vuelo

        System.out.println("3. Clase de vuelo: ");
        String tipoClasevuelo = sc.nextLine().toUpperCase(); // Leer la opcion y convertirla a mayusculas
        Clases tipoClase;

        // Validar la opcion ingresada y asignar el tipo de clase de vuelo correspondiente
        if (tipoClasevuelo.equals("ECONOMIC")) {
            tipoClase = Clases.ECONOMIC;
        } else if (tipoClasevuelo.equals("BUSINESS")) {
            tipoClase = Clases.BUSINESS;
        } else if (tipoClasevuelo.equals("FIRST")) {
            tipoClase = Clases.FIRST;
        } else {
            System.out.println("La opcion ingresada no es valida. Se asignara el tipo de equipaje 'ECONOMIC' por defecto.");
            tipoClase = Clases.ECONOMIC;
        }
        reserva.setClaseVuelo(tipoClase);

        System.out.println("4. Nombre y apellidos del pasajero: ");
        String nombreApellidos = sc.nextLine();
        Pasajero pasajero = new Pasajero();
        pasajero.setNombreApellido(nombreApellidos);
        reserva.setPasajero(pasajero);

        System.out.println("5. Fecha de reserva: ");
        String fechaReserva = sc.nextLine();
        reserva.setFechaReserva(fechaReserva);

        System.out.println("6. Datos del equipaje (mano/facturado/ambos): ");
        String tipoEquipajeStr = sc.nextLine().toUpperCase(); // Leer la opcion y convertirla a mayusculas
        Equipaje tipoEquipaje;

        // Validar la opcion ingresada y asignar el tipo de equipaje correspondiente
        if (tipoEquipajeStr.equals("MANO")) {
            tipoEquipaje = Equipaje.MANO;
        } else if (tipoEquipajeStr.equals("FACTURADO")) {
            tipoEquipaje = Equipaje.FACTURADO;
        } else if (tipoEquipajeStr.equals("AMBOS")) {
            tipoEquipaje = Equipaje.AMBOS;
        } else {
            System.out.println("La opcion ingresada no es valida. Se asignara el tipo de equipaje 'MANO' por defecto.");
            tipoEquipaje = Equipaje.MANO;
        }
        reserva.setEquipaje(tipoEquipaje);

        System.out.println("7. ¿Lleva mascota? (true/false): ");
        boolean mascota = Boolean.parseBoolean(sc.nextLine());
        reserva.setMascota(mascota);

        System.out.println("8. Estado de la reserva (confirmado/cancelado): ");
        String estadoReservaStr = sc.nextLine().toUpperCase(); // Leer la opcion y convertirla a mayusculas
        Estado estadoReserva;

        // Validar la opcion ingresada y asignar el estado correspondiente
        if (estadoReservaStr.equals("CONFIRMADO")) {
            estadoReserva = Estado.CONFIRMADO;
        } else if (estadoReservaStr.equals("CANCELADO")) {
            estadoReserva = Estado.CANCELADO;
        } else {
            System.out.println("La opcion ingresada no es valida. Se asignara el estado 'CONFIRMADO' por defecto. \n");
            estadoReserva = Estado.CONFIRMADO;
        }

        reserva.setEstado(estadoReserva);

    }

    /**
     * Este metodo devuelve un objeto de tipo Pasajero dado un ID
     *
     * @param id
     * @return
     */
    public Pasajero returnPasajeroObjById(int id) {

        Pasajero pasajeroByID = listaPasajeros.stream()
                .filter(pasajero -> pasajero.getID() == id)
                .findFirst()
                .orElse(null);

        return pasajeroByID;
    }

    public Vuelo returnVueloObjById(int id) {

        Vuelo vueloByID = listaVuelos.stream()
                .filter(vuelo -> vuelo.getId() == id)
                .findFirst()
                .orElse(null);

        return vueloByID;
    }

    public void listaReservasPasajero(Pasajero pasajeroSeleccionado) {
        List<Reserva> reservasDelPasajero = listaReservas.stream()
                .filter(reserva -> reserva.getPasajero().equals(pasajeroSeleccionado))
                .collect(Collectors.toList());

        if (reservasDelPasajero.isEmpty()) {
            System.out.println("El pasajero " + pasajeroSeleccionado.getNombreApellido() + " no tiene reservas. \n");
            return;
        }

        for (Reserva reserva : reservasDelPasajero) {
            System.out.println("ID: " + reserva.getId());
            System.out.println("Vuelo: " + reserva.getVuelo().getId());
            System.out.println("Equipaje: " + reserva.getEquipaje().name());
            System.out.println("Estado: " + reserva.getEstado().name());
            System.out.println("Mascota: " + (reserva.isMascota() ? "Si" : "No"));
            System.out.println("Clase de reserva: " + reserva.getClaseVuelo().getClase() + "\n");

        }
    }

}
