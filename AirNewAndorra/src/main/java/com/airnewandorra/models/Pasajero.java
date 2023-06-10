package com.airnewandorra.models;

import com.utils.ToolsAndMenu;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

/** Esta clase representa un pasajero de un vuelo
 *  @version 1.0
 *  @since 1.0
*/
public class Pasajero {
    /**
     * Atributos de la clase Pasajero
     *  @param ID
     *      Identificador del pasajero
     *  @param nombreApellido
     *      Nombre y apellidos del pasajero
     *  @param dni
     *      DNI del pasajero
     *  @param pasaporte
     *      Pasaporte del pasajero
     *  @param telefono
     *      Telefono del pasajero
     *  @param correo
     *      Correo electronico del pasajero
     *  @param provincia
     *      Provincia del pasajero
     *  @param pais
     *      Pais del pasajero
     *  @param contactoDeEmergencia
     *    Contacto de emergencia del pasajero
     *  @param fechaNacimiento
     *    Fecha de nacimiento del pasajero
     */
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

    /** Este metodo crea un pasajero a partir de los datos introducidos por el usuario
        *  @return Pasajero
        */

    static public Pasajero createPasajero() {

        String nombreApellido = ToolsAndMenu.getStringFromKB("nombre y apellidos");
        String dni            = ToolsAndMenu.getStringFromKB("dni");
        String pasaporte      = ToolsAndMenu.getStringFromKB("pasaporte");
        String telefono       = ToolsAndMenu.getStringFromKB("teléfono");
        String correo         = ToolsAndMenu.getStringFromKB("correo electronico");
        String provincia      = ToolsAndMenu.getStringFromKB("provincia");
        String pais           = ToolsAndMenu.getStringFromKB("pais");
        String contactoDeEmergencia = ToolsAndMenu.getStringFromKB("contacto de emergencia");
        String fechaNacimientoStr = ToolsAndMenu.getStringFromKB("fecha de nacimiento (en formato dd/mm/yyyy)");

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaNacimiento = null;
        try {
            fechaNacimiento = dateFormat.parse(fechaNacimientoStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        Pasajero pasajero = new Pasajero(nombreApellido, dni, pasaporte, telefono, correo, provincia, pais, contactoDeEmergencia, fechaNacimiento);
        return pasajero;
    }
}
