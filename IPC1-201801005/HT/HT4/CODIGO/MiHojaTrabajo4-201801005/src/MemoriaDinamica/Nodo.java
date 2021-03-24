package MemoriaDinamica;

//@author HernandezMartinez
public class Nodo {

    private int ID;
    private String nombre;
    private Nodo siguiente;

    public Nodo() {
        this.ID = 0;
        this.nombre = "";
        this.siguiente = null;
    }

    public Nodo(int ID, String nombre) {
        this.ID = ID;
        this.nombre = nombre;
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

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the siguiente
     */
    public Nodo getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    
}