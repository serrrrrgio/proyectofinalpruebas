package co.edu.uniquindio.poo ;

public class Van extends Carro {
    private double capacidadMaletero;
    private int bolsasAire;

    /**
     * Constructor
     */

    public Van(String marca, String placa, int modelo, int cambios, double velocidadMaxima, double cilindraje,
            TipoRegistro tipoRegistro, Transmision transmision, Estado estado,
            int capacidadPasajeros, int cantidadPuertas, boolean abs, boolean aireAcondicionado, boolean camaraReversa,
            double capacidadMaletero, int bolsasAire, Combustible combustible, double autonomia, double tiempoCarga,
            boolean enchufable, boolean hibridoLigero) {
        super(marca, placa, modelo, cambios, velocidadMaxima, cilindraje, tipoRegistro, transmision, estado,
                capacidadPasajeros, cantidadPuertas, abs, aireAcondicionado, camaraReversa, combustible, autonomia,
                tiempoCarga, enchufable, hibridoLigero);
        this.capacidadMaletero = capacidadMaletero;
        this.bolsasAire = bolsasAire;
    }

    /**
     * Constructor getters y Setters
     */

    public double getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(double capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    public int getBolsasAire() {
        return bolsasAire;
    }

    public void setBolsasAire(int bolsasAire) {
        this.bolsasAire = bolsasAire;
    }
}
