/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona;

/**
 *
 * @author HernandezMartinez
 */
public class NoAsegurado {

    private String Nombre;
    private String Apellido;
    private String DPI;
    private String Telefono;
    private String NombreRepuesto;
    private int PrecioRepuesto;
    private String Rol;

    public NoAsegurado(String Nombre, String Apellido, String DPI, String Telefono, String NombreRepuesto, int PrecioRepuesto) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.DPI = DPI;
        this.Telefono = Telefono;
        this.NombreRepuesto = NombreRepuesto;
        this.PrecioRepuesto = PrecioRepuesto;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Apellido
     */
    public String getApellido() {
        return Apellido;
    }

    /**
     * @param Apellido the Apellido to set
     */
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    /**
     * @return the DPI
     */
    public String getDPI() {
        return DPI;
    }

    /**
     * @param DPI the DPI to set
     */
    public void setDPI(String DPI) {
        this.DPI = DPI;
    }

    /**
     * @return the Telefono
     */
    public String getTelefono() {
        return Telefono;
    }

    /**
     * @param Telefono the Telefono to set
     */
    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }  

    /**
     * @return the NombreRepuesto
     */
    public String getNombreRepuesto() {
        return NombreRepuesto;
    }

    /**
     * @param NombreRepuesto the NombreRepuesto to set
     */
    public void setNombreRepuesto(String NombreRepuesto) {
        this.NombreRepuesto = NombreRepuesto;
    }

    /**
     * @return the PrecioRepuesto
     */
    public int getPrecioRepuesto() {
        return PrecioRepuesto;
    }

    /**
     * @param PrecioRepuesto the PrecioRepuesto to set
     */
    public void setPrecioRepuesto(int PrecioRepuesto) {
        this.PrecioRepuesto = PrecioRepuesto;
    }

    /**
     * @return the Rol
     */
    public String getRol() {
        return Rol;
    }

    /**
     * @param Rol the Rol to set
     */
    public void setRol(String Rol) {
        this.Rol = Rol;
    }

}
