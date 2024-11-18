package co.edu.uniquindio.poo ;

public class Vehiculo {

    /**
     * Se declaran las variables
     */
    public String marca;
    public String placa;
    public int modelo;
    public int cambios;
    public double velocidadMaxima;
    public double cilindraje;
    public TipoRegistro tipoRegistro;
    public Transmision transmision;
    public Estado estado;
    public Combustible combustible;

    /**
     * Variables extras del vehículo eléctrico
     */
    public double autonomia;
    public double tiempoCarga;

    /**
     * Variables extras del vehículo híbrido
     */
    public boolean enchufable;
    public boolean hibridoLigero;

    /**
     * Constructor
     */
    public Vehiculo(String marca, String placa, int modelo, int cambios, double velocidadMaxima, double cilindraje,
            TipoRegistro tipoRegistro, Transmision transmision, Estado estado, Combustible combustible,
            double autonomia, double tiempoCarga, boolean enchufable, boolean hibridoLigero) {
        this.marca = marca;
        this.modelo = modelo;
        this.cambios = cambios;
        this.velocidadMaxima = velocidadMaxima;
        this.cilindraje = cilindraje;
        this.tipoRegistro = tipoRegistro;
        this.transmision = transmision;
        this.estado = estado;
        this.combustible = combustible;
        this.autonomia = autonomia;
        this.tiempoCarga = tiempoCarga;
        this.enchufable = enchufable;
        this.hibridoLigero = hibridoLigero;
        this.placa = placa;
    }

    /**
     * Getters y setters
     */
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getCambios() {
        return cambios;
    }

    public void setCambios(int cambios) {
        this.cambios = cambios;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public double getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(double cilindraje) {
        this.cilindraje = cilindraje;
    }

    public TipoRegistro getTipoRegistro() {
        return tipoRegistro;
    }

    public void setTipoRegistro(TipoRegistro tipoRegistro) {
        this.tipoRegistro = tipoRegistro;
    }

    public Transmision getTransmision() {
        return transmision;
    }

    public void setTransmision(Transmision transmision) {
        this.transmision = transmision;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public Combustible getCombustible() {
        return combustible;
    }

    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }

    public double getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(double autonomia) {
        this.autonomia = autonomia;
    }

    public double getTiempoCarga() {
        return tiempoCarga;
    }

    public void setTiempoCarga(double tiempoCarga) {
        this.tiempoCarga = tiempoCarga;
    }

    public boolean isEnchufable() {
        return enchufable;
    }

    public void setEnchufable(boolean enchufable) {
        this.enchufable = enchufable;
    }

    public boolean isHibridoLigero() {
        return hibridoLigero;
    }

    public void setHibridoLigero(boolean hibridoLigero) {
        this.hibridoLigero = hibridoLigero;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public boolean esElectrico() {
        return combustible.equals(Combustible.ELECTRICO);
    }

    public boolean esHibrido() {
        return combustible.equals(Combustible.HIBRIDO);
    }

    public String obtenerAutonomiaCadena() {
        String cadena;
        if (!esElectrico()) {
            cadena = "No aplica";
        } else {
            cadena = String.valueOf(autonomia);
        }
        return cadena;
    }

    public String obtenerTiempoCarga() {
        String cadena;
        if (!esElectrico()) {
            cadena = "No aplica";
        } else {
            cadena = String.valueOf(tiempoCarga);
        }
        return cadena;
    }

    public String obtenerEnchufableCadena() {
        String cadena;
        if (!esHibrido()) {
            cadena = "No aplica";
        } else if (enchufable) {
            cadena = "Sí";
        } else {
            cadena = "No";
        }
        return cadena;
    }

    public String obtenerHibridoLigeroCadena() {
        String cadena;
        if (!esHibrido() || enchufable) {
            cadena = "No aplica";
        } else if (hibridoLigero) {
            cadena = "Sí";
        } else {
            cadena = "No";
        }
        return cadena;
    }

}
