package co.edu.uniquindio.poo ;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.LinkedList;

 class Concesionario {

    /**
     * Se declaran las variables
     */
    private String nombre;
    private double fondos;
    private  LinkedList<Transaccion> transacciones;
    private  LinkedList<Empleado> empleados;
    private  LinkedList<Cliente> clientes;
    private  LinkedList<Vehiculo> vehiculos;
    private  LinkedList<Bus> buses;
    private  LinkedList<Camion> camiones;
    private  LinkedList<Camioneta> camionetas;
    private  LinkedList<Carro> carros;
    private  LinkedList<Deportivo> deportivos;
    private  LinkedList<Moto> motos;
    private  LinkedList<PickUp> pickUps;
    private  LinkedList<Sedan> sedanes;
    private  LinkedList<Van> vans;
    private Administrador administrador;

    /**
     * Constructor
     */
    public Concesionario(String nombre, double fondos, Administrador administrador) {
        this.nombre = nombre;
        this.fondos = fondos;
        this.administrador = administrador;
        this.transacciones =   new LinkedList<>();
        this.empleados =   new LinkedList<>();
        this.clientes =   new LinkedList<>();
        this.vehiculos =   new LinkedList<>();
        this.buses =   new LinkedList<>();
        this.camiones =   new LinkedList<>();
        this.carros =   new LinkedList<>();
        this.deportivos =   new LinkedList<>();
        this.motos =   new LinkedList<>();
        this.pickUps =   new LinkedList<>();
        this.sedanes =   new LinkedList<>();
        this.vans =   new LinkedList<>();
        assert !nombre.isBlank();
    }

    /**
     * Getters y setters
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getFondos() {
        return fondos;
    }

    public void setFondos(double fondos) {
        this.fondos = fondos;
    }

    public  LinkedList<Transaccion> getTransacciones() {
        return transacciones;
    }

    public void setTransacciones( LinkedList<Transaccion> transacciones) {
        this.transacciones = transacciones;
    }

    public  LinkedList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados( LinkedList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public  LinkedList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes( LinkedList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public  LinkedList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos( LinkedList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public  LinkedList<Bus> getBuses() {
        return buses;
    }

    public void setBuses( LinkedList<Bus> buses) {
        this.buses = buses;
    }

    public  LinkedList<Camion> getCamiones() {
        return camiones;
    }

    public void setCamiones( LinkedList<Camion> camiones) {
        this.camiones = camiones;
    }

    public  LinkedList<Camioneta> getCamionetas() {
        return camionetas;
    }

    public void setCamionetas( LinkedList<Camioneta> camionetas) {
        this.camionetas = camionetas;
    }

    public  LinkedList<Carro> getCarros() {
        return carros;
    }

    public void setCarros( LinkedList<Carro> carros) {
        this.carros = carros;
    }

    public  LinkedList<Deportivo> getDeportivos() {
        return deportivos;
    }

    public void setDeportivos( LinkedList<Deportivo> deportivos) {
        this.deportivos = deportivos;
    }

    public  LinkedList<Moto> getMotos() {
        return motos;
    }

    public void setMotos( LinkedList<Moto> motos) {
        this.motos = motos;
    }

    public  LinkedList<PickUp> getPickUps() {
        return pickUps;
    }

    public void setPickUps( LinkedList<PickUp> pickUps) {
        this.pickUps = pickUps;
    }

    public  LinkedList<Sedan> getSedanes() {
        return sedanes;
    }

    public void setSedanes( LinkedList<Sedan> sedanes) {
        this.sedanes = sedanes;
    }

    public  LinkedList<Van> getVans() {
        return vans;
    }

    public void setVans( LinkedList<Van> vans) {
        this.vans = vans;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    public String obtenerPrecioCadena(){
        return String.valueOf(fondos);
    }

    /**
     * Método para agregar transacción
     */
    public void agregarTransaccion(Transaccion transaccion) {
        transacciones.add(transaccion);
    }

    /**
     * Método para eliminar transacción
     */
    public void eliminarTransaccion(Transaccion transaccion) {
        transacciones.remove(transaccion);
    }

    /**
     * Método para agregar empleado
     */
    public boolean agregarEmpleado(Empleado empleado) {
        boolean agregado = false;
        if (!empleadoExistente(empleado.getUsuario())) {
            empleados.add(empleado);
            agregado = true;
        }
        return agregado;
    }

    /**
     * Método para crear un nuevo cliente.
     */
    public Empleado crearEmpleado(String nombre, String apellido, String correo, String cedula, String telefono,
            String usuario,
            String contrasena,
            PreguntaSeguridad preguntaSeguridad, String respuesta, double salario) {
        return new Empleado(nombre, apellido, correo, cedula, telefono, usuario, contrasena, preguntaSeguridad,
                respuesta, salario);
    }

    /**
     * Método para verificar la existencia de un empleado con su usuario.
     */
    public boolean empleadoExistente(String usuario) {
        boolean existente = false;
        for (Empleado empleado : empleados) {
            if (empleado.getUsuario().equals(usuario)) {
                existente = true;
                break;
            }
        }
        return existente;
    }

    /**
     * Método para eliminar un empleado.
     */
    public void eliminarEmpleado(Empleado empleado) {
        empleados.remove(empleado);
    }

    /**
     * Método para actualizar un empleado. Duda de si al actualizarlo también se le
     * pueda actualizar el usuario y contrasena(El que lo acualiza es el
     * administrador)
     */
    public boolean actualizarEmpleado(Empleado seleccionado, String nombre, String apellido, String correo,
            String cedula, String telefono, String usuario, String contrasena,
            PreguntaSeguridad preguntaSeguridad, String respuesta) {
        boolean actualizado = true;
        for (Empleado empleado : empleados) {
            if (empleado != seleccionado && empleado.getUsuario().equals(usuario)) {
                actualizado = false;
                return actualizado;
            }
        }
        seleccionado.setUsuario(usuario);
        seleccionado.setNombre(nombre);
        seleccionado.setApellido(apellido);
        seleccionado.setCorreo(correo);
        seleccionado.setCedula(cedula);
        seleccionado.setTelefono(telefono);
        seleccionado.setUsuario(usuario);
        seleccionado.setContrasena(contrasena);
        seleccionado.setPreguntaSeguridad(preguntaSeguridad);
        seleccionado.setRespuesta(respuesta);

        return actualizado;
    }

    /**
     * Método para agregar vehículo
     */
    public boolean agregarVehiculo(Vehiculo vehiculo) {
        boolean agregado = false;
        if (!vehiculoExistente(vehiculo.getPlaca())) {
            if (vehiculo instanceof Bus) {
                buses.add((Bus) vehiculo);
            } else if (vehiculo instanceof Camion) {
                camiones.add((Camion) vehiculo);
            } else if (vehiculo instanceof Camioneta) {
                camionetas.add((Camioneta) vehiculo);
            } else if (vehiculo instanceof Carro) {
                carros.add((Carro) vehiculo);
            } else if (vehiculo instanceof Deportivo) {
                deportivos.add((Deportivo) vehiculo);
            } else if (vehiculo instanceof Moto) {
                motos.add((Moto) vehiculo);
            } else if (vehiculo instanceof PickUp) {
                pickUps.add((PickUp) vehiculo);
            } else if (vehiculo instanceof Sedan) {
                sedanes.add((Sedan) vehiculo);
            } else if (vehiculo instanceof Van) {
                vans.add((Van) vehiculo);
            }
            vehiculos.add(vehiculo);
            agregado = true;
        }
        return agregado;
    }

    /**
     * Método para eliminar un vehículo
     */
    public void eliminarVehiculo(Vehiculo vehiculo) {
        if (vehiculo instanceof Bus) {
            buses.remove((Bus) vehiculo);
        } else if (vehiculo instanceof Camion) {
            camiones.remove((Camion) vehiculo);
        } else if (vehiculo instanceof Camioneta) {
            camionetas.remove((Camioneta) vehiculo);
        } else if (vehiculo instanceof Carro) {
            carros.remove((Carro) vehiculo);
        } else if (vehiculo instanceof Deportivo) {
            deportivos.remove((Deportivo) vehiculo);
        } else if (vehiculo instanceof Moto) {
            motos.remove((Moto) vehiculo);
        } else if (vehiculo instanceof PickUp) {
            pickUps.remove((PickUp) vehiculo);
        } else if (vehiculo instanceof Sedan) {
            sedanes.remove((Sedan) vehiculo);
        } else if (vehiculo instanceof Van) {
            vans.remove((Van) vehiculo);
        }
        vehiculos.remove(vehiculo);
    }

    // Método para actualizar un bus verificando que no exista uno con la
    // misma placa
    public boolean actualizarBus(Bus seleccionada, String marca, String placa, int modelo, int cambios,
            double velocidadMaxima, double cilindraje,
            TipoRegistro tipoRegistro, Transmision transmision, Estado estado,
            int capacidadPasajeros, int cantidadPuertas, boolean abs, boolean aireAcondicionado, boolean camaraReversa,
            double capacidadMaletero, int numeroBolsasAire, int numeroEjes,
            int numeroSalidasEmergencia, Combustible combustible, double autonomia, double tiempoCarga,
            boolean enchufable,
            boolean hibridoLigero) {
        boolean actualizado = true;
        for (Bus bus : buses) {
            if (bus != seleccionada && bus.getPlaca().equals(placa)) {
                actualizado = false;
                return actualizado;
            }
        }
        seleccionada.setMarca(marca);
        seleccionada.setPlaca(placa);
        seleccionada.setModelo(modelo);
        seleccionada.setCambios(cambios);
        seleccionada.setVelocidadMaxima(velocidadMaxima);
        seleccionada.setCilindraje(cilindraje);
        seleccionada.setTipoRegistro(tipoRegistro);
        seleccionada.setTransmision(transmision);
        seleccionada.setEstado(estado);
        seleccionada.setCapacidadPasajeros(capacidadPasajeros);
        seleccionada.setCantidadPuertas(cantidadPuertas);
        seleccionada.setAbs(abs);
        seleccionada.setAireAcondicionado(aireAcondicionado);
        seleccionada.setCamaraReversa(camaraReversa);
        seleccionada.setCapacidadMaletero(capacidadMaletero);
        seleccionada.setNumeroBolsasAire(numeroBolsasAire);
        seleccionada.setNumeroEjes(numeroEjes);
        seleccionada.setNumeroSalidasEmergencia(numeroSalidasEmergencia);
        seleccionada.setCombustible(combustible);
        seleccionada.setAutonomia(autonomia);
        seleccionada.setTiempoCarga(tiempoCarga);
        seleccionada.setEnchufable(enchufable);
        seleccionada.setHibridoLigero(hibridoLigero);
        return actualizado;
    }

    // Método para actualizar un camión verificando que no exista uno con la misma
    // placa
    public boolean actualizarCamion(Camion seleccionada, String marca, String placa, int modelo, int cambios,
            double velocidadMaxima, double cilindraje,
            TipoRegistro tipoRegistro, Transmision transmision, Estado estado,
            int capacidadPasajeros, int cantidadPuertas, boolean abs, boolean aireAcondicionado,
            double capacidadCarga, boolean frenosAire, int numeroEjes, TipoCamion tipoCamion, Combustible combustible,
            double autonomia, double tiempoCarga, boolean enchufable, boolean hibridoLigero) {

        boolean actualizado = true;
        for (Camion camion : camiones) {
            if (camion != seleccionada && camion.getPlaca().equals(placa)) {
                actualizado = false;
                return actualizado;
            }
        }

        seleccionada.setMarca(marca);
        seleccionada.setPlaca(placa);
        seleccionada.setModelo(modelo);
        seleccionada.setCambios(cambios);
        seleccionada.setVelocidadMaxima(velocidadMaxima);
        seleccionada.setCilindraje(cilindraje);
        seleccionada.setTipoRegistro(tipoRegistro);
        seleccionada.setTransmision(transmision);
        seleccionada.setEstado(estado);
        seleccionada.setCapacidadPasajeros(capacidadPasajeros);
        seleccionada.setCantidadPuertas(cantidadPuertas);
        seleccionada.setAbs(abs);
        seleccionada.setAireAcondicionado(aireAcondicionado);
        seleccionada.setCapacidadCarga(capacidadCarga);
        seleccionada.setFrenosAire(frenosAire);
        seleccionada.setNumeroEjes(numeroEjes);
        seleccionada.setTipoCamion(tipoCamion);
        seleccionada.setCombustible(combustible);
        seleccionada.setAutonomia(autonomia);
        seleccionada.setTiempoCarga(tiempoCarga);
        seleccionada.setEnchufable(enchufable);
        seleccionada.setHibridoLigero(hibridoLigero);

        return actualizado;
    }

    // Método para actualizar una camioneta verificando que no exista una con la
    // misma placa
    public boolean actualizarCamioneta(Camioneta seleccionada, String marca, String placa, int modelo, int cambios,
            double velocidadMaxima, double cilindraje, TipoRegistro tipoRegistro, Transmision transmision,
            Estado estado,
            int capacidadPasajeros, int cantidadPuertas, boolean abs, boolean aireAcondicionado, boolean camaraReversa,
            double capacidadMaletero, boolean velocidadCrucero, int numeroBolsasAire, boolean sensoresColision,
            boolean sensorTraficoCruzado, boolean asistentepermanenciaCarril, boolean cuatroPorCuatro,
            Combustible combustible, double autonomia, double tiempoCarga, boolean enchufable, boolean hibridoLigero) {

        boolean actualizado = true;
        for (Camioneta camioneta : camionetas) {
            if (camioneta != seleccionada && camioneta.getPlaca().equals(placa)) {
                actualizado = false;
                return actualizado;
            }
        }

        seleccionada.setMarca(marca);
        seleccionada.setPlaca(placa);
        seleccionada.setModelo(modelo);
        seleccionada.setCambios(cambios);
        seleccionada.setVelocidadMaxima(velocidadMaxima);
        seleccionada.setCilindraje(cilindraje);
        seleccionada.setTipoRegistro(tipoRegistro);
        seleccionada.setTransmision(transmision);
        seleccionada.setEstado(estado);
        seleccionada.setCapacidadPasajeros(capacidadPasajeros);
        seleccionada.setCantidadPuertas(cantidadPuertas);
        seleccionada.setAbs(abs);
        seleccionada.setAireAcondicionado(aireAcondicionado);
        seleccionada.setCamaraReversa(camaraReversa);
        seleccionada.setCapacidadMaletero(capacidadMaletero);
        seleccionada.setVelocidadCrucero(velocidadCrucero);
        seleccionada.setNumeroBolsasAire(numeroBolsasAire);
        seleccionada.setSensoresColision(sensoresColision);
        seleccionada.setSensorTraficoCruzado(sensorTraficoCruzado);
        seleccionada.setAsistentepermanenciaCarril(asistentepermanenciaCarril);
        seleccionada.setCuatroPorCuatro(cuatroPorCuatro);
        seleccionada.setCombustible(combustible);
        seleccionada.setAutonomia(autonomia);
        seleccionada.setTiempoCarga(tiempoCarga);
        seleccionada.setEnchufable(enchufable);
        seleccionada.setHibridoLigero(hibridoLigero);

        return actualizado;
    }

    // Método para actualizar un carro verificando que no exista uno con la misma
    // placa
    public boolean actualizarCarro(Carro seleccionada, String marca, String placa, int modelo, int cambios,
            double velocidadMaxima, double cilindraje, TipoRegistro tipoRegistro, Transmision transmision,
            Estado estado, int capacidadPasajeros, int cantidadPuertas, boolean abs,
            boolean aireAcondicionado, boolean camaraReversa, Combustible combustible,
            double autonomia, double tiempoCarga, boolean enchufable, boolean hibridoLigero) {

        boolean actualizado = true;
        for (Carro carro : carros) {
            if (carro != seleccionada && carro.getPlaca().equals(placa)) {
                actualizado = false;
                return actualizado;
            }
        }

        seleccionada.setMarca(marca);
        seleccionada.setPlaca(placa);
        seleccionada.setModelo(modelo);
        seleccionada.setCambios(cambios);
        seleccionada.setVelocidadMaxima(velocidadMaxima);
        seleccionada.setCilindraje(cilindraje);
        seleccionada.setTipoRegistro(tipoRegistro);
        seleccionada.setTransmision(transmision);
        seleccionada.setEstado(estado);
        seleccionada.setCapacidadPasajeros(capacidadPasajeros);
        seleccionada.setCantidadPuertas(cantidadPuertas);
        seleccionada.setAbs(abs);
        seleccionada.setAireAcondicionado(aireAcondicionado);
        seleccionada.setCamaraReversa(camaraReversa);
        seleccionada.setCombustible(combustible);
        seleccionada.setAutonomia(autonomia);
        seleccionada.setTiempoCarga(tiempoCarga);
        seleccionada.setEnchufable(enchufable);
        seleccionada.setHibridoLigero(hibridoLigero);

        return actualizado;
    }

    // Método para actualizar un deportivo verificando que no exista uno con la
    // misma placa
    public boolean actualizarDeportivo(Deportivo seleccionada, String marca, String placa, int modelo, int cambios,
            double velocidadMaxima, double cilindraje, TipoRegistro tipoRegistro, Transmision transmision,
            Estado estado,
            int capacidadPasajeros, int cantidadPuertas, boolean abs, int numeroCaballosFuerza, int numeroBolsasAire,
            double tiempoAlcanzar100kmh, Combustible combustible, double autonomia, double tiempoCarga,
            boolean enchufable, boolean hibridoLigero) {

        boolean actualizado = true;
        for (Deportivo deportivo : deportivos) {
            if (deportivo != seleccionada && deportivo.getPlaca().equals(placa)) {
                actualizado = false;
                return actualizado;
            }
        }

        seleccionada.setMarca(marca);
        seleccionada.setPlaca(placa);
        seleccionada.setModelo(modelo);
        seleccionada.setCambios(cambios);
        seleccionada.setVelocidadMaxima(velocidadMaxima);
        seleccionada.setCilindraje(cilindraje);
        seleccionada.setTipoRegistro(tipoRegistro);
        seleccionada.setTransmision(transmision);
        seleccionada.setEstado(estado);
        seleccionada.setCapacidadPasajeros(capacidadPasajeros);
        seleccionada.setCantidadPuertas(cantidadPuertas);
        seleccionada.setAbs(abs);
        seleccionada.setNumeroCaballosFuerza(numeroCaballosFuerza);
        seleccionada.setNumeroBolsasAire(numeroBolsasAire);
        seleccionada.setTiempoAlcanzar100kmh(tiempoAlcanzar100kmh);
        seleccionada.setCombustible(combustible);
        seleccionada.setAutonomia(autonomia);
        seleccionada.setTiempoCarga(tiempoCarga);
        seleccionada.setEnchufable(enchufable);
        seleccionada.setHibridoLigero(hibridoLigero);

        return actualizado;
    }

    // Método para actualizar una moto verificando que no exista una con la misma
    // placa
    public boolean actualizarMoto(Moto seleccionada, String marca, String placa, int modelo, int cambios,
            double velocidadMaxima, double cilindraje, TipoRegistro tipoRegistro, Transmision transmision,
            Estado estado,
            Combustible combustible, double autonomia, double tiempoCarga, boolean enchufable, boolean hibridoLigero) {

        boolean actualizado = true;
        for (Moto moto : motos) {
            if (moto != seleccionada && moto.getPlaca().equals(placa)) {
                actualizado = false;
                return actualizado;
            }
        }

        seleccionada.setMarca(marca);
        seleccionada.setPlaca(placa);
        seleccionada.setModelo(modelo);
        seleccionada.setCambios(cambios);
        seleccionada.setVelocidadMaxima(velocidadMaxima);
        seleccionada.setCilindraje(cilindraje);
        seleccionada.setTipoRegistro(tipoRegistro);
        seleccionada.setTransmision(transmision);
        seleccionada.setEstado(estado);
        seleccionada.setCombustible(combustible);
        seleccionada.setAutonomia(autonomia);
        seleccionada.setTiempoCarga(tiempoCarga);
        seleccionada.setEnchufable(enchufable);
        seleccionada.setHibridoLigero(hibridoLigero);

        return actualizado;
    }

    // Método para actualizar una pickup verificando que no exista una con la misma
    // placa
    public boolean actualizarPickUp(PickUp seleccionada, String marca, String placa, int modelo, int cambios,
            double velocidadMaxima, double cilindraje, TipoRegistro tipoRegistro, Transmision transmision,
            Estado estado,
            int capacidadPasajeros, int cantidadPuertas, boolean abs, boolean aireAcondicionado, boolean camaraReversa,
            int numeroBolsasAire, boolean cuatroPorCuatro, double capacidadCajaCarga, Combustible combustible,
            double autonomia, double tiempoCarga, boolean enchufable, boolean hibridoLigero) {

        boolean actualizado = true;
        for (PickUp pickUp : pickUps) {
            if (pickUp != seleccionada && pickUp.getPlaca().equals(placa)) {
                actualizado = false;
                return actualizado;
            }
        }

        seleccionada.setMarca(marca);
        seleccionada.setPlaca(placa);
        seleccionada.setModelo(modelo);
        seleccionada.setCambios(cambios);
        seleccionada.setVelocidadMaxima(velocidadMaxima);
        seleccionada.setCilindraje(cilindraje);
        seleccionada.setTipoRegistro(tipoRegistro);
        seleccionada.setTransmision(transmision);
        seleccionada.setEstado(estado);
        seleccionada.setCapacidadPasajeros(capacidadPasajeros);
        seleccionada.setCantidadPuertas(cantidadPuertas);
        seleccionada.setAbs(abs);
        seleccionada.setAireAcondicionado(aireAcondicionado);
        seleccionada.setCamaraReversa(camaraReversa);
        seleccionada.setNumeroBolsasAire(numeroBolsasAire);
        seleccionada.setCuatroPorCuatro(cuatroPorCuatro);
        seleccionada.setCapacidadCajaCarga(capacidadCajaCarga);
        seleccionada.setCombustible(combustible);
        seleccionada.setAutonomia(autonomia);
        seleccionada.setTiempoCarga(tiempoCarga);
        seleccionada.setEnchufable(enchufable);
        seleccionada.setHibridoLigero(hibridoLigero);

        return actualizado;
    }

    // Método para actualizar un sedan verificando que no exista uno con la misma
    // placa
    public boolean actualizarSedan(Sedan seleccionada, String marca, String placa, int modelo, int cambios,
            double velocidadMaxima, double cilindraje, TipoRegistro tipoRegistro, Transmision transmision,
            Estado estado,
            int capacidadPasajeros, int cantidadPuertas, boolean abs, boolean aireAcondicionado, boolean camaraReversa,
            double capacidadMaletero, boolean velocidadCrucero, int numeroBolsasAire,
            boolean sensoresColision, boolean sensorTraficoCruzado, boolean asistentePermanenciaCarril,
            Combustible combustible, double autonomia, double tiempoCarga, boolean enchufable, boolean hibridoLigero) {

        boolean actualizado = true;
        for (Sedan sedan : sedanes) {
            if (sedan != seleccionada && sedan.getPlaca().equals(placa)) {
                actualizado = false;
                return actualizado;
            }
        }

        seleccionada.setMarca(marca);
        seleccionada.setPlaca(placa);
        seleccionada.setModelo(modelo);
        seleccionada.setCambios(cambios);
        seleccionada.setVelocidadMaxima(velocidadMaxima);
        seleccionada.setCilindraje(cilindraje);
        seleccionada.setTipoRegistro(tipoRegistro);
        seleccionada.setTransmision(transmision);
        seleccionada.setEstado(estado);
        seleccionada.setCapacidadPasajeros(capacidadPasajeros);
        seleccionada.setCantidadPuertas(cantidadPuertas);
        seleccionada.setAbs(abs);
        seleccionada.setAireAcondicionado(aireAcondicionado);
        seleccionada.setCamaraReversa(camaraReversa);
        seleccionada.setCapacidadMaletero(capacidadMaletero);
        seleccionada.setVelocidadCrucero(velocidadCrucero);
        seleccionada.setNumeroBolsasAire(numeroBolsasAire);
        seleccionada.setSensoresColision(sensoresColision);
        seleccionada.setSensorTraficoCruzado(sensorTraficoCruzado);
        seleccionada.setAsistentePermanenciaCarril(asistentePermanenciaCarril);
        seleccionada.setCombustible(combustible);
        seleccionada.setAutonomia(autonomia);
        seleccionada.setTiempoCarga(tiempoCarga);
        seleccionada.setEnchufable(enchufable);
        seleccionada.setHibridoLigero(hibridoLigero);

        return actualizado;
    }

    // Método para actualizar una van verificando que no exista una con la misma
    // placa
    public boolean actualizarVan(Van seleccionada, String marca, String placa, int modelo, int cambios,
            double velocidadMaxima, double cilindraje, TipoRegistro tipoRegistro, Transmision transmision,
            Estado estado,
            int capacidadPasajeros, int cantidadPuertas, boolean abs, boolean aireAcondicionado, boolean camaraReversa,
            double capacidadMaletero, int bolsasAire, Combustible combustible, double autonomia, double tiempoCarga,
            boolean enchufable, boolean hibridoLigero) {

        boolean actualizado = true;
        for (Van van : vans) {
            if (van != seleccionada && van.getPlaca().equals(placa)) {
                actualizado = false;
                return actualizado;
            }
        }

        seleccionada.setMarca(marca);
        seleccionada.setPlaca(placa);
        seleccionada.setModelo(modelo);
        seleccionada.setCambios(cambios);
        seleccionada.setVelocidadMaxima(velocidadMaxima);
        seleccionada.setCilindraje(cilindraje);
        seleccionada.setTipoRegistro(tipoRegistro);
        seleccionada.setTransmision(transmision);
        seleccionada.setEstado(estado);
        seleccionada.setCapacidadPasajeros(capacidadPasajeros);
        seleccionada.setCantidadPuertas(cantidadPuertas);
        seleccionada.setAbs(abs);
        seleccionada.setAireAcondicionado(aireAcondicionado);
        seleccionada.setCamaraReversa(camaraReversa);
        seleccionada.setCapacidadMaletero(capacidadMaletero);
        seleccionada.setBolsasAire(bolsasAire);
        seleccionada.setCombustible(combustible);
        seleccionada.setAutonomia(autonomia);
        seleccionada.setTiempoCarga(tiempoCarga);
        seleccionada.setEnchufable(enchufable);
        seleccionada.setHibridoLigero(hibridoLigero);

        return actualizado;
    }

    /**
     * Método verificar si un vehículo ya existe por su placa
     */
    public boolean vehiculoExistente(String placa) {
        boolean existente = false;
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getPlaca().equals(placa)) {
                existente = true;
            }
        }
        return existente;
    }

    /**
     * Método para registrar una compra de vehículo
     */
    public void comprarVehiculo(LocalDate fechaEntrega, LocalDate fechaDevolucion, Empleado empleado, Cliente cliente,
            Vehiculo vehiculo, double precio) {
        Transaccion transaccion = new Transaccion(fechaEntrega, fechaDevolucion, precio, TipoTransaccion.COMPRA,
                empleado, cliente,
                vehiculo);

        // Agregar transacción de forma independiente al concesionario y al cliente
        agregarTransaccion(transaccion);
        cliente.agregarTransaccion(transaccion);

        // Actualizar lista de vehículos y fondos
        vehiculos.remove(vehiculo);
        fondos -= precio;
        mostrarMensaje("Compra de vehículo registrada.");
    }

    /**
     * Método para registrar una venta de vehículo
     */
    public void venderVehiculo(Empleado empleado, Cliente cliente, Vehiculo vehiculo, double precio,
            LocalDate fechaEntrega, LocalDate fechaDevolucion) {
        Transaccion transaccion = new Transaccion(fechaEntrega, fechaDevolucion, precio, TipoTransaccion.VENTA,
                empleado, cliente,
                vehiculo);

        // Agregar transacción de forma independiente al concesionario y al cliente
        agregarTransaccion(transaccion);
        cliente.agregarTransaccion(transaccion);

        // Actualizar lista de vehículos y fondos
        vehiculos.remove(vehiculo);
        fondos += precio;
        mostrarMensaje("Venta de vehículo registrada.");
    }

    /**
     * Método para registrar un alquiler de vehículo
     */
    public void alquilarVehiculo(Empleado empleado, Cliente cliente, Vehiculo vehiculo, double precio,
            LocalDate fechaEntrega,
            LocalDate fechaEntregaDevolucion) {
        Transaccion transaccion = new Transaccion(fechaEntrega, fechaEntregaDevolucion, precio,
                TipoTransaccion.ALQUILER, empleado, cliente,
                vehiculo);

        // Agregar transacción de forma independiente al concesionario y al cliente
        agregarTransaccion(transaccion);
        cliente.agregarTransaccion(transaccion);

        // Actualizar los fondos en caso de alquiler
        fondos += precio;
        mostrarMensaje("Alquiler de vehículo registrado.");
    }

    /**
     * Método para mostrar mensaje
     */
    public static void mostrarMensaje(String mensaje) {
        System.out.println();
    }

    /**
     * Método para crear un nuevo cliente.
     */
    public Cliente crearCliente(String nombre, String apellido, String correo, String cedula, String telefono,
            String usuario, String contrasena,
            PreguntaSeguridad preguntaSeguridad, String respuesta) {
        return new Cliente(nombre, apellido, correo, cedula, telefono, usuario, contrasena, preguntaSeguridad,
                respuesta);
    }

    /**
     * Método para agregar cliente
     */
    public boolean agregarCliente(Cliente cliente) {
        boolean agregado = false;
        if (!clienteExistente(cliente.getUsuario())) {
            clientes.add(cliente);
            agregado = true;
        }
        return agregado;
    }

    /**
     * Método para eliminar un cliente.
     */
    public void eliminarCliente(Cliente cliente) {
        clientes.remove(cliente);
    }

    /**
     * Método para actualizar un cliente. Duda de si al actualizarlo también se le
     * pueda actualizar el usuario y contrasena(El que lo acualiza es el
     * administrador)
     */
    public boolean actualizarCliente(Cliente seleccionado, String nombre, String apellido, String correo, String cedula,
            String telefono, String usuario, String contrasena,
            PreguntaSeguridad preguntaSeguridad, String respuesta) {
        boolean actualizado = true;
        for (Cliente cliente : clientes) {
            if (cliente != seleccionado && cliente.getUsuario().equals(usuario)) {
                actualizado = false;
                return actualizado;
            }
        }
        seleccionado.setUsuario(usuario);
        seleccionado.setNombre(nombre);
        seleccionado.setApellido(apellido);
        seleccionado.setCorreo(correo);
        seleccionado.setCedula(cedula);
        seleccionado.setTelefono(telefono);
        seleccionado.setUsuario(usuario);
        seleccionado.setContrasena(contrasena);
        seleccionado.setPreguntaSeguridad(preguntaSeguridad);
        seleccionado.setRespuesta(respuesta);
        return actualizado;
    }

    /**
     * Método para verificar la existencia de un cliente con su usuario.
     */
    public boolean clienteExistente(String usuario) {
        boolean existente = false;
        for (Cliente cliente : clientes) {
            if (cliente.getUsuario().equals(usuario)) {
                existente = true;
                break;
            }
        }
        return existente;
    }

        /**
     * Método para obtener un cliente por su ususario y contraseña
     */
    public Cliente obtenerCliente(String usuario, String contrasena) {
        Cliente clienteEncontrado = null;
        for (Cliente cliente : clientes) {
            if (cliente.getUsuario().equals(usuario) && cliente.getContrasena().equals(contrasena)) {
                clienteEncontrado = cliente;
                break;
            }
        }
        return clienteEncontrado;
    }

        /**
     * Método para obtener un empleado por su usrio y contraseña]
     */
    public Empleado obtenerEmpleado(String usuario, String contrasena) {
        Empleado empleadoEncontrado = null;
        for (Empleado empleado : empleados) {
            if (empleado.getUsuario().equals(usuario) && empleado.getContrasena().equals(contrasena)) {
                empleadoEncontrado = empleado;
                break;
            }
        }
        return empleadoEncontrado;
    }

    public boolean validarAdministrador(String usuario, String contrasena){
        return this.administrador.getUsuario().equals(usuario) && this.administrador.getContrasena().equals(contrasena);

    }



    /**
     * Método para actualizar un cliente. Duda de si al actualizarlo también se le
     * pueda actualizar el usuario y contrasena(El que lo acualiza es el
     * administrador)
     */
    public void actualizarAdmin(Administrador admin, String nombre, String apellido, String correo, String cedula,
            String telefono, String usuario, String contrasena,
            PreguntaSeguridad preguntaSeguridad, String respuesta) {
        admin.setUsuario(usuario);
        admin.setNombre(nombre);
        admin.setApellido(apellido);
        admin.setCorreo(correo);
        admin.setCedula(cedula);
        admin.setTelefono(telefono);
        admin.setUsuario(usuario);
        admin.setContrasena(contrasena);
        admin.setPreguntaSeguridad(preguntaSeguridad);
        admin.setRespuesta(respuesta);
    }

    /**
     * Método para ver los reportes de un empleado en un tiempo dado
     */
    public  LinkedList<Transaccion> verTransaccionesEmpleado(Empleado empleado, LocalDate fecha1, LocalDate fecha2) {
         LinkedList<Transaccion> transaccionesEmpleado =   new LinkedList<>();
        for (Transaccion transaccion : empleado.getTransacciones()) {
            if (transaccion.getfechaEntrega().isBefore(fecha2) && transaccion.getfechaEntrega().isAfter(fecha1)) {
                transaccionesEmpleado.add(transaccion);
            }
        }
        return transaccionesEmpleado;
    }

    /**
     * Método para obtener una lista de vehiculos para venta
     */
    public  LinkedList<Vehiculo> obtenerVehiculosVenta() {
         LinkedList<Vehiculo> vehiculosVenta =   new LinkedList<>();
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getTipoRegistro().equals(TipoRegistro.VENTA)) {
                vehiculosVenta.add(vehiculo);
            }
        }
        return vehiculosVenta;
    }

    /**
     * Método para obtener una lista de vehiculos para compra
     */
    public  LinkedList<Vehiculo> obtenerVehiculosAlquiler() {
         LinkedList<Vehiculo> vehiculosAlquiler =   new LinkedList<>();
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getTipoRegistro().equals(TipoRegistro.ALQUILER)) {
                vehiculosAlquiler.add(vehiculo);
            }
        }
        return vehiculosAlquiler;
    }

    /**
     * Método para validar si una fecha es posterior a otra
     */
    public boolean validarFechaPosterior(LocalDate fecha1, LocalDate fecha2) {
        return fecha1.isAfter(fecha2) || fecha1.isEqual(fecha2);
    }

    /**
     * Método para calcular los días entre dos fechas
     */
    public int calcularDias(LocalDate fecha1, LocalDate fecha2) {
        return (int) ChronoUnit.DAYS.between(fecha1, fecha2);
    }


    /**
     * Método para cobtener la intersección entre 2 listas
     */
    public  LinkedList<Vehiculo> obtenerInterseccion( LinkedList<Vehiculo> lista1,  LinkedList<Vehiculo> lista2) {
         LinkedList<Vehiculo> interseccion =   new LinkedList<>();
        
        for (Vehiculo vehiculo : lista1) {
            if (lista2.contains(vehiculo)) {
                interseccion.add(vehiculo);
            }
        }
        return interseccion;
    }
}
