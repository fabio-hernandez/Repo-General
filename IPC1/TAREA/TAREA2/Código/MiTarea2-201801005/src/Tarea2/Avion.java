package Tarea2;

/**
 *
 * @author HernandezMartinez
 */
public class Avion extends Transporte {

    private int cantidadPasajeros;
    private String Marca;
    private String Modelo;

    public Avion(int cantidadPasajeros, String Marca, String Modelo) {
        this.cantidadPasajeros = cantidadPasajeros;
        this.Marca = Marca;
        this.Modelo = Modelo;
    }

    @Override
    public void Avanzar() {
        // “AVANCE-AVION-PASAJEROS-MARCA-MODELO”
        System.out.println("Avance - Avion - " + this.getCantidadPasajeros() + " - "
                + this.getMarca() + " - " + this.getModelo());
    }

    @Override
    public void Frenar() {
        //“FRENE-AVION-PASAJEROS-MARCA-MODELO”
        System.out.println("Frene - Avion - " + this.getCantidadPasajeros() + " - "
                + this.getMarca() + " - " + this.getModelo());
    }

    /**
     * @return the cantidadPasajeros
     */
    public int getCantidadPasajeros() {
        return cantidadPasajeros;
    }

    /**
     * @param cantidadPasajeros the cantidadPasajeros to set
     */
    public void setCantidadPasajeros(int cantidadPasajeros) {
        this.cantidadPasajeros = cantidadPasajeros;
    }

    /**
     * @return the Marca
     */
    public String getMarca() {
        return Marca;
    }

    /**
     * @param Marca the Marca to set
     */
    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    /**
     * @return the Modelo
     */
    public String getModelo() {
        return Modelo;
    }

    /**
     * @param Modelo the Modelo to set
     */
    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

}
