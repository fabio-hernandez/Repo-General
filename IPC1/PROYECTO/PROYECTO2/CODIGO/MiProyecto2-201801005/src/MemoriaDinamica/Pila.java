package MemoriaDinamica;

//@author: Fabio Hernández
import javax.swing.JTextArea;

public class Pila {

    int valor, ID, tamaño;
    NodoPila siguiente, TOP;

    public Pila() {
        this.valor = valor;
        this.ID = ID;
        this.siguiente = null;
        this.tamaño = 0;
    }

    public boolean esVacia() {
        if (TOP == null) {
            return true;
        }
        return false;
    }

    public void push(int ID, int valor) {
        NodoPila nuevo = new NodoPila(ID, valor);
        this.TOP = nuevo.getSiguiente();
        this.TOP = nuevo;
        tamaño++;
    }

    public Object pop() {
        int aux = TOP.getValor();
        TOP = TOP.getSiguiente();
        tamaño--;
        return aux;
    }
    

    public void imprimir(JTextArea texto) {
        NodoPila aux = TOP;
        String cadena = "";
        int i=0;
        while (aux!= null) {
            cadena += (String.valueOf(i) + "[label=" + "\"" + aux.getValor() + ", AMARILLO\""+"\n");
            cadena += String.valueOf(i) + "->" + String.valueOf(i+1);
            i++;
            aux = aux.getSiguiente();
        }
        //Setea el texto Graphviz al JTextArea
        texto.setText("digraph G{\n" + cadena + "\n}");
        System.out.println("digraph G{\n" + cadena + "\n}");
    }

}
