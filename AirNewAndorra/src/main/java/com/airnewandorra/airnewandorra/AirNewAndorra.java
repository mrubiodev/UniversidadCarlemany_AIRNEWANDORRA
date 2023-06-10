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
        String[] menuOpciones = {"1.Crear Pasajero", "2.Ver lista de Pasajeros", "3.Seleccionar Pasajero"};
        while (true) {  //Bucle infinito
            title(titulos);
            int option = menu(menuOpciones);
            switch (option) {
                case 0://SALIDA APP
                    System.out.println("Volviendo al menu principal");
                    //ToolsAndMenu.sleepThread(0);//Pausa por tiempo
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
                    ToolsAndMenu.pausa();
                    break;
            }
        }
    }
    
    static void submenuCliente() {
        String[] titulos = {"AirNewAndorra", "1.Crear Pasajero", "2.Crear Reserva", "3.Ver lista de Pasajeros"};
        String[] menuOpciones = {"1.Modificar Pasajero por DNI", "2.Crear Reserva", "3.Ver lista de Reservas", "4.Modificar Reserva", "0.Volver"};
        while (true) {  //Bucle infinito
            title(titulos);
            int option = menu(menuOpciones);
            switch (option) {
                case 0://SALIDA APP
                    System.out.println("Volviendo al menu principal");
                    //ToolsAndMenu.sleepThread(0);//Pausa por tiempo
                    return;//Me voy de la funcion
                case 1:
                    datosPrograma.modificarPasajeros(datosPrograma.getListaPasajeros());
                    ToolsAndMenu.pausa();
                    break;
                case 2:
                    datosPrograma.mostrarPasajeros(datosPrograma.getListaPasajeros());
                    ToolsAndMenu.pausa();
                    break;
                case 3:
                    datosPrograma.modificarPasajeros(datosPrograma.getListaPasajeros());
                    ToolsAndMenu.pausa();
                    break;
            }
        }
    }

    static void menuGestor() {
        String[] titulos = {"AirNewAndorra", "2.Gestor"};
        String[] menuOpciones = {"1.Vuelos", "2.Clases", "3.Origenes", "4.Destinos", "5.Clases Vuelos", "0.Volver"};
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
                    datosPrograma.MostrarVuelos(datosPrograma.getlistaVuelos());
                    ToolsAndMenu.pausa();
                    break;
                case 2:
                    datosPrograma.nuevoVuelo();
                    ToolsAndMenu.pausa();
                    break;
                case 3:
                    //seleccionarVuelos();
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

    public static void main(String[] args) {
        menuPrincipal();
    }

}
