package com.airnewandorra.airnewandorra;

import com.airnewandorra.models.Pasajero;
import com.airnewandorra.models.Vuelo;
import com.libraryMenuTools.ToolsAndMenu;
import static com.libraryMenuTools.ToolsAndMenu.menu;
import static com.libraryMenuTools.ToolsAndMenu.title;

import com.airnewandorra.data.Datos;
import java.util.List;
import java.util.Scanner;

public class AirNewAndorra {

    public static Datos datosPrograma;

    static void menuPrincipal() {
        datosPrograma = new Datos();
        String[] menuOpciones = {"1.Cliente", "2.Gestor", "0.Salir"};

        while (true) {  //Bucle infinito
            title("AirNewAndorra");
            int option = menu(menuOpciones);
            switch (option) {
                case 0://SALIDA APP
                    System.out.println("Hasta Pronto AirNewAndorra le desea un feliz dia");
                    ToolsAndMenu.sleepThread(1);//Pausa por tiempo
                    return;
                case 1:
                    menuCliente();
                    ToolsAndMenu.pausa();
                    break;
                case 2:
                    menuGestor();
                    ToolsAndMenu.pausa();
                    break;
            }
        }
    }

    static void menuCliente() {
        String[] titulos = {"AirNewAndorra", "1.Cliente"};
        String[] menuOpciones = {"1.Crear Pasajero", "2.Modificar lista de Pasajeros", "3.Modificar Pasajero por DNI", "0.Volver"};
        while (true) {  //Bucle infinito
            title(titulos);
            int option = menu(menuOpciones);
            switch (option) {
                case 0://SALIDA APP
                    System.out.println("Volviendo al menu principal");
                    //ToolsAndMenu.sleepThread(0);//Pausa por tiempo
                    return;//Me voy de la funcion
                //break;
                case 1:

                    ToolsAndMenu.pausa();
                    break;
                case 2:
                    mostrarPasajeros(datosPrograma.getListaPasajeros());
                    ToolsAndMenu.pausa();
                    break;
                case 3:
                    modificarPasajeros(datosPrograma.getListaPasajeros());
                    ToolsAndMenu.pausa();
                    break;  
            }
        }
    }

    static void menuGestor() {
        String[] titulos = {"AirNewAndorra", "2.Gestor"};
        String[] menuOpciones = {"1.Vuelos", "2.Clases", "2.Origenes", "3.Destinos", "5.Clases Vuelos", "0.Volver"};
        while (true) {  //Bucle infinito
            title(titulos);
            int option = menu(menuOpciones);
            switch (option) {
                case 0://SALIDA APP
                    System.out.println("Volviendo al menu principal");
                    //ToolsAndMenu.sleepThread(0);//Pausa por tiempo
                    return;//Me voy de la funcion
                //break;
                case 1:
                    menuVuelos();
                    ToolsAndMenu.pausa();
                    break;
                case 2:
                    menuClases();
                    ToolsAndMenu.pausa();
                    break;
                case 3:
                    menuOrigenes();
                    ToolsAndMenu.pausa();
                    break;
                case 4:
                    menuDestinos();
                    ToolsAndMenu.pausa();
                    break;
        
            }
        }
    }

    private static void menuVuelos() {
        String[] titulos = {"AirNewAndorra", "2.Gestor", "3.Vuelos"};
        String[] menuOpciones = {"1.Mostrar Vuelos", "2.Crear Vuelo", "3.Seleccionar Vuelo"};
        while (true) {  //Bucle infinito
            title(titulos);
            int option = menu(menuOpciones);
            switch (option) {
                case 0://SALIDA APP
                    System.out.println("Volviendo al menu principal");
                    //ToolsAndMenu.sleepThread(0);//Pausa por tiempo
                    return;//Me voy de la funcion
                case 1:
                    datosPrograma.MostrarVuelos();
                    ToolsAndMenu.pausa();
                    break;
                case 2:
                    Vuelo nuevoVuelo = Vuelo.createVuelo(null, null, null);
                    datosPrograma.nuevoVuelo(nuevoVuelo);
                    ToolsAndMenu.pausa();
                    break;
                case 3:
                    seleccionarVuelos();
                    ToolsAndMenu.pausa();
                    break;
            }
        }
    }

    private static void seleccionarVuelos() {
        String[] titulos = {"AirNewAndorra", "1. Gestion", "2. Gestion Vuelos"};
        String[] listaStrVuelos = datosPrograma.getlistaVuelos();
        String[] listaStrVuelosActualizada = new String[listaStrVuelos.length + 1];
        System.arraycopy(listaStrVuelos, 0, listaStrVuelosActualizada, 0, listaStrVuelos.length);
        listaStrVuelosActualizada[listaStrVuelos.length] = "0 - Volver";
        while (true) {
            title(titulos);
            int option = menu(listaStrVuelosActualizada);
            if (option >= 0 && option <= listaStrVuelosActualizada.length - 1) {
                switch (option) {
                    case 0:
                        System.out.println("Volviendo al menú principal");
                        return;
                    default:
                        Vuelo vuelosSeleccionado = datosPrograma.returnVueloObjById(option);
                        menuVuelosSeleccionado(vuelosSeleccionado);
                        // Haz algo con el pasajero seleccionado
                        break;
                }
            } else {
                System.out.println("Selección incorrecta. Por favor, elige una opción válida.");
            }
        }
    }

