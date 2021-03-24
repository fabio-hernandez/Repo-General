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

    

    public boolean buscar(int id) {
        // Crea una copia de la lista.
        Nodo aux = cabeza;
        boolean encontrado = false;
        // Recorre la lista hasta encontrar el elemento o hasta llegar al primer nodo nuevamente.
        do {
            // Consulta si el valor del nodo es igual al de referencia.
            if (id == aux.getID()) {
                // Cambia el valor del booleano.
                encontrado = true;
            } else {
                // Avanza al siguiente nodo.
                aux = aux.getSiguiente();
            }
        } while (aux != cabeza && encontrado != true);

        return encontrado;
    }

    public void editar(int id, String nombre) {

        // Consulta si el valor existe en la lista.
        if (buscar(id)) {
            // Crea ua copia de la lista.
            Nodo aux = cabeza;
            // Recorre la lista hasta llegar al nodo de referencia.
            while (aux.getID() != id) {
                aux = aux.getSiguiente();
            }
            // Actualizamos el valor del nodo
            aux.setNombre(nombre);
        }
    }
    
        public void mostar() {
            
        if (!esVacia()) {
            //Se crea una copia de la lista
            Nodo aux = cabeza;
            String cadena = "";
            do {
                cadena += "\n" + aux.getID() + " [label = " + aux.getNombre() + "];" + "\n" + aux.getID() + "->" + aux.getSiguiente().getID();
                aux = aux.getSiguiente();
            } while (aux != cabeza);
            Ventana.jTextArea1.setText("digraph Lista_Circular{" + cadena + "\n}");
        }
    }

}
