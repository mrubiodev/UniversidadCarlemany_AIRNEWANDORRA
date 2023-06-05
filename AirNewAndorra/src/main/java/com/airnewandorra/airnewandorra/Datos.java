/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.airnewandorra.airnewandorra;

import com.airnewandorra.airnewandorra.models.ClaseVuelo;
import com.airnewandorra.airnewandorra.models.Destino;
import com.airnewandorra.airnewandorra.models.Pasajero;
import com.airnewandorra.airnewandorra.models.Pasajero_Vuelo;
import com.airnewandorra.airnewandorra.models.Vuelo;
import com.airnewandorra.airnewandorra.models.Vuelo_Clase;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author minak
 */
public class Datos {
    
    private List<Pasajero>       listaPasajeros      = new ArrayList<>();
    private List<ClaseVuelo>     listaClases         = new ArrayList<>();
    private List<Destino>        listaDestinos       = new ArrayList<>();
    private List<Vuelo_Clase>    listaClasesVuelo    = new ArrayList<>();
    private List<Vuelo>          listaVuelos         = new ArrayList<>();
    private List<Pasajero_Vuelo> listaPasajerosVuelo = new ArrayList<>();    

    public Datos() {
        crearClasesVuelos();
        crearDestinos();
    }
    
    private void crearClasesVuelos(){
        String[] clases = {"Economic", "Bussness", "First"};
        for (String clase : clases) {
            ClaseVuelo claseObj = new ClaseVuelo(clase);
            listaClases.add(claseObj);
        }
    }
    
    private void crearDestinos (){
        String[] destinos = {"Madrid", "Barcelona", "Bilbao", "Sevilla"};
        for (String destino : destinos) {
            Destino destinoObj = new Destino(destino);
            listaDestinos.add(destinoObj);
        }
    }
    
}
