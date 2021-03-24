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
public class Controller {
    
    
    private Avion AvionComercial;
    private Avion AvionPrivado;
    
    private Caballo caballodeCarga;
    private Caballo caballoMascota;
    
    private Coche carrodelujo;
    private Coche carroregular;

    public Controller() {
        
        this.AvionComercial = new Avion(500,"Airbus", "A320");
        this.AvionPrivado = new Avion(8,"Boeing","747");
        
        this.caballoMascota = new Caballo("Chimuelo","Frizone",5);
        this.caballodeCarga = new Caballo("Andaluz","Pura Sangre",6);
        
        this.carrodelujo = new Coche("Ferrari",2020,"Convertible");
        this.carroregular = new Coche("Toyota",2000,"Sedan");
    
}

    /**
     * @return the AvionComercial
     */
    public Avion getAvionComercial() {
        return AvionComercial;
    }

    /**
     * @param AvionComercial the AvionComercial to set
     */
    public void setAvionComercial(Avion AvionComercial) {
        this.AvionComercial = AvionComercial;
    }

    /**
     * @return the AvionPrivado
     */
    public Avion getAvionPrivado() {
        return AvionPrivado;
    }

    /**
     * @param AvionPrivado the AvionPrivado to set
     */
    public void setAvionPrivado(Avion AvionPrivado) {
        this.AvionPrivado = AvionPrivado;
    }

    /**
     * @return the caballodeCarga
     */
    public Caballo getCaballodeCarga() {
        return caballodeCarga;
    }

    /**
     * @param caballodeCarga the caballodeCarga to set
     */
    public void setCaballodeCarga(Caballo caballodeCarga) {
        this.caballodeCarga = caballodeCarga;
    }

    /**
     * @return the caballoMascota
     */
    public Caballo getCaballoMascota() {
        return caballoMascota;
    }

    /**
     * @param caballoMascota the caballoMascota to set
     */
    public void setCaballoMascota(Caballo caballoMascota) {
        this.caballoMascota = caballoMascota;
    }

    /**
     * @return the carrodelujo
     */
    public Coche getCarrodelujo() {
        return carrodelujo;
    }

    /**
     * @param carrodelujo the carrodelujo to set
     */
    public void setCarrodelujo(Coche carrodelujo) {
        this.carrodelujo = carrodelujo;
    }

    /**
     * @return the carroregular
     */
    public Coche getCarroregular() {
        return carroregular;
    }

    /**
     * @param carroregular the carroregular to set
     */
    public void setCarroregular(Coche carroregular) {
        this.carroregular = carroregular;
    }
}