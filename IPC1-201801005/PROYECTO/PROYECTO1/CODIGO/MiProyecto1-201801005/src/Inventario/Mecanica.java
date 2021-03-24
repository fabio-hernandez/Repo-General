/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inventario;

/**
 *
 * @author HernandezMartinez
 */
public class Mecanica {
    
    private String nombreActividad;
    private double precio;

    public Mecanica(String nombreactividad, String precio) {
        this.nombreActividad = nombreactividad;
        this.precio = Double.parseDouble(precio);
    }

    public Mecanica() {
        this.nombreActividad = "";
        this.precio = 0.00;
    }
    
    public String Resumen(){
    return getNombreActividad();
    }

    /**
     * @return the nombreActividad
     */
    public String getNombreActividad() {
        return nombreActividad;
    }

    /**
     * @param nombreActividad the nombreActividad to set
     */
    public void setNombreActividad(String nombreActividad) {
        this.nombreActividad = nombreActividad;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
    
    
}
