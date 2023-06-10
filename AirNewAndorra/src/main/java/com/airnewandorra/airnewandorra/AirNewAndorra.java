

package com.airnewandorra.airnewandorra;

import com.airnewandorra.models.Pasajero;
import com.libraryMenuTools.ToolsAndMenu;
import static com.libraryMenuTools.ToolsAndMenu.menu;
import static com.libraryMenuTools.ToolsAndMenu.title;

import com.airnewandorra.data.Datos;
public class AirNewAndorra {
    private static boolean DEBUGMODE = true;
    public static Datos datosPrograma;
    
    static void menuPrincipal(){
        datosPrograma = new Datos();
        String[] menuOpciones = {"1.Cliente", "2.Gestor", "0.Salir"};
        if (DEBUGMODE) {
            menuOpciones = new String[]{"1.Cliente", "2.Gestor", "3.Modo Demo", "0.Salir"};
        }
        while (true){  //Bucle infinito
            title ("AirNewAndorra");
            int option = menu(menuOpciones);
            switch (option){
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
                case 3:          //Menu debug
                    System.out.println("MODO DEMO ACTIVADO");
                    datosPrograma.modoDemo();
                    ToolsAndMenu.pausa();
                    break;
            }
        }
    }
    
    static void menuCliente(){
        String[] titulos = {"AirNewAndorra", "1.Cliente"};
        String[] menuOpciones = {"1.Crear Pasajero", "2.Seleccionar Pasajero", "3.Modificar Pasajero por DNI", "0.Volver"};
        while (true){  //Bucle infinito
            title (titulos);
            int option = menu(menuOpciones);
            switch (option){
                case 0://SALIDA APP
                    System.out.println("Volviendo al menu principal");
                    //ToolsAndMenu.sleepThread(0);//Pausa por tiempo
                    return;//Me voy de la funcion
                //break;
                case 1:
                    Pasajero nuevoPasajero = Pasajero.createPasajero();
                    datosPrograma.nuevoPasajero(nuevoPasajero);
                    ToolsAndMenu.pausa();
                    break;
                case 2:
                    selectPasajero();
                    ToolsAndMenu.pausa();
                    break;
                case 3:
                    datosPrograma.modificarPasajeros(datosPrograma.getListaPasajeros());
                    ToolsAndMenu.pausa();
                    break;
            }
        }
    }

    static void selectPasajero() {
        String[] titulos = { "AirNewAndorra", "1. Cliente", "2. Gestion Pasajero" };
        String[] listaStrPasajeros = datosPrograma.getlistaPasajeros();
        String[] listaStrPasajerosActualizada = new String[listaStrPasajeros.length + 1];
        System.arraycopy(listaStrPasajeros, 0, listaStrPasajerosActualizada, 0, listaStrPasajeros.length);
        listaStrPasajerosActualizada[listaStrPasajeros.length] = "0 - Volver";
        while (true) {
            title(titulos);
            int option = menu(listaStrPasajerosActualizada);
            if (option >= 0 && option <= listaStrPasajerosActualizada.length - 1) {
                switch (option) {
                    case 0:
                        System.out.println("Volviendo al menú principal");
                        return;
                    default:
                        Pasajero pasajeroSeleccionado = datosPrograma.returnPasajeroObjById(option);
                        menuPasajeroSeleccionado(pasajeroSeleccionado);
                        // Haz algo con el pasajero seleccionado
                        break;
                }
            } else {
                System.out.println("Selección incorrecta. Por favor, elige una opción válida.");
            }
        }
    }

    static void menuPasajeroSeleccionado(Pasajero pasajeroSeleccionado) {
        String[] titulos = {"AirNewAndorra", "1.Cliente","3." + pasajeroSeleccionado.getNombreApellido()};
        String[] menuOpciones = {"1.Mostrar datos Pasajero","2.Modificar Pasajero", "3.Crear Reserva", "0.Volver"};
        while (true){  //Bucle infinito
            title (titulos);
            int option = menu(menuOpciones);
            switch (option){
                case 0://SALIDA APP
                    System.out.println("Volviendo al menu principal");
                    //ToolsAndMenu.sleepThread(0);//Pausa por tiempo
                    return;//Me voy de la funcion
                //break;
                case 1:
                    datosPrograma.mostrarDatosPasajeroByObj(pasajeroSeleccionado);
                    ToolsAndMenu.pausa();
                    break;
                case 2:
                    Pasajero pasajeroModificado = pasajeroSeleccionado.ModificarPasajero(pasajeroSeleccionado);
                    if (ToolsAndMenu.getYESorNOTFromKB("modificar el pasajero")) {
                        datosPrograma.modificarPasajerosByObj(pasajeroModificado);
                    }
                    else{
                        System.out.println("El pasajero "+ pasajeroSeleccionado.getNombreApellido() + " NO fue modificado.");
                    }

                    ToolsAndMenu.pausa();
                    break;
                case 3:
                    //FALTA POR IMPLANTAR
                    ToolsAndMenu.pausa();
                    break;
            }
        }
    }

    static void menuGestor(){
        String[] titulos = {"AirNewAndorra", "2.Gestor"};
        String[] menuOpciones = {"1.Vuelos", "2.Clases", "3.Destinos", "4.Clases Vuelos", "0.Volver"};
        while (true){  //Bucle infinito
            title (titulos);
            int option = menu(menuOpciones);
            switch (option){
                case 0://SALIDA APP
                    System.out.println("Volviendo al menu principal");
                    //ToolsAndMenu.sleepThread(0);//Pausa por tiempo
                    return;//Me voy de la funcion
                    //break;
                case 1:
                    //FALTA POR IMPLANTAR
                    //menuVuelos();
                    ToolsAndMenu.pausa();
                    break;
                case 2:                
                    menuClases();
                    ToolsAndMenu.pausa();
                    break;
                case 3:                
                    menuDestinos();
                    ToolsAndMenu.pausa();
                    break;
                case 4:
                    //FALTA POR IMPLANTAR
                    //menuClasesDeVuelos();
                    ToolsAndMenu.pausa();
                    break;
            }
        }
    }

    static void menuClases(){
        String[] titulos = {"AirNewAndorra", "2.Gestor", "2.Clases"};
        String[] menuOpciones = {"1.Mostrar Clases", "0.Volver"};
        while (true){  //Bucle infinito
            title (titulos);
            int option = menu(menuOpciones);
            switch (option){
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

    static void menuDestinos(){
        String[] titulos = {"AirNewAndorra", "2.Gestor", "3.Destinos"};
        String[] menuOpciones = {"1.Mostrar Destinos", "0.Volver"};
        while (true){  //Bucle infinito
            title (titulos);
            int option = menu(menuOpciones);
            switch (option){
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
    
    public static void main(String[] args) {
        menuPrincipal();
    }
}
