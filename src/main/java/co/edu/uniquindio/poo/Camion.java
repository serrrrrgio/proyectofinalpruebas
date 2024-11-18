package co.edu.uniquindio.poo ;

public class Camion extends Carro {

    /**
     * Se declaran las variables
     */
    private double capacidadCarga;
    private boolean frenosAire;
    private int numeroEjes;
    private TipoCamion tipoCamion;

    /**
     * Constructor
     */

    public Camion(String marca, String placa, int modelo, int cambios, double velocidadMaxima, double cilindraje,
            TipoRegistro tipoRegistro, Transmision transmision, Estado estado,
            int capacidadPasajeros, int cantidadPuertas, boolean abs, boolean aireAcondicionado,
            double capacidadCarga, boolean frenosAire, int numeroEjes, TipoCamion tipoCamion, Combustible combustible,
            double autonomia, double tiempoCarga, boolean enchufable, boolean hibridoLigero) {
        super(marca, placa, modelo, cambios, velocidadMaxima, cilindraje, tipoRegistro, transmision, estado,
                capacidadPasajeros, cantidadPuertas, abs, aireAcondicionado, frenosAire, combustible, autonomia,
                tiempoCarga, enchufable, hibridoLigero);
        this.capacidadCarga = capacidadCarga;
        this.frenosAire = frenosAire;
        this.numeroEjes = numeroEjes;
        this.tipoCamion = tipoCamion;
    }

    /**
     * Getters y Setters
     */

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public boolean isFrenosAire() {
        return frenosAire;
    }

    public void setFrenosAire(boolean frenosAire) {
        this.frenosAire = frenosAire;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    public TipoCamion getTipoCamion() {
        return tipoCamion;
    }

    public void setTipoCamion(TipoCamion tipoCamion) {
        this.tipoCamion = tipoCamion;
    }

    public String obtenerFrenosAireCadena() {
        String cadena;
        if (frenosAire) {
            cadena = "Sí";
        } else {
            cadena = "No";
        }
        return cadena;
    }

}
