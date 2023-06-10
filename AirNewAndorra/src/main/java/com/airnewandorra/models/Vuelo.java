package com.airnewandorra.models;

import com.airnewandorra.enums.TipoAvion;
import com.libraryMenuTools.ToolsAndMenu;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author VM_Mainak
 */
public class Vuelo {

    private static final AtomicInteger count = new AtomicInteger(0);
    private final int id;
    private Origen aeropuertoOrigen;
    private Destino aeropuertoDestino;
    private String horaSalida;
    private String horaLlegada;
    private double duracion; //minutos
    private String fechaVuelo;
    private TipoAvion tipoAvion;
    private int numMaxPasajeros;
    private int numMinPasajeros;

    public Vuelo() {
        this.id = count.incrementAndGet();
    }

    public Vuelo(Origen aeropuertoOrigen, Destino aeropuertoDestino, String horaSalida, String horaLlegada, double duracion, String fechaVuelo, TipoAvion tipoAvion, int numMaxPasajeros, int numMinPasajeros) {
        this.id = count.incrementAndGet();
        this.aeropuertoOrigen = aeropuertoOrigen;
        this.aeropuertoDestino = aeropuertoDestino;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.duracion = duracion;
        this.fechaVuelo = fechaVuelo;
        this.tipoAvion = tipoAvion;
        this.numMaxPasajeros = numMaxPasajeros;
        this.numMinPasajeros = numMinPasajeros;
    }

    public int getId() {
        return id;
    }

    public String getAeropuertoOrigen() {
        return aeropuertoOrigen.getNombreOrigen();
    }

    public void setAeropuertoOrigen(Origen aeropuertoOrigen) {
        this.aeropuertoOrigen = aeropuertoOrigen;
    }

    public String getAeropuertoDestino() {
        return aeropuertoDestino.getNombreDestino();
    }

    public void setAeropuertoDestino(Destino aeropuertoDestino) {
        this.aeropuertoDestino = aeropuertoDestino;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(String horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String getFechaVuelo() {
        return fechaVuelo;
    }

    public void setFechaVuelo(String fechaVuelo) {
        this.fechaVuelo = fechaVuelo;
    }

    public TipoAvion getTipoAvion() {
        return this.tipoAvion;
    }

    public void setTipoAvion(TipoAvion tipoAvion) {
        this.tipoAvion = tipoAvion;
    }

    public int getNumMaxPasajeros() {
        return numMaxPasajeros;
    }

    public void setNumMaxPasajeros(int numMaxPasajeros) {
        this.numMaxPasajeros = numMaxPasajeros;
    }

    public int getNumMinPasajeros() {
        return numMinPasajeros;
    }

    public void setNumMinPasajeros(int numMinPasajeros) {
        this.numMinPasajeros = numMinPasajeros;
    }

    public static Vuelo createVuelo(Origen origen, Destino destino, TipoAvion avion) {
        Origen aeropuertoOrigen = origen;
        Destino aeropuertoDestino = destino;
        String horaSalida = ToolsAndMenu.getStringFromKB("hora de salida");
        String horaLlegada = ToolsAndMenu.getStringFromKB("hora de llegada");
        Double duracion = ToolsAndMenu.getDoubleFromKB("duración");
        String fechaVuelo = ToolsAndMenu.getStringFromKB("fecha de vuelo (en formato dd/mm/yyyy)");
        TipoAvion tipoAvion = avion;
        int numMaxPasajeros = ToolsAndMenu.getIntFromKB("número máximo de pasajeros");
        int numMinPasajeros = ToolsAndMenu.getIntFromKB("número mínimo de pasajeros");

        return new Vuelo(aeropuertoOrigen, aeropuertoDestino, horaSalida, horaLlegada, duracion, fechaVuelo, tipoAvion, numMaxPasajeros, numMinPasajeros);
    }

}
