package co.edu.uniquindio.poo ;

public class Camioneta extends Carro {
    /**
     * Se declaran las variables
     */
    private double capacidadMaletero;

    private boolean velocidadCrucero;
    private int numeroBolsasAire;
    private boolean sensoresColision;
    private boolean sensorTraficoCruzado;
    private boolean asistentepermanenciaCarril;
    private boolean cuatroPorCuatro;

    /**
     * Constructor
     */
    public Camioneta(String marca, String placa, int modelo, int cambios, double velocidadMaxima, double cilindraje,
            TipoRegistro tipoRegistro, Transmision transmision, Estado estado,
            int capacidadPasajeros, int cantidadPuertas, boolean abs, boolean aireAcondicionado, boolean camaraReversa,
            double capacidadMaletero, boolean velocidadCrucero, int numeroBolsasAire,
            boolean sensoresColision, boolean sensorTraficoCruzado, boolean asistentepermanenciaCarril,
            boolean cuatroPorCuatro, Combustible combustible, double autonomia,
            double tiempoCarga, boolean enchufable,
            boolean hibridoLigero) {
        super(marca, placa, modelo, cambios, velocidadMaxima, cilindraje, tipoRegistro, transmision, estado,
                capacidadPasajeros, cantidadPuertas, abs, aireAcondicionado, camaraReversa, combustible, autonomia,
                tiempoCarga, enchufable, hibridoLigero);
        this.capacidadMaletero = capacidadMaletero;
        this.velocidadCrucero = velocidadCrucero;
        this.numeroBolsasAire = numeroBolsasAire;
        this.sensoresColision = sensoresColision;
        this.sensorTraficoCruzado = sensorTraficoCruzado;
        this.asistentepermanenciaCarril = asistentepermanenciaCarril;
        this.cuatroPorCuatro = cuatroPorCuatro;
    }

    /**
     * Getters y setters
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

    public boolean isAsistentepermanenciaCarril() {
        return asistentepermanenciaCarril;
    }

    public void setAsistentepermanenciaCarril(boolean asistentepermanenciaCarril) {
        this.asistentepermanenciaCarril = asistentepermanenciaCarril;
    }

    public boolean isCuatroPorCuatro() {
        return cuatroPorCuatro;
    }

    public void setCuatroPorCuatro(boolean cuatroPorCuatro) {
        this.cuatroPorCuatro = cuatroPorCuatro;
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
        if (asistentepermanenciaCarril) {
            cadena = "Sí";
        } else {
            cadena = "No";
        }
        return cadena;
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
