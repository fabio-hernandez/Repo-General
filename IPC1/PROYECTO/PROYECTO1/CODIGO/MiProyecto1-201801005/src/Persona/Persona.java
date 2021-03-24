package Persona;

public class Persona {

    private String nombre;
    private String apellido;
    private String telefono;
    private String DPI;
    private String TipodeVehículo;
    private String UsoVehiculo;
    private String Marca;
    private String Linea;
    private String Modelo;
    private String ValorVehiculo;
    private String costoPrima;
    private String deducible;
    private boolean estado;

    public Persona(String nombre, String apellido, String telefono, String DPI, String TipodeVehículo, String UsoVehiculo, String Marca, String Linea, String Modelo, String ValorVehiculo, String costoPrima, String deducible) {
        this.estado = false;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.DPI = DPI;
        this.TipodeVehículo = TipodeVehículo;
        this.UsoVehiculo = UsoVehiculo;
        this.Marca = Marca;
        this.Linea = Linea;
        this.Modelo = Modelo;
        this.ValorVehiculo = ValorVehiculo;
        this.costoPrima = costoPrima;
        this.deducible = deducible;
    }

    public void Asegurar() {
        setEstado(true);
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
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the DPI
     */
    public String getDPI() {
        return DPI;
    }

    /**
     * @param DPI the DPI to set
     */
    public void setDPI(String DPI) {
        this.DPI = DPI;
    }

    /**
     * @return the TipodeVehículo
     */
    public String getTipodeVehículo() {
        return TipodeVehículo;
    }

    /**
     * @param TipodeVehículo the TipodeVehículo to set
     */
    public void setTipodeVehículo(String TipodeVehículo) {
        this.TipodeVehículo = TipodeVehículo;
    }

    /**
     * @return the UsoVehiculo
     */
    public String getUsoVehiculo() {
        return UsoVehiculo;
    }

    /**
     * @param UsoVehiculo the UsoVehiculo to set
     */
    public void setUsoVehiculo(String UsoVehiculo) {
        this.UsoVehiculo = UsoVehiculo;
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
     * @return the Linea
     */
    public String getLinea() {
        return Linea;
    }

    /**
     * @param Linea the Linea to set
     */
    public void setLinea(String Linea) {
        this.Linea = Linea;
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

    /**
     * @return the ValorVehiculo
     */
    public String getValorVehiculo() {
        return ValorVehiculo;
    }

    /**
     * @param ValorVehiculo the ValorVehiculo to set
     */
    public void setValorVehiculo(String ValorVehiculo) {
        this.ValorVehiculo = ValorVehiculo;
    }

    /**
     * @return the costoPrima
     */
    public String getCostoPrima() {
        return costoPrima;
    }

    /**
     * @param costoPrima the costoPrima to set
     */
    public void setCostoPrima(String costoPrima) {
        this.costoPrima = costoPrima;
    }

    /**
     * @return the deducible
     */
    public String getDeducible() {
        return deducible;
    }

    /**
     * @param deducible the deducible to set
     */
    public void setDeducible(String deducible) {
        this.deducible = deducible;
    }

    /**
     * @return the estado
     */
    public boolean isEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
