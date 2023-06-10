package com.airnewandorra.models;

import com.libraryMenuTools.ToolsAndMenu;

import java.util.concurrent.atomic.AtomicInteger;

/** Esta clase representa un pasajero de un vuelo
 *  @version 1.0
 *  @since 1.0
*/
public class Pasajero {
    /**
     * Atributos de la clase Pasajero
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
    private String fechaNacimiento; // dd/MM/yyyy
    
    public Pasajero(String nombreApellido, String dni, String pasaporte, String telefono, String correo, String provincia, String pais, String contactoDeEmergencia, String fechaNacimiento) {
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

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /** Dado un pasajero lo modifica si se cambia algo pero no lo rescribe en el objeto hasta que se valide
     * @param pasajero
     * @return
     */
    static public Pasajero ModificarPasajero(Pasajero pasajero) {

        String nombreApellido = ToolsAndMenu.getStringFromKB("nuevo nombre y apellidos ("+pasajero.getNombreApellido()+")");
        String dni            = ToolsAndMenu.getStringFromKB("nuevo dni ("+pasajero.getDni()+")");
        String pasaporte      = ToolsAndMenu.getStringFromKB("nuevo pasaporte ("+pasajero.getPasaporte()+")");
        String telefono       = ToolsAndMenu.getStringFromKB("nuevo teléfono ("+pasajero.getTelefono()+")");
        String correo         = ToolsAndMenu.getStringFromKB("nuevo correo electronico ("+pasajero.getCorreo()+")");
        String provincia      = ToolsAndMenu.getStringFromKB("nuevo provincia ("+pasajero.getProvincia()+")");
        String pais           = ToolsAndMenu.getStringFromKB("nuevo pais ("+pasajero.getPais()+")");
        String contactoDeEmergencia = ToolsAndMenu.getStringFromKB("nuevo contacto de emergencia ("+pasajero.getContactoDeEmergencia()+")");
        String fechaNacimientoStr = ToolsAndMenu.getStringFromKB("nuevo fecha de nacimiento (en formato dd/mm/yyyy) ("+pasajero.getFechaNacimiento()+")");

        if (!nombreApellido.isEmpty()) {
            pasajero.setNombreApellido(nombreApellido);
        }
        if (!dni.isEmpty()) {
            pasajero.setDni(dni);
        }
        if (!pasaporte.isEmpty()) {
            pasajero.setPasaporte(pasaporte);
        }
        if (!telefono.isEmpty()) {
            pasajero.setTelefono(telefono);
        }
        if (!correo.isEmpty()) {
            pasajero.setCorreo(correo);
        }
        if (!provincia.isEmpty()) {
            pasajero.setProvincia(provincia);
        }
        if (!pais.isEmpty()) {
            pasajero.setPais(pais);
        }
        if (!contactoDeEmergencia.isEmpty()) {
            pasajero.setContactoDeEmergencia(contactoDeEmergencia);
        }
        if (!fechaNacimientoStr.isEmpty()) {
            pasajero.setFechaNacimiento(fechaNacimientoStr);
        }

        return pasajero;
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

        return new Pasajero(nombreApellido, dni, pasaporte, telefono, correo, provincia, pais, contactoDeEmergencia, fechaNacimientoStr);
    }


}
