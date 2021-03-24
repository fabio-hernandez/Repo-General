package MemoriaDinamica;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author HernandezMartinez
 */
public class ListaCircular {

    // Puntero que indica el inicio de la lista o conocida tambien como cabeza de la lista.
    private NodoLC cabeza;
    public NodoLC actual;
    private int tamaño;

    public ListaCircular() {
        this.cabeza = null;
    }

    public boolean esVacia() {
        return getCabeza() == null;
    }

    public void agregar(int ID, int Valor) {
        NodoLC nuevo = new NodoLC(ID, Valor);
        if (this.getCabeza() != null) {
            nuevo.setSiguiente(this.getCabeza().getSiguiente());
            this.getCabeza().setSiguiente(nuevo);
            nuevo.setAnterior(this.getCabeza());
        }
        this.setCabeza(nuevo);
        this.getCabeza().getSiguiente().setAnterior(nuevo);
        tamaño++;
    }

    public void eliminar(int valor) {
        NodoLC aux = this.getCabeza();
        if (aux != null) {
            while (aux.getSiguiente() != getCabeza()) {
                if (aux.getValor() == valor) {
                    this.getCabeza().getSiguiente().setAnterior(aux.getAnterior());
                    this.getCabeza().getAnterior().setSiguiente(aux.getSiguiente());
                    this.setCabeza(getCabeza().getSiguiente());
                }
                aux = aux.getSiguiente();
            }
            tamaño--;
        }
    }
    
    public void mostrar(JTextArea area) {
        NodoLC aux = getCabeza();
        String cadena = "";
        // Posicion de los elementos de la lista.
        if (esVacia()) {
            JOptionPane.showMessageDialog(null, "La lista se encuentra vacía");
        } else {
            int i=0;
            while (i<this.getTamaño()){
                
                cadena += aux.getID() + "[label = \"" + aux.getValor() + ", ROJO\"]\n";
                cadena += aux.getID() + "->" + aux.getSiguiente().getID() + "\n";
                cadena += aux.getSiguiente().getID() + "->" + aux.getID() + "\n";
                aux = aux.getSiguiente();
                i++;
            }
        }
        //Setea el texto Graphviz al JTextArea
        area.setText("digraph G{\n" + cadena + "\n}");
        System.out.println("digraph G{\n" + cadena + "\n}");
    }

    /**
     * @return the cabeza
     */
    public NodoLC getCabeza() {
        return cabeza;
    }

    /**
     * @param cabeza the cabeza to set
     */
    public void setCabeza(NodoLC cabeza) {
        this.cabeza = cabeza;
    }

    /**
     * @return the tamaño
     */
    public int getTamaño() {
        return tamaño;
    }

    /**
     * @param tamaño the tamaño to set
     */
    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
    
    
}
