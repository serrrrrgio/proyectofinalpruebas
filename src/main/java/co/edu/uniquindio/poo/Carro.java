package co.edu.uniquindio.poo ;

public class Carro extends Vehiculo {
    public int capacidadPasajeros;
    public int cantidadPuertas;
    public boolean abs;
    public boolean aireAcondicionado;
    private boolean camaraReversa;

    /**
     * Constructor
     */
    public Carro(String marca, String placa, int modelo, int cambios, double velocidadMaxima, double cilindraje,
            TipoRegistro tipoRegistro, Transmision transmision, Estado estado,
            int capacidadPasajeros, int cantidadPuertas, boolean abs, boolean aireAcondicionado,
            boolean camaraReversa, Combustible combustible, double autonomia, double tiempoCarga, boolean enchufable,
            boolean hibridoLigero) {
        super(marca, placa, modelo, cambios, velocidadMaxima, cilindraje, tipoRegistro, transmision, estado,
                combustible, autonomia, tiempoCarga, enchufable, hibridoLigero);
        this.capacidadPasajeros = capacidadPasajeros;
        this.cantidadPuertas = cantidadPuertas;
        this.abs = abs;
        this.aireAcondicionado = aireAcondicionado;
        this.camaraReversa = camaraReversa;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    public boolean isAbs() {
        return abs;
    }

    public void setAbs(boolean abs) {
        this.abs = abs;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public boolean isCamaraReversa() {
        return camaraReversa;
    }

    public void setCamaraReversa(boolean camaraReversa) {
        this.camaraReversa = camaraReversa;
    }

    public String obtenerAbsCadena() {
        String cadena;
       if (abs) {
            cadena = "Sí";
        } else {
            cadena = "No";
        }
        return cadena;
    }

    public String obtenerAireAcondicionadoCadena() {
        String cadena;
       if (aireAcondicionado) {
            cadena = "Sí";
        } else {
            cadena = "No";
        }
        return cadena;
    }

    public String obtenerCamaraReversaCadena() {
        String cadena;
       if (camaraReversa) {
            cadena = "Sí";
        } else {
            cadena = "No";
        }
        return cadena;
    }
}
