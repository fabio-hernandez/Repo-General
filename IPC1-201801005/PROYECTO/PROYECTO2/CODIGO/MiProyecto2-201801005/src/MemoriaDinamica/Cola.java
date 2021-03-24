/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MemoriaDinamica;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author HernandezMartinez
 */
public class Cola {

    private NodoCola cabeza, ultimo;
    private int tamaño;

    public Cola() {
        this.cabeza = null;
    }

    public boolean esVacia() {
        if (cabeza == null) {
            return true;
        } else {
            return false;
        }
    }

    public void encolar(int ID, int valor) {

        NodoCola nuevo = new NodoCola(ID, valor);
        nuevo.setSiguiente(null);

        if (esVacia()) {
            this.cabeza = nuevo;
            this.ultimo = nuevo;
        } else {
            this.ultimo.setSiguiente(nuevo);
            this.ultimo = nuevo;
        }
        tamaño++;
    }

    public void desencolar() {
        NodoCola aux = cabeza;
        if (aux != null) {
            cabeza = cabeza.getSiguiente();
            imprimir();
        }
    }

    public void imprimir() {
        NodoCola aux = cabeza;
        System.out.println("Listado de todos los elementos de la cola.");
        while (aux != null) {
            System.out.println(aux.getID() + "," + aux.getValor());
            aux = aux.getSiguiente();
        }

    }

    public void mostrar(JTextArea area) {
        NodoCola aux = cabeza;
        String cadena = "";
        // Posicion de los elementos de la lista.
        area.setText("");
        if (esVacia()) {
            JOptionPane.showMessageDialog(null, "La cola se encuentra vacía");
        } else {
            while (aux.getSiguiente() != null) {
                cadena += aux.getID() + "[label = \"" + aux.getValor() + ", VERDE\"]\n";
                cadena += aux.getID() + "->" + aux.getSiguiente().getID() + "\n";
                aux = aux.getSiguiente();
            }
        }
        //Setea el texto Graphviz al JTextArea
        area.setText("digraph G{\n" + cadena + "\n}");
        System.out.println("digraph G{\n" + cadena + "\n}");
    }

    /**
     * @return the cabeza
     */
    public NodoCola getCabeza() {
        return cabeza;
    }

    /**
     * @param cabeza the cabeza to set
     */
    public void setCabeza(NodoCola cabeza) {
        this.cabeza = cabeza;
    }

    /**
     * @return the tamaño
     */
    public int getTamaño() {
        return tamaño;
    }

}
