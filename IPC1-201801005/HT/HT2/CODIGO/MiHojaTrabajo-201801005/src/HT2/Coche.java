/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HT2;

/**
 *
 * @author HernandezMartinez
 */
public class Coche implements Transporte {

private String Marca;
    private int Modelo;
    private String TipodeVehiculo;

    public Coche(String Marca, int Modelo, String TipodeVehiculo) {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.TipodeVehiculo = TipodeVehiculo;
    }

    @Override
    public void Avanzar() {
        //“AVANCE-AUTO-MARCA-MODELO-TIPO”
        System.out.println("Avance - Auto - " + this.getMarca()+ " - "
                + this.getModelo()+ " - " + this.getTipodeVehiculo());
    }

    @Override
    public void Frenar() {
        //“FRENE-AUTO-MARCA-MODELO-TIPO”
        System.out.println("Avance - Auto - " + this.getMarca()+ " - "
                + this.getModelo()+ " - " + this.getTipodeVehiculo());
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
    public int getModelo() {
        return Modelo;
    }

    /**
     * @param Modelo the Modelo to set
     */
    public void setModelo(int Modelo) {
        this.Modelo = Modelo;
    }

    /**
     * @return the TipodeVehiculo
     */
    public String getTipodeVehiculo() {
        return TipodeVehiculo;
    }

    /**
     * @param TipodeVehiculo the TipodeVehiculo to set
     */
    public void setTipodeVehiculo(String TipodeVehiculo) {
        this.TipodeVehiculo = TipodeVehiculo;
    }

}

