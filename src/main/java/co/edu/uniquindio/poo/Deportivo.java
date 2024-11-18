package co.edu.uniquindio.poo ;

public class Deportivo extends Carro {

    /**
     * Se declaran las variables
     */

    private int numeroCaballosFuerza;
    private int numeroBolsasAire;
    private double tiempoAlcanzar100kmh;

    /**
     * Constructor
     */

    public Deportivo(String marca, String placa, int modelo, int cambios, double velocidadMaxima, double cilindraje,
            TipoRegistro tipoRegistro, Transmision transmision, Estado estado,
            int capacidadPasajeros, int cantidadPuertas, boolean abs, int numeroCaballosFuerza, int numeroBolsasAire,
            double tiempoAlcanzar100kmh, Combustible combustible, double autonomia, double tiempoCarga,
            boolean enchufable, boolean hibridoLigero) {
        super(marca, placa, modelo, cambios, velocidadMaxima, cilindraje, tipoRegistro, transmision, estado,
                capacidadPasajeros, cantidadPuertas, abs, false, false, combustible, autonomia, tiempoCarga, enchufable,
                hibridoLigero);
        this.numeroBolsasAire = numeroBolsasAire;
        this.tiempoAlcanzar100kmh = tiempoAlcanzar100kmh;
    }

    /**
     * Getters y Setters
     */

    public int getNumeroCaballosFuerza() {
        return numeroCaballosFuerza;
    }

    public void setNumeroCaballosFuerza(int numeroCaballosFuerza) {
        this.numeroCaballosFuerza = numeroCaballosFuerza;
    }

    public int getNumeroBolsasAire() {
        return numeroBolsasAire;
    }

    public void setNumeroBolsasAire(int numeroBolsasAire) {
        this.numeroBolsasAire = numeroBolsasAire;
    }

    public double getTiempoAlcanzar100kmh() {
        return tiempoAlcanzar100kmh;
    }

    public void setTiempoAlcanzar100kmh(double tiempoAlcanzar100kmh) {
        this.tiempoAlcanzar100kmh = tiempoAlcanzar100kmh;
    }
}
