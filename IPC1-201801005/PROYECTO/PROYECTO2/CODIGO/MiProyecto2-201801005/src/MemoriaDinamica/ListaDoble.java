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
public class ListaDoble {

    NodoLD primero, ultimo;
    int tamaño;

    public ListaDoble() {
        primero = ultimo = null;
    }

    public NodoLD primero_a() {
        return primero;
    }

    public boolean esVacia() {
        return (this.primero == null);
    }

    public void agregar(int ID, int valor) {
        NodoLD nuevo = new NodoLD();
        nuevo.setID(ID);
        nuevo.setNum(valor);
        if (primero == null) {
            primero = nuevo;
            primero.setSiguiente(null);
            primero.setAnterior(null);
            ultimo = primero;
        } else {
            ultimo.setSiguiente(nuevo);
            nuevo.setAnterior(ultimo);
            nuevo.setSiguiente(null);
            ultimo = nuevo;
        }

        tamaño++;
    }

    
    
    
    public void print(JTextArea area) {

        NodoLD aux = primero;
        String cadena = "";
        if (!esVacia()) {
            while (aux != null) {
                cadena += (aux.getID() + "[label=" + "\"" + aux.getNum() + ", AZUL\"" + "]\n");
                if (aux.getID() < tamaño) {
                    cadena += aux.getID() + "->" + (aux.getID() + 1) + "\n";
                    cadena += (aux.getID() + 1) + "->" + aux.getID() + "\n";
                }
                aux = aux.getSiguiente();
            }

        } else {
            System.out.println("-->La lista esta vacia");
        }
        area.setText("Digraph G{ \n" + cadena + "\n}");
        System.out.println("Digraph G{ \n" + cadena + "\n}");
    }

}
