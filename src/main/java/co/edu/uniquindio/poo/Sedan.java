package co.edu.uniquindio.poo;

public class Sedan extends Carro {
    private double capacidadMaletero;
    private boolean velocidadCrucero;
    private int numeroBolsasAire;
    private boolean sensoresColision;
    private boolean sensorTraficoCruzado;
    private boolean asistentePermanenciaCarril;

    /**
     * Constructor
     */

    public Sedan(String marca, String placa, int modelo, int cambios, double velocidadMaxima, double cilindraje,
            TipoRegistro tipoRegistro, Transmision transmision, Estado estado,
            int capacidadPasajeros, int cantidadPuertas, boolean abs, boolean aireAcondicionado, boolean camaraReversa,
            double capacidadMaletero, boolean velocidadCrucero, int numeroBolsasAire,
            boolean sensoresColision, boolean sensorTraficoCruzado, boolean asistentePermanenciaCarril,
            Combustible combustible, double autonomia, double tiempoCarga, boolean enchufable, boolean hibridoLigero) {
        super(marca, placa, modelo, cambios, velocidadMaxima, cilindraje, tipoRegistro, transmision, estado,
                capacidadPasajeros, cantidadPuertas, abs, aireAcondicionado, camaraReversa, combustible, autonomia,
                tiempoCarga, enchufable, hibridoLigero);
        this.capacidadMaletero = capacidadMaletero;
        this.velocidadCrucero = velocidadCrucero;
        this.numeroBolsasAire = numeroBolsasAire;
        this.sensoresColision = sensoresColision;
        this.sensorTraficoCruzado = sensorTraficoCruzado;
        this.asistentePermanenciaCarril = asistentePermanenciaCarril;
    }

    /**
     * Getters y Setters
     */

    public double getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(double capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    public boolean getVelocidadCrucero() {
        return velocidadCrucero;
    }

    public void setVelocidadCrucero(boolean velocidadCrucero) {
        this.velocidadCrucero = velocidadCrucero;
    }

    public int getNumeroBolsasAire() {
        return numeroBolsasAire;
    }

    public void setNumeroBolsasAire(int numeroBolsasAire) {
        this.numeroBolsasAire = numeroBolsasAire;
    }

    public boolean isSensoresColision() {
        return sensoresColision;
    }

    public void setSensoresColision(boolean sensoresColision) {
        this.sensoresColision = sensoresColision;
    }

    public boolean isSensorTraficoCruzado() {
        return sensorTraficoCruzado;
    }

    public void setSensorTraficoCruzado(boolean sensorTraficoCruzado) {
        this.sensorTraficoCruzado = sensorTraficoCruzado;
    }

    public boolean isAsistentePermanenciaCarril() {
        return asistentePermanenciaCarril;
    }

    public void setAsistentePermanenciaCarril(boolean asistentePermanenciaCarril) {
        this.asistentePermanenciaCarril = asistentePermanenciaCarril;
    }

    public String obtenerVelocidadCruceroCadena() {
        String cadena;
        if (velocidadCrucero) {
            cadena = "Sí";
        } else {
            cadena = "No";
        }
        return cadena;
    }

    public String obtenerSensoresColisionCadena() {
        String cadena;
        if (sensoresColision) {
            cadena = "Sí";
        } else {
            cadena = "No";
        }
        return cadena;
    }

    public String obtenerSensorTraficoCruzadoCadena() {
        String cadena;
        if (sensorTraficoCruzado) {
            cadena = "Sí";
        } else {
            cadena = "No";
        }
        return cadena;
    }

    public String obtenerAsistentepermanenciaCarril() {
        String cadena;
        if (asistentePermanenciaCarril) {
            cadena = "Sí";
        } else {
            cadena = "No";
        }
        return cadena;
    }

}
