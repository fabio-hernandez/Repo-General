package MemoriaDinamica;

//@author: Fabio Hernández
import javax.swing.JTextArea;

public class ListaSimple {

    NodoLS cabeza;
    int tamaño;

    public ListaSimple() {
        cabeza = null;
        tamaño = 0;
    }

    public boolean esVacia() {
        return this.cabeza == null;
    }

    /**
     * @return the tamaño
     */
    public int getTamaño() {
        return tamaño;
    }

    public int obtenerFila(int posicion) {
        //Creo una copia de la lista
        NodoLS aux = cabeza;
        //Instancio una variable contador
        int contador = 0;
        while (contador < posicion) {
            //Pasa al siguiente nodo
            aux = aux.getSiguiente();
            //Incremento
            contador++;
        }
        //Retorna el valor de la fila del nodo encontrado
        return aux.getFila();
    }

    public int obtenerCol(int posicion) {
        NodoLS aux = cabeza;
        int contador = 0;
        while (contador < posicion) {
            aux = aux.getSiguiente();
            contador++;
        }
        return aux.getColumna();
    }
    
    public int obtenerValor(int posicion) {
        NodoLS aux = cabeza;
        int contador = 0;
        while (contador < posicion) {
            aux = aux.getSiguiente();
            contador++;
        }
        return aux.getValor();
    }
    
    public String obtenerColor(int posicion) {
        NodoLS aux = cabeza;
        int contador = 0;
        while (contador < posicion) {
            aux = aux.getSiguiente();
            contador++;
        }
        return aux.getColor();
    }
    
    public void agregar(int fila, int columna, int valor, String color) {

        NodoLS nuevo = new NodoLS(fila, columna, valor, color);
        if (esVacia()) {
            cabeza = nuevo;
        } else {
            NodoLS aux = cabeza;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
        tamaño++;
    }

    public void eliminar() {
        cabeza = null;
        tamaño = 0;
    }

    public void imprimir(JTextArea texto) {

        String cadena = "";
        if (!esVacia()) {
            NodoLS aux = cabeza;
            // Posicion de los elementos de la lista.
            int i = 0;
            while (aux != null) {
                cadena += (String.valueOf(i) + "[label=" + "\"" + aux.getValor() + ", " + aux.getColor() + "\"" + "]\n");
                if (i < tamaño - 1) {
                    cadena += (String.valueOf(i) + "->" + String.valueOf(i + 1) + ";\n");
                }
                aux = aux.getSiguiente();
                i++;
            }
        }
        //Setea el texto Graphviz al JTextArea
        texto.setText("digraph G{\n" + cadena + "\n}");
        System.out.println("digraph G{\n" + cadena + "\n}");

    }
}
