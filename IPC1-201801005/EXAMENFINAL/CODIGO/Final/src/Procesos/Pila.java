package Procesos;

//@author: Fabio Hernández

import javax.swing.JTextArea;

public class Pila {

    private Nodo cabeza;
    private int size;
    String lista;

    public Pila() {
        cabeza = null;
        size = 0;
        lista = "";
    }

    public boolean esVacia() {
        return cabeza == null;
    }

    public void push(int valor) {
        Nodo nuevo = new Nodo(valor);
        nuevo.siguiente = cabeza;
        cabeza = nuevo;
        size++;
    }

    public int pop() {
        int aux = cabeza.valor;
        this.cabeza = cabeza.siguiente;
        size--;
        return aux;
    }

    public void imprimir(JTextArea text){
        
    
    }
 
    public int getSize() {
        return size;
    }  
    
}

