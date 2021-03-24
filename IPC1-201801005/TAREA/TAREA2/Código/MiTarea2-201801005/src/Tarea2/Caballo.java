package Tarea2;

/**
 *
 * @author HernandezMartinez
 */
public class Caballo extends Transporte {

    private String Nombre;
    private String Raza;
    private int Edad;

    public Caballo(String Nombre, String Raza, int Edad) {
        this.Nombre = Nombre;
        this.Raza = Raza;
        this.Edad = Edad;
    }
    
    

    @Override
    public void Avanzar() {
        //“AVANCE-CABALLO-NOMBRE-RAZA-EDAD”
        System.out.println("Avance - Caballo - " + this.getNombre()+ " - "
                + this.getRaza()+ " - " + this.getEdad());
    }

    @Override
    public void Frenar() {
        //“FRENE-CABALLO-NOMBRE-RAZA-EDAD”
        System.out.println("Frene - Caballo - " + this.getNombre()+ " - "
                + this.getRaza()+ " - " + this.getEdad());
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Raza
     */
    public String getRaza() {
        return Raza;
    }

    /**
     * @param Raza the Raza to set
     */
    public void setRaza(String Raza) {
        this.Raza = Raza;
    }

    /**
     * @return the Edad
     */
    public int getEdad() {
        return Edad;
    }

    /**
     * @param Edad the Edad to set
     */
    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
    

}
