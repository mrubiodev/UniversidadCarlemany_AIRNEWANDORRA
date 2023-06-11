package com.airnewandorra.airnewandorra;

import com.airnewandorra.models.Pasajero;
import com.airnewandorra.models.Vuelo;
import com.libraryMenuTools.ToolsAndMenu;
import static com.libraryMenuTools.ToolsAndMenu.menu;
import static com.libraryMenuTools.ToolsAndMenu.title;

import com.airnewandorra.data.Datos;

public class AirNewAndorra {

    public static Datos datosPrograma;

    static void menuPrincipal() {
        datosPrograma = new Datos();
        String[] menuOpciones = {"1.Cliente", "2.Gestor", "0.Salir \n"};

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
        String[] menuOpciones = {"1.Crear Pasajero", "2.Ver lista de Pasajeros", "3.Seleccionar Pasajero", "0. Volver \n"};
        while (true) {  //Bucle infinito
            title(titulos);
            int option = menu(menuOpciones);
            switch (option) {
                case 0://SALIDA APP
                    System.out.println("Volviendo al menu principal \n");
                    return;//Me voy de la funcion
                case 1:
                    datosPrograma.crearPasajero(datosPrograma.getListaPasajeros());
                    ToolsAndMenu.pausa();
                    break;
                case 2:
                    datosPrograma.mostrarPasajeros(datosPrograma.getListaPasajeros());
                    ToolsAndMenu.pausa();
                    break;
                case 3:
                    // SELECIONAR PASAJERO
                    selectPasajero();
                    ToolsAndMenu.pausa();
                    break;
            }
        }
    }

    static void selectPasajero() {
        String[] titulos = {"AirNewAndorra", "1. Cliente", "2. Seleccionar Pasajero", "0.Volver"};

        while (true) {
            title(titulos);
            String[] listaStrPasajeros = datosPrograma.getlistaPasajeros();
            String[] listaStrPasajerosActualizada = new String[listaStrPasajeros.length + 1];
            System.arraycopy(listaStrPasajeros, 0, listaStrPasajerosActualizada, 0, listaStrPasajeros.length);
            listaStrPasajerosActualizada[listaStrPasajeros.length] = "0 - Volver";
            int option = menu(listaStrPasajerosActualizada);
            if (option >= 0 && option <= listaStrPasajerosActualizada.length - 1) {
                switch (option) {
                    case 0:
                        System.out.println("Volviendo al menú principal \n");
                        return;
                    default:
                        Pasajero pasajeroSeleccionado = datosPrograma.returnPasajeroObjById(option);
                        menuPasajeroSeleccionado(pasajeroSeleccionado);
                        // Haz algo con el pasajero seleccionado
                        break;
                }
            } else {
                System.out.println("Selección incorrecta. Por favor, elige una opción válida. \n");
            }
        }
    }

    static void menuPasajeroSeleccionado(Pasajero pasajeroSeleccionado) {
        String[] titulos = {"AirNewAndorra", "1.Crear Pasajero", "2.Ver lista de Pasajeros", "3." + pasajeroSeleccionado.getNombreApellido()};
        String[] menuOpciones = {"1.Modificar", "2.Crear Reserva", "3.Ver lista de Reservas", "4.Modificar Reserva", "0.Volver"};
        while (true) {  //Bucle infinito
            titulos[3] = "3." + pasajeroSeleccionado.getNombreApellido(); // Actualizar el título con el nombre actualizado
            title(titulos);
            int option = menu(menuOpciones);
            switch (option) {
                case 0://SALIDA APP
                    System.out.println("Volviendo al menu anterior \n");
                    return;//Me voy de la funcion
                case 1:
                    datosPrograma.modificarPasajero(pasajeroSeleccionado);
                    ToolsAndMenu.pausa();
                    break;
                case 2:
                    datosPrograma.crearReserva(pasajeroSeleccionado);
                    ToolsAndMenu.pausa();
                    break;
                case 3:
                    // VER LISTA RESERVA
                    datosPrograma.listaReservasPasajero(pasajeroSeleccionado);
                    ToolsAndMenu.pausa();
                    break;
                case 4:
                    // MODIFICAR RESERVA
                    ToolsAndMenu.pausa();
                    break;
            }
        }
    }

