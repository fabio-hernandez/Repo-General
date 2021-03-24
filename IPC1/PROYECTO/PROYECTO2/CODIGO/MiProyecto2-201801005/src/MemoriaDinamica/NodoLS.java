/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MemoriaDinamica;

/**
 *
 * @author HernandezMartinez
 */
public class NodoLS {

    private int Fila;
    private int Columna;
    private int Valor;
    private String color;
    private NodoLS siguiente;

    public NodoLS(int fila, int columna, int valor, String color) {
        this.Fila = fila;
        this.Columna = columna;
        this.Valor = valor;
        this.color = color;
        siguiente = null;
    }

    /**
     * @return the Fila
     */
    public int getFila() {
        return Fila;
    }

    /**
     * @param Fila the Fila to set
     */
    public void setFila(int Fila) {
        this.Fila = Fila;
    }

    /**
     * @return the Columna
     */
    public int getColumna() {
        return Columna;
    }

    /**
     * @param Columna the Columna to set
     */
    public void setColumna(int Columna) {
        this.Columna = Columna;
    }

    /**
     * @return the Valor
     */
    public int getValor() {
        return Valor;
    }

    /**
     * @param Valor the Valor to set
     */
    public void setValor(int Valor) {
        this.Valor = Valor;
    }

    /**
     * @return the siguiente
     */
    public NodoLS getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoLS siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }
}
