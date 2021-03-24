package MemoriaDinamica;

import Interfaz.Ventana;

//@author: Fabio hernández
public class ListaCircular {

    // Puntero que indica el inicio de la lista o conocida tambien como cabeza de la lista.
    private Nodo cabeza;
    // Puntero que indica el final de la lista o el ultimo nodo.
    private Nodo ultimo;

    public ListaCircular() {
        this.cabeza = null;
        this.ultimo = null;
    }

    public boolean esVacia() {
        return cabeza == null;
    }

    public void agregar(int ID, String nombre) {

        Nodo nuevo = new Nodo(ID, nombre);

        if (esVacia()) {
            this.cabeza = nuevo;
            this.ultimo = nuevo;
            this.ultimo.setSiguiente(cabeza);

        } else {
            this.ultimo.setSiguiente(nuevo);
            nuevo.setSiguiente(cabeza);
            this.ultimo = nuevo;

        }
    }

    public void mostrar() {
        if (!esVacia()) {
            //Se crea una copia de la lista
            Nodo aux = cabeza;
            String cadena = "";
            do {
                cadena = cadena + "\n" + aux.getID() + " [label = " + aux.getNombre() + "];" + "\n" + aux.getID() + "->" + aux.getSiguiente().getID();
                aux = aux.getSiguiente();
            } while (aux != cabeza);
            Ventana.jTextArea1.setText("digraph Lista_Circular{" + cadena + "\n}");
        }
    }
}
