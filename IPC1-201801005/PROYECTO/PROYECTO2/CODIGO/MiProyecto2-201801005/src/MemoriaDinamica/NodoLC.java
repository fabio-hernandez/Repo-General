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
public class NodoLC {

    private int valor,ID;
    private NodoLC anterior, siguiente;

    public NodoLC(int ID, int valor){
        this.valor = valor;
        this.ID = ID;
        this.anterior = this;
        this.siguiente = this;
    }

    
    
    /**
     * @return the valor
     */
    public int getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        this.valor = valor;
    }

    /**
     * @return the anterior
     */
    public NodoLC getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(NodoLC anterior) {
        this.anterior = anterior;
    }

    /**
     * @return the siguiente
     */
    public NodoLC getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoLC siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }
    
    
    

    
}
