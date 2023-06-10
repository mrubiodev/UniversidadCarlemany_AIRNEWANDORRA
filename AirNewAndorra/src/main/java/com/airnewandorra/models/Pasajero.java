package com.airnewandorra.models;

import com.libraryMenuTools.ToolsAndMenu;
import java.util.List;
import java.util.Scanner;

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
    
    public void modificarPasajeros(List<Pasajero> listaPasajeros) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de DNI del pasajero que desea modificar: ");
        String dni = scanner.nextLine();
        boolean encontrado = false;

        for (Pasajero pasajero : listaPasajeros) {
          if (pasajero.getDni().equals(dni)) {
            encontrado = true;

            scanner = new Scanner(System.in);
            int opcion;

            do {

              System.out.println("Datos actuales del pasajero:");
              System.out.println("1 Nombre y apellidos: " + pasajero.getNombreApellido());
              System.out.println("2 DNI: " + pasajero.getDni());
              System.out.println("3 Pasaporte: " + pasajero.getPasaporte());
              System.out.println("4 Fecha de nacimiento: " + pasajero.getFechaNacimiento());
              System.out.println("5 Teléfono: " + pasajero.getTelefono());
              System.out.println("6 Email: " + pasajero.getCorreo());
              System.out.println("7 Provincia: " + pasajero.getProvincia());
              System.out.println("8 País: " + pasajero.getPais());
              System.out.println("9 Contacto de emergencia: " + pasajero.getContactoDeEmergencia());
              System.out.println("10 Salir: " + pasajero.getContactoDeEmergencia());
              System.out.print("Ingrese una opción: ");

              opcion = scanner.nextInt();

              switch (opcion) {
                case 1:
                  System.out.print("Ingrese el nuevo nombre y apellidos del pasajero: ");
                  String nuevoNombre = scanner.nextLine();
                  scanner.nextLine(); // Limpia el buffer
                  pasajero.setNombreApellido(nuevoNombre);
                  System.out.println("Datos del pasajero actualizados con éxito.");

                case 2:
                  System.out.print("Ingrese el nuevo DNI del pasajero: ");
                  String nuevoDNI = scanner.nextLine();
                  scanner.nextLine(); // Limpia el buffer
                  pasajero.setDni(nuevoDNI);
                  System.out.println("Datos del pasajero actualizados con éxito.");

                case 3:
                  System.out.print("Ingrese el nuevo pasaporte del pasajero: ");
                  String nuevoPasaporte = scanner.nextLine();
                  scanner.nextLine(); // Limpia el buffer
                  pasajero.setPasaporte(nuevoPasaporte);
                  System.out.println("Datos del pasajero actualizados con éxito.");

                case 4:
                  System.out.print("Ingrese la nueva fecha de nacimiento del pasajero: ");
                  String nuevaFechaNacimiento = scanner.nextLine();
                  scanner.nextLine(); // Limpia el buffer
                  pasajero.setFechaNacimiento(nuevaFechaNacimiento);
                  System.out.println("Datos del pasajero actualizados con éxito.");

                case 5:
                  System.out.print("Ingrese el nuevo teléfono del pasajero: ");
                  String nuevoTelefono = scanner.nextLine();
                  scanner.nextLine(); // Limpia el buffer
                  pasajero.setTelefono(nuevoTelefono);
                  System.out.println("Datos del pasajero actualizados con éxito.");

                case 6:
                  System.out.print("Ingrese el nuevo correo: ");
                  String nuevoCorreo = scanner.nextLine();
                  scanner.nextLine(); // Limpia el buffer
                  pasajero.setCorreo(nuevoCorreo);
                  System.out.println("Datos del pasajero actualizados con éxito.");

                case 7:
                  System.out.print("Ingrese la nueva provincia del pasajero: ");
                  String nuevaProvincia = scanner.nextLine();
                  scanner.nextLine(); // Limpia el buffer
                  pasajero.setProvincia(nuevaProvincia);
                  System.out.println("Datos del pasajero actualizados con éxito.");

                case 8:
                  System.out.print("Ingrese el nuevo pais: ");
                  String nuevoPais = scanner.nextLine();
                  scanner.nextLine(); // Limpia el buffer
                  pasajero.setPais(nuevoPais);
                  System.out.println("Datos del pasajero actualizados con éxito.");

                case 9:
                  System.out.print("Ingrese el nuevo pais: ");
                  String nuevoContactoDeEmergencia = scanner.nextLine();
                  scanner.nextLine(); // Limpia el buffer
                  pasajero.setContactoDeEmergencia(nuevoContactoDeEmergencia);
                  System.out.println("Datos del pasajero actualizados con éxito.");

                case 10:
                  System.out.print("Ha seleccionado 'Salir' ");
                  break;

                default:
                  System.out.print("Opción no válida. Inténtelo de nuevo");

              }
            } while (opcion != 10);

            scanner.close();
          }
        }
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

    @Override
    public String toString() {
        return "Pasajero{" + "ID=" + ID + ", nombreApellido=" + nombreApellido + ", dni=" + dni + ", pasaporte=" + pasaporte + ", telefono=" + telefono + ", correo=" + correo + ", provincia=" + provincia + ", pais=" + pais + ", contactoDeEmergencia=" + contactoDeEmergencia + ", fechaNacimiento=" + fechaNacimiento + '}';
    }

    

}
