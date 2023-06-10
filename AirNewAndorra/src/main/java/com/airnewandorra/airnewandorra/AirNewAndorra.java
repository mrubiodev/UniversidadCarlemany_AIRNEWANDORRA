

package com.airnewandorra.airnewandorra;

import com.utils.ToolsAndMenu;
import static com.utils.ToolsAndMenu.menu;
import static com.utils.ToolsAndMenu.title;

import com.airnewandorra.data.Datos;
public class AirNewAndorra {

    public static Datos datosPrograma;
    
    static void menuPrincipal(){
        datosPrograma = new Datos();
        String[] menuOpciones = {"1.Cliente", "2.Gestor", "0.Salir"};
        while (true){  //Bucle infinito
            title ("AirNewAndorra");
            int option = menu(menuOpciones);
            switch (option){
                case 0://SALIDA APP
                    System.out.println("Volviendo al menu principal");
                    ToolsAndMenu.sleepThread(3);//Pausa por tiempo
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
    
    static void menuCliente(){
        String[] titulos = {"AirNewAndorra", "1.Cliente"};
        String[] menuOpciones = {"1.Crear Pasajero", "2.Seleccionar Pasajero", "0.Volver"};
        title (titulos);
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
                    ToolsAndMenu.pausa();
                    break;
                case 2:
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
                    break;
            }
        }
    }    

    static void menuDestinos(){
        String[] titulos = {"AirNewAndorra", "2.Gestor", "3.Destinos"};
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
                    datosPrograma.MostrarDestinos();
                    ToolsAndMenu.pausa();
                    break;
            }
        }
    }    
    
    public static void main(String[] args) {
        menuPrincipal();
    }
}
