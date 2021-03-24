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
public class Asegurado {

    private String DPI;
    private String Nombre;
    private String Apellido;
    private String Telefono;
    private String Proteccion;
    private String EstadoTaller;
    private String EstadoPago;
    private String UltimaPrima;
    private String Rol;

    public Asegurado(String Rol) {
        this.Rol = Rol;
    }    

    public Asegurado(String DPI, String Nombre, String Apellido, String Telefono) {
        this.DPI = DPI;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Telefono = Telefono;
        this.Proteccion = "Vulnerable";
        this.UltimaPrima = "Pendiente";
    }

    public Asegurado(String EstadoTaller, String EstadoPago) {
        this.EstadoTaller = EstadoTaller;
        this.EstadoPago = EstadoPago;

    }

    public void Protegido() {
        setProteccion("Protegido");
    }

    public void Pagado() {
        setUltimaPrima("Pagado");
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
     * @return the Proteccion
     */
    public String getProteccion() {
        return Proteccion;
    }

    /**
     * @param Proteccion the Proteccion to set
     */
    public void setProteccion(String Proteccion) {
        this.Proteccion = Proteccion;
    }

    /**
     * @return the UltimaPrima
     */
    public String getUltimaPrima() {
        return UltimaPrima;
    }

    /**
     * @param UltimaPrima the UltimaPrima to set
     */
    public void setUltimaPrima(String UltimaPrima) {
        this.UltimaPrima = UltimaPrima;
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
     * @return the EstadoTaller
     */
    public String getEstadoTaller() {
        return EstadoTaller;
    }

    /**
     * @param EstadoTaller the EstadoTaller to set
     */
    public void setEstadoTaller(String EstadoTaller) {
        this.EstadoTaller = EstadoTaller;
    }

    /**
     * @return the EstadoPago
     */
    public String getEstadoPago() {
        return EstadoPago;
    }

    /**
     * @param EstadoPago the EstadoPago to set
     */
    public void setEstadoPago(String EstadoPago) {
        this.EstadoPago = EstadoPago;
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
