package Reporte;

public class ReporteGeneral {
    
    private String nombre;
    private int edad;
    private String nickname;
    private String sexo;

    public ReporteGeneral(String nombre, int edad, String nickname, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.nickname = nickname;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
      
}
