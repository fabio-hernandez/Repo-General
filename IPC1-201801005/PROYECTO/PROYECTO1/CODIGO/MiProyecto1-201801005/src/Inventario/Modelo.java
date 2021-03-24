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
public class Modelo {
    
    private int año;
    private double pctdepre;

    public Modelo(int año, String pctdepre) {
        this.año = año;
        this.pctdepre = Double.parseDouble(pctdepre);
    }

    public Modelo() {
        this.año = 0;
        this.pctdepre= 0.00;

    }
    
    
    public int Resumen() {
        
        return getAño();

    }

    /**
     * @return the año
     */
    public int getAño() {
        return año;
    }

    /**
     * @param año the año to set
     */
    public void setAño(int año) {
        this.año = año;
    }

    /**
     * @return the pctdepre
     */
    public double getPctdepre() {
        return pctdepre;
    }

    /**
     * @param pctdepre the pctdepre to set
     */
    public void setPctdepre(double pctdepre) {
        this.pctdepre = pctdepre;
    }
}