    static void menuGestor() {
        String[] titulos = {"AirNewAndorra", "2.Gestor"};
        String[] menuOpciones = {"1.Vuelos", "2.Clases", "3.Origenes", "4.Destinos", "0.Volver \n"};
        while (true) {  //Bucle infinito
            title(titulos);
            int option = menu(menuOpciones);
            switch (option) {
                case 0://SALIDA APP
                    System.out.println("Volviendo al menu principal \n");
                    return;//Me voy de la funcion
                //break;
                case 1:
                    menuVuelos();
                    break;
                case 2:
                    menuClases();
                    break;
                case 3:
                    menuOrigenes();
                    break;
                case 4:
                    menuDestinos();
                    break;

            }
        }
    }

    private static void menuVuelos() {
        String[] titulos = {"AirNewAndorra", "2.Gestor", "3.Vuelos"};
        String[] menuOpciones = {"1.Mostrar Vuelos", "2.Crear Vuelo", "3.Seleccionar Vuelo para modificar", "0.Volver \n"};
        while (true) {  //Bucle infinito
            title(titulos);
            int option = menu(menuOpciones);
            switch (option) {
                case 0://SALIDA APP
                    System.out.println("Volviendo al menu anterior \n");
                    return;//Me voy de la funcion
                case 1:
                    datosPrograma.MostrarVuelos(datosPrograma.getlistaVuelos());
                    ToolsAndMenu.pausa();
                    break;
                case 2:
                    datosPrograma.nuevoVuelo();
                    ToolsAndMenu.pausa();
                    break;
                case 3:
                    seleccionarVuelo();
                    ToolsAndMenu.pausa();
                    break;
            }
        }
    }
    
    static void seleccionarVuelo() {
        String[] titulos = {"AirNewAndorra", "2. Vuelos", "3. Seleccionar Vuelo para modificar", "0.Volver"};

        while (true) {
            title(titulos);
            String[] listaStrVuelos = datosPrograma.getListaVuelos();
            String[] listaStrVuelosActualizada = new String[listaStrVuelos.length + 1];
            System.arraycopy(listaStrVuelos, 0, listaStrVuelosActualizada, 0, listaStrVuelos.length);
            listaStrVuelosActualizada[listaStrVuelos.length] = "0 - Volver";
            int option = menu(listaStrVuelosActualizada);
            if (option >= 0 && option <= listaStrVuelosActualizada.length - 1) {
                switch (option) {
                    case 0:
                        System.out.println("Volviendo al menu anterior \n");
                        return;
                    default:
                        Vuelo vueloSeleccionado = datosPrograma.returnVueloObjById(option);
                        datosPrograma.modificarVuelo(vueloSeleccionado);
                        // Haz algo con el pasajero seleccionado
                        break;
                }
            } else {
                System.out.println("Seleccion incorrecta. Por favor, elige una opcion valida. \n");
            }
        }
    }

    static void menuClases() {
        String[] titulos = {"AirNewAndorra", "2.Gestor", "3.Clases"};
        String[] menuOpciones = {"1.Mostrar Clases", "0.Volver \n"};
        while (true) {  //Bucle infinito
            title(titulos);
            int option = menu(menuOpciones);
            switch (option) {
                case 0://SALIDA APP
                    System.out.println("Volviendo al menu anterior \n");
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
        String[] menuOpciones = {"1.Mostrar Destinos", "0.Volver \n"};
        while (true) {  //Bucle infinito
            title(titulos);
            int option = menu(menuOpciones);
            switch (option) {
                case 0://SALIDA APP
                    System.out.println("Volviendo al menu anterior \n");
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
        String[] titulos = {"AirNewAndorra", "2.Gestor", "3.Origenes"};
        String[] menuOpciones = {"1.Mostrar Origenes", "0.Volver \n"};
        while (true) {  //Bucle infinito
            title(titulos);
            int option = menu(menuOpciones);
            switch (option) {
                case 0://SALIDA APP
                    System.out.println("Volviendo al menu principal \n");
                    return;//Me voy de la funcion
                //break;
                case 1:
                    datosPrograma.MostrarOrigenes();
                    ToolsAndMenu.pausa();
                    return;
            }
        }
    }

    public static void main(String[] args) {
        menuPrincipal();
    }

}
