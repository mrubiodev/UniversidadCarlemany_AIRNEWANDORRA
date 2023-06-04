package com.airnewandorra.airnewandorra.models;

import java.util.Date;
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
    private String contactoDeEmergencia;
    private Date fechaNacimiento;
    
    public Pasajero(String nombreApellido, String dni, String pasaporte, String telefono, String correo, String provincia, String pais, String contactoDeEmergencia, Date fechaNacimiento) {
        this.ID = count.incrementAndGet();
        this.nombreApellido = nombreApellido;
        this.dni = dni;
        this.pasaporte = pasaporte;
        this.telefono = telefono;
        this.correo = correo;
        this.provincia = provincia;
        this.pais = pais;
        this.contactoDeEmergencia = contactoDeEmergencia;
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

    public String getContactoDeEmergencia() {
        return contactoDeEmergencia;
    }

    public void setContactoDeEmergencia(String contactoDeEmergencia) {
        this.contactoDeEmergencia = contactoDeEmergencia;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

}
