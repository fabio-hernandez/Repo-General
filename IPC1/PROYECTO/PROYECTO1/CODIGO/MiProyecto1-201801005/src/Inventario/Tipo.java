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
public class Tipo {

    private String nombre;
    private double valormax;

    public Tipo(String nombre, String valormax) {
        this.nombre = nombre;
        this.valormax = Double.parseDouble(valormax);
    }

    public Tipo() {

        this.nombre = "";
        this.valormax = 0.00;
    }

    public String Resumen() {

        return this.getNombre();

    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the valormax
     */
    public double getValormax() {
        return valormax;
    }

    /**
     * @param valormax the valormax to set
     */
    public void setValormax(double valormax) {
        this.valormax = valormax;
    }

}
