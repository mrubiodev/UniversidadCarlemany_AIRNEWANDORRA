/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airnewandorra.airnewandorra.models;

import java.util.Date;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author VM_Mainak
 */
public class Pasajero {
    private static final AtomicInteger count = new AtomicInteger(0); 
    private final int ID;
    private String nombreApellido;
    private String dni;
    private String pasaporte;
    private String telefono;
    private String correo;
    private String provincia;
    private String pais;
    private String contacto;
    private Date fechaNacimiento;
    
    public Pasajero(String nombreApellido, String dni, String pasaporte, String telefono, String correo, String provincia, String pais, String contacto, Date fechaNacimiento) {
        this.ID = count.incrementAndGet();
        this.nombreApellido = nombreApellido;
        this.dni = dni;
        this.pasaporte = pasaporte;
        this.telefono = telefono;
        this.correo = correo;
        this.provincia = provincia;
        this.pais = pais;
        this.contacto = contacto;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getID() {
        return ID;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(String pasaporte) {
        this.pasaporte = pasaporte;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

}
