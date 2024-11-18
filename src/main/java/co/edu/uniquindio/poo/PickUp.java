package co.edu.uniquindio.poo;

public class PickUp extends Carro {

    /**
     * Se declaran las variables
     */
    private int numeroBolsasAire;
    private boolean cuatroPorCuatro;
    private double capacidadCajaCarga;

    /**
     * Constructor
     */

    public PickUp(String marca, String placa, int modelo, int cambios, double velocidadMaxima, double cilindraje,
            TipoRegistro tipoRegistro, Transmision transmision, Estado estado,
            int capacidadPasajeros, int cantidadPuertas, boolean abs, boolean aireAcondicionado, boolean camaraReversa,
            int numeroBolsasAire, boolean cuatroPorCuatro, double capacidadCajaCarga, Combustible combustible,
            double autonomia, double tiempoCarga, boolean enchufable, boolean hibridoLigero) {
        super(marca, placa, modelo, cambios, velocidadMaxima, cilindraje, tipoRegistro, transmision, estado,
                capacidadPasajeros, cantidadPuertas, abs, aireAcondicionado, camaraReversa, combustible, autonomia,
                tiempoCarga, enchufable, hibridoLigero);
        this.numeroBolsasAire = numeroBolsasAire;
        this.cuatroPorCuatro = cuatroPorCuatro;
        this.capacidadCajaCarga = capacidadCajaCarga;
    }

    /**
     * Getters y Setters
     */

    public int getNumeroBolsasAire() {
        return numeroBolsasAire;
    }

    public void setNumeroBolsasAire(int numeroBolsasAire) {
        this.numeroBolsasAire = numeroBolsasAire;
    }

    public boolean isCuatroPorCuatro() {
        return cuatroPorCuatro;
    }

    public void setCuatroPorCuatro(boolean cuatroPorCuatro) {
        this.cuatroPorCuatro = cuatroPorCuatro;
    }

    public double getCapacidadCajaCarga() {
        return capacidadCajaCarga;
    }

    public void setCapacidadCajaCarga(double capacidadCajaCarga) {
        this.capacidadCajaCarga = capacidadCajaCarga;
    }

    public String obtenerCuatroPorCuatroCadena() {
        String cadena;
        if (cuatroPorCuatro) {
            cadena = "Sí";
        } else {
            cadena = "No";
        }
        return cadena;
    }

}