    private static void menuVuelosSeleccionado(Vuelo vueloSeleccionado) {
        String[] titulos = {"AirNewAndorra", "2.Gestor", "3.Vuelo"};
        String[] menuOpciones = {"1.Mostrar Vuelo", "2.Modificar Vuelo", "3.Eliminar Vuelo", "4.Mostrar lista de pasajeros", "0.Volver"};
        while (true) {  //Bucle infinito
            title(titulos);
            int option = menu(menuOpciones);
            switch (option) {
                case 0://SALIDA APP
                    System.out.println("Volviendo al menu principal");
                    //ToolsAndMenu.sleepThread(0);//Pausa por tiempo
                    return;//Me voy de la funcion
                case 1:
                    datosPrograma.MostrarVuelos();
                    ToolsAndMenu.pausa();
                    break;
                case 2:
                    //datosPrograma.MostrarClases();
                    ToolsAndMenu.pausa();
                    break;
                case 3:
                    if (ToolsAndMenu.getYESorNOTFromKB("borrar el vuelo")) {
                        datosPrograma.BorrarVuelo(vueloSeleccionado);
                        ToolsAndMenu.pausa();
                        return;
                    } else {
                        System.out.println("El vuelo " + vueloSeleccionado.getId() + " - " + vueloSeleccionado.getAeropuertoOrigen() + " -> " + vueloSeleccionado.getAeropuertoDestino() + " NO fue borrado.");
                        break;
                    }

                case 4:
                    datosPrograma.mostarListaPasajerosVuelo(vueloSeleccionado);
                    ToolsAndMenu.pausa();
                    break;
            }
        }
    }

    static void menuClases() {
        String[] titulos = {"AirNewAndorra", "2.Gestor", "2.Clases"};
        String[] menuOpciones = {"1.Mostrar Clases", "0.Volver"};
        while (true) {  //Bucle infinito
            title(titulos);
            int option = menu(menuOpciones);
            switch (option) {
                case 0://SALIDA APP
                    System.out.println("Volviendo al menu principal");
                    //ToolsAndMenu.sleepThread(0);//Pausa por tiempo
                    return;//Me voy de la funcion
                //break;
                case 1:
                    datosPrograma.MostrarClases();
                    ToolsAndMenu.pausa();
                    return;

            }
        }
    }

    static void menuDestinos() {
        String[] titulos = {"AirNewAndorra", "2.Gestor", "3.Destinos"};
        String[] menuOpciones = {"1.Mostrar Destinos", "0.Volver"};
        while (true) {  //Bucle infinito
            title(titulos);
            int option = menu(menuOpciones);
            switch (option) {
                case 0://SALIDA APP
                    System.out.println("Volviendo al menu principal");
                    //ToolsAndMenu.sleepThread(0);//Pausa por tiempo
                    return;//Me voy de la funcion
                //break;
                case 1:
                    datosPrograma.MostrarDestinos();
                    ToolsAndMenu.pausa();
                    return;
            }
        }
    }

    static void menuOrigenes() {
        String[] titulos = {"AirNewAndorra", "2.Gestor", "3.Destinos"};
        String[] menuOpciones = {"1.Mostrar Destinos", "0.Volver"};
        while (true) {  //Bucle infinito
            title(titulos);
            int option = menu(menuOpciones);
            switch (option) {
                case 0://SALIDA APP
                    System.out.println("Volviendo al menu principal");
                    //ToolsAndMenu.sleepThread(0);//Pausa por tiempo
                    return;//Me voy de la funcion
                //break;
                case 1:
                    datosPrograma.MostrarOrigenes();
                    ToolsAndMenu.pausa();
                    return;
            }
        }
    }

    static void modificarPasajeros(List<Pasajero> listaPasajeros) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de DNI del pasajero que desea modificar: ");
        String dni = scanner.nextLine();
        boolean encontrado = false;

        for (Pasajero pasajero : listaPasajeros) {
            if (pasajero.getDni().equals(dni)) {
                encontrado = true;

                scanner = new Scanner(System.in);
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
                } while (opcion != 10);

                scanner.close();
            }
        }
    }

    public static void main(String[] args) {
        menuPrincipal();
    }

    private static void mostrarPasajeros(List<Pasajero> mostrarListaPasajeros) {
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

}
