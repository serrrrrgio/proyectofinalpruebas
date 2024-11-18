package co.edu.uniquindio.poo ;

import java.time.LocalDate;

public class Transaccion {
    private LocalDate fechaEntrega;
    private LocalDate fechaEntregaDevolucion;
    private double precio;
    private TipoTransaccion tipoTransaccion;
    private Empleado empleado;
    private Cliente cliente;
    private Vehiculo vehiculo;

    public Transaccion(LocalDate fechaEntrega, LocalDate fechaEntregaDevolucion, double precio,
            TipoTransaccion tipoTransaccion, Empleado empleado,
            Cliente cliente, Vehiculo vehiculo) {
        this.fechaEntrega = fechaEntrega;
        this.precio = precio;
        this.tipoTransaccion = tipoTransaccion;
        this.empleado = empleado;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.fechaEntregaDevolucion = fechaEntregaDevolucion;
    }

    public LocalDate getfechaEntrega() {
        return fechaEntrega;
    }

    public void setfechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public TipoTransaccion getTipoTransaccion() {
        return tipoTransaccion;
    }

    public void setTipoTransaccion(TipoTransaccion tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public LocalDate getfechaEntregaDevolucion() {
        return fechaEntregaDevolucion;
    }

    public void setfechaEntregaDevolucion(LocalDate fechaEntregaDevolucion) {
        this.fechaEntregaDevolucion = fechaEntregaDevolucion;
    }

    public String obtenerPrecioCadena(){
        return String.valueOf(precio);
    }

}
