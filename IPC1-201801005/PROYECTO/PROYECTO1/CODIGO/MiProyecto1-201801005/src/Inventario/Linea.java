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
public class Linea {

    private String nombre;
    private double pctaumento;

    public Linea(String nombre, String pctaumento) {
        this.nombre = nombre;
        this.pctaumento = Double.parseDouble(pctaumento);
    }

    public Linea() {

        this.nombre = "";
        this.pctaumento = 0.00;
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
     * @return the pctaumento
     */
    public double getPctaumento() {
        return pctaumento;
    }

    /**
     * @param pctaumento the pctaumento to set
     */
    public void setPctaumento(double pctaumento) {
        this.pctaumento = pctaumento;
    }

}
