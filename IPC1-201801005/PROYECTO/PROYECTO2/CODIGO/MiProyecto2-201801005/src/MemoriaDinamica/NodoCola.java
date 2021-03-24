package MemoriaDinamica;

//@author: Fabio Hernández
public class NodoCola {
    
    private int valor;
    private int ID;
    private NodoCola siguiente;

    public NodoCola(int ID,int valor) {
        this.ID = ID;
        this.valor = valor;
        siguiente = null;
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
     * @return the siguiente
     */
    public NodoCola getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoCola siguiente) {
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
