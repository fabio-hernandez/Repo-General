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
public class Marca {

    private String nombre;
    private double pctaumento;

    public Marca(String nombre, String pctaumento) {
        this.nombre = nombre;
        this.pctaumento = Double.parseDouble(pctaumento);
    }

    public Marca() {

        this.nombre = "";
        this.pctaumento = 0.00;
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

    public String Resumen() {

        return this.getNombre();

    }

}
