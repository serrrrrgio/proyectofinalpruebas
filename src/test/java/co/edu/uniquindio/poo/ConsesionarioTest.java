/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class ConsesionarioTest {
    private static final Logger LOG = Logger.getLogger(ConsesionarioTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        LOG.info("Iniciado test shouldAnswerWithTrue");
        assertTrue(true);
        LOG.info("Finalizando test shouldAnswerWithTrue");
    }
    
@Test
public void testEmpleadoExistente() {
    LOG.info("Iniciando test empleado existente");

    Administrador administrador = new Administrador("Joab", "Suarez", "jb@gmail.com", "123", "321", "joab123", "Laura", PreguntaSeguridad.BEST_FRIEND, "Laura");
    Concesionario concesionario = new Concesionario("Carros", 52145214.154, administrador);
    Empleado empleado1 = new Empleado("Maicol", "Alvarez", "Maicol@gmail.com", "12341", "235263436", "Maicol123", "32541", PreguntaSeguridad.BEST_FRIEND, "Victoria", 22);
    Empleado empleadoDuplicado = new Empleado("Maicol", "Alvarez", "Maicol@gmail.com", "12341", "235263436", "Maicol123", "32541", PreguntaSeguridad.BEST_FRIEND, "Victoria", 22);

    concesionario.agregarEmpleado(empleado1);

    // Verificar que el empleado fue agregado correctamente
    assertTrue(concesionario.getEmpleados().contains(empleado1));

    // Intentar agregar el mismo empleado nuevamente y verificar que no se agregue
    boolean agregado = concesionario.agregarEmpleado(empleadoDuplicado);
    assertEquals(false, agregado);

    LOG.info("Finalizando test empleado existente");
}

@Test
public void testClienteExistente() {
    LOG.info("Iniciando test cliente existente");

    Administrador administrador = new Administrador("Joab", "Suarez", "jb@gmail.com", "123", "321", "joab123", "LL", PreguntaSeguridad.BEST_FRIEND, "Laura");
    Concesionario concesionario = new Concesionario("Carros", 52145214.154, administrador);
    Cliente cliente = new Cliente("Sergio", "Posada", "Sergio@gmail.com", "1107849207", "3245844293", "SdeSergio", "1107849207", PreguntaSeguridad.BEST_FRIEND, "Padilla");
    Cliente clienteDuplicado = new Cliente("Sergio", "Posada", "Sergio@gmail.com", "1107849207", "3245844293", "SdeSergio", "1107849207", PreguntaSeguridad.BEST_FRIEND, "Padilla");

    concesionario.agregarCliente(cliente);

    // Verificar que el cliente fue agregado correctamente
    assertTrue(concesionario.getClientes().contains(cliente));

    // Intentar agregar el mismo cliente nuevamente y verificar que no se agregue
    boolean agregado = concesionario.agregarCliente(clienteDuplicado);
    assertEquals(false, agregado);

    LOG.info("Finalizando test cliente existente");
}

    

    @Test
    public void testAgregarCliente() {
        LOG.info("Iniciado test agregar cliente");

        Administrador administrador = new Administrador("Joab", "Suarez", "jb@gmail.com", "123", "321", "joab123", "Laura", PreguntaSeguridad.BEST_FRIEND, "Laura");
        Concesionario concesionario = new Concesionario("Carros", 52145214.154, administrador);
        Empleado empleado1 = new Empleado("Maicol", "Alvarez", "Maicol@gmail.com", "12341", "235263436", "Maicol123", "32541", PreguntaSeguridad.BEST_FRIEND, "Victoria", 22);
        Cliente cliente = new Cliente("Sergio", "Posada", "Sergio@gmail.com", "1107849207", "3245844293", "SdeSergio", "1107849207", PreguntaSeguridad.BEST_FRIEND, "Padilla");
        concesionario.agregarEmpleado(empleado1);
        concesionario.agregarCliente(cliente);
    
        assertTrue(concesionario.getClientes().contains(cliente));
        LOG.info("Finalizando test agregar cliente");
    }

         @Test
    public void testDatosVacios() {
        LOG.info("Iniciado test datos vacíos");
        assertThrows(Throwable.class , () -> new Concesionario(null, 0, null));
        LOG.info("Finalizando test datos vacíos");
    }

    @Test
public void testActualizarEmpleado() {
    LOG.info("Iniciando test actualizar empleado");

    // Crear administrador y concesionario
    Administrador administrador = new Administrador("Joab", "Suarez", "jb@gmail.com", "123", "321", "joab123", "Laura", PreguntaSeguridad.BEST_FRIEND, "Laura");
    Concesionario concesionario = new Concesionario("Carros", 52145214.154, administrador);

    // Crear empleados
    Empleado empleado1 = new Empleado("Carlos", "González", "carlos@gmail.com", "12345", "987654321", "carlosG", "pass123", PreguntaSeguridad.BEST_FRIEND, "Pedro", 25);
    Empleado empleado2 = new Empleado("Ana", "Martínez", "ana@gmail.com", "54321", "123456789", "anaM", "pass456", PreguntaSeguridad.BEST_FRIEND, "Sofía", 30);

    // Agregar empleados al concesionario
    concesionario.agregarEmpleado(empleado1);
    concesionario.agregarEmpleado(empleado2);

    // Intentar actualizar empleado1 con un usuario que ya existe (el usuario de empleado2)
    boolean actualizado = concesionario.actualizarEmpleado(empleado1, "Carlos", "González", "carlos@gmail.com", "12345", "987654321", "anaM", "newPass123", PreguntaSeguridad.PET_NAME, "Fido");

    // Verificar que la actualización no fue exitosa debido al usuario duplicado
    assertEquals(false, actualizado);

    // Ahora, intentar actualizar con un usuario único
    actualizado = concesionario.actualizarEmpleado(empleado1, "Carlos", "González", "carlos@gmail.com", "12345", "987654321", "carlosUpdated", "newPass123", PreguntaSeguridad.PET_NAME, "Fido");

    // Verificar que la actualización fue exitosa
    assertEquals(true, actualizado);

    // Verificar que los atributos se actualizaron correctamente
    assertEquals("Carlos", empleado1.getNombre());
    assertEquals("González", empleado1.getApellido());
    assertEquals("carlos@gmail.com", empleado1.getCorreo());
    assertEquals("12345", empleado1.getCedula());
    assertEquals("987654321", empleado1.getTelefono());
    assertEquals("carlosUpdated", empleado1.getUsuario());
    assertEquals("newPass123", empleado1.getContrasena());
    assertEquals(PreguntaSeguridad.PET_NAME, empleado1.getPreguntaSeguridad());
    assertEquals("Fido", empleado1.getRespuesta());

    LOG.info("Finalizando test actualizar empleado");
}

@Test
public void testAgregarVehiculo() {
    LOG.info("Iniciando prueba: testAgregarVehiculo");

    Administrador administrador = new Administrador("Joab", "Suarez", "jb@gmail.com", "123", "321", "joab123", "Laura", PreguntaSeguridad.BEST_FRIEND, "Laura");
    Concesionario concesionario = new Concesionario("Carros", 52145214.154, administrador);
    Vehiculo vehiculo = new Carro("Marca", "ABC123", 2024, 5, 120.5, 1500.0, 
    TipoRegistro.ALQUILER, Transmision.AUTOMATICA, Estado.NUEVO, 
    5, 4, true, true, true, 
    Combustible.GASOLINA, 500.0, 2.0, true, false);

    boolean resultado = concesionario.agregarVehiculo(vehiculo);
    LOG.info("Resultado de agregarVehiculo: " + resultado);

    assertTrue(resultado, "El vehículo no se agregó correctamente.");

    LOG.info("Finalizando prueba: testAgregarVehiculo");
}

@Test
public void testEliminarVehiculo() {
    LOG.info("Iniciando prueba: testEliminarVehiculo");

    Administrador administrador = new Administrador("Joab", "Suarez", "jb@gmail.com", "123", "321", "joab123", "Laura", PreguntaSeguridad.BEST_FRIEND, "Laura");
    Concesionario concesionario = new Concesionario("Carros", 52145214.154, administrador);
    Vehiculo vehiculo = new Carro("Marca", "ABC123", 2024, 5, 120.5, 1500.0, 
    TipoRegistro.ALQUILER, Transmision.AUTOMATICA, Estado.NUEVO, 
    5, 4, true, true, true, 
    Combustible.GASOLINA, 500.0, 2.0, true, false);
    concesionario.agregarVehiculo(vehiculo);
    concesionario.eliminarVehiculo(vehiculo);

    boolean vehiculoEliminado = !concesionario.getVehiculos().contains(vehiculo);
    LOG.info("Resultado de eliminarVehiculo: " + vehiculoEliminado);

    assertTrue(vehiculoEliminado, "El vehículo no se eliminó correctamente.");

    LOG.info("Finalizando prueba: testEliminarVehiculo");
}

@Test
public void testActualizarBus() {
    LOG.info("Iniciando prueba: testActualizarBus");

    Administrador administrador = new Administrador("Joab", "Suarez", "jb@gmail.com", "123", "321", "joab123", "Laura", PreguntaSeguridad.BEST_FRIEND, "Laura");
    Concesionario concesionario = new Concesionario("Carros", 52145214.154, administrador);
    Bus bus = new Bus("Marca", "XYZ789", 2020, 4, 100.0, 3000.0, TipoRegistro.ALQUILER,
    Transmision.MANUAL, Estado.USADO, 50, 2, true, true, false,
    200.0, 6, 3, 2, Combustible.DIESEL, 700.0, 3.0, true, false);
concesionario.agregarVehiculo(bus);

boolean actualizado = concesionario.actualizarBus(bus, "NuevaMarca", "XYZ789", 2024, 5, 120.0, 3500.0,
                                    TipoRegistro.ALQUILER, Transmision.AUTOMATICA, Estado.NUEVO,
                                    55, 3, true, true, true, 250.0, 7, 4, 3, Combustible.DIESEL,
                                    750.0, 3.5, true, false);


    LOG.info("Resultado de actualizarBus: " + actualizado);

    assertTrue(actualizado, "El bus no se actualizó correctamente.");

    LOG.info("Finalizando prueba: testActualizarBus");
}

@Test
public void testActualizarCamion() {
    LOG.info("Iniciando prueba: testActualizarCamion");
    Administrador administrador = new Administrador("Joab", "Suarez", "jb@gmail.com", "123", "321", "joab123", "Laura", PreguntaSeguridad.BEST_FRIEND, "Laura");
    Concesionario concesionario = new Concesionario("Carros", 52145214.154, administrador);
    Camion camion = new Camion("Marca", "DEF456", 2020, 3, 150.0, 5000.0, TipoRegistro.ALQUILER, 
    Transmision.MANUAL, Estado.USADO, 20, 2, true, true, 
    600.0, true, 3, TipoCamion.MEDIANO, Combustible.DIESEL, 
    600.0, 3.5, true, false);
concesionario.agregarVehiculo(camion);

boolean actualizado = concesionario.actualizarCamion(camion, "NuevaMarca", "DEF456", 2024, 4, 160.0, 5500.0, 
                              TipoRegistro.VENTA, Transmision.AUTOMATICA, Estado.USADO, 
                              25, 3, true, true, 650.0, false, 4, TipoCamion.PESADO, 
                              Combustible.DIESEL, 650.0, 4.0, true, false);


    LOG.info("Resultado de actualizarCamion: " + actualizado);

    assertTrue(actualizado, "El camión no se actualizó correctamente.");

    LOG.info("Finalizando prueba: testActualizarCamion");
}

@Test
public void testActualizarDeportivo() {
    LOG.info("Iniciando prueba: testActualizarDeportivo");

    Administrador administrador = new Administrador("Joab", "Suarez", "jb@gmail.com", "123", "321", "joab123", "Laura", PreguntaSeguridad.BEST_FRIEND, "Laura");
    Concesionario concesionario = new Concesionario("Carros", 52145214.154, administrador);

    // Crear un deportivo y agregarlo al concesionario
    Deportivo deportivo = new Deportivo("Marca", "DEF456", 2020, 3, 150.0, 5000.0, TipoRegistro.ALQUILER,
                                        Transmision.MANUAL, Estado.USADO, 2, 2, true, 300, 6,
                                        5.0, Combustible.GASOLINA, 600.0, 3.5, true, false);
    concesionario.agregarVehiculo(deportivo);

    // Actualizar el deportivo
    boolean actualizado = concesionario.actualizarDeportivo(deportivo, "NuevaMarca", "DEF456", 2024, 4, 160.0, 5500.0,
                                                            TipoRegistro.VENTA, Transmision.AUTOMATICA, Estado.USADO,
                                                            2, 2, true, 350, 8, 4.5, Combustible.GASOLINA, 650.0, 4.0,
                                                            true, false);

    LOG.info("Resultado de actualizarDeportivo: " + actualizado);

    assertTrue(actualizado, "El deportivo no se actualizó correctamente.");

    LOG.info("Finalizando prueba: testActualizarDeportivo");
}



@Test
public void testActualizarMoto() {
    LOG.info("Iniciando prueba: testActualizarMoto");

    Administrador administrador = new Administrador("Joab", "Suarez", "jb@gmail.com", "123", "321", "joab123", "Laura", PreguntaSeguridad.BEST_FRIEND, "Laura");
    Concesionario concesionario = new Concesionario("Carros", 52145214.154, administrador);

    // Crear una moto y agregarla al concesionario
    Moto moto = new Moto("Marca", "XYZ789", 2020, 4, 100.0, 300.0, TipoRegistro.ALQUILER,
                         Transmision.MANUAL, Estado.USADO, Combustible.GASOLINA, 350.0, 2.0, true, false);
    concesionario.agregarVehiculo(moto);

    // Actualizar la moto
    boolean actualizado = concesionario.actualizarMoto(moto, "NuevaMarca", "XYZ789", 2024, 5, 120.0, 350.0,
                                                       TipoRegistro.ALQUILER, Transmision.AUTOMATICA, Estado.NUEVO,
                                                       Combustible.GASOLINA, 400.0, 2.5, true, false);

    LOG.info("Resultado de actualizarMoto: " + actualizado);

    assertTrue(actualizado, "La moto no se actualizó correctamente.");

    LOG.info("Finalizando prueba: testActualizarMoto");
}


@Test
public void testActualizarPickUp() {
    LOG.info("Iniciando prueba: testActualizarPickUp");

    Administrador administrador = new Administrador("Joab", "Suarez", "jb@gmail.com", "123", "321", "joab123", "Laura", PreguntaSeguridad.BEST_FRIEND, "Laura");
    Concesionario concesionario = new Concesionario("Carros", 52145214.154, administrador);

    // Crear una PickUp y agregarla al concesionario
    PickUp pickUp = new PickUp("Marca", "DEF456", 2020, 3, 150.0, 4000.0, TipoRegistro.ALQUILER,
                               Transmision.MANUAL, Estado.USADO, 5, 2, true, true, false,
                               4, true, 1000.0, Combustible.DIESEL, 600.0, 3.0, true, false);
    concesionario.agregarVehiculo(pickUp);

    // Actualizar la PickUp
    boolean actualizado = concesionario.actualizarPickUp(pickUp, "NuevaMarca", "DEF456", 2024, 4, 160.0, 4500.0,
                                                         TipoRegistro.VENTA, Transmision.AUTOMATICA, Estado.USADO,
                                                         6, 3, true, true, true, 6, false, 1200.0,
                                                         Combustible.DIESEL, 650.0, 3.5, true, false);

    LOG.info("Resultado de actualizarPickUp: " + actualizado);

    assertTrue(actualizado, "La PickUp no se actualizó correctamente.");

    LOG.info("Finalizando prueba: testActualizarPickUp");
}



@Test
public void testActualizarSedan() {
    LOG.info("Iniciando prueba: testActualizarSedan");

    Administrador administrador = new Administrador("Joab", "Suarez", "jb@gmail.com", "123", "321", "joab123", "Laura", PreguntaSeguridad.BEST_FRIEND, "Laura");
    Concesionario concesionario = new Concesionario("Carros", 52145214.154, administrador);

    // Crear un Sedan y agregarlo al concesionario
    Sedan sedan = new Sedan("Marca", "XYZ789", 2020, 4, 180.0, 2500.0, TipoRegistro.ALQUILER,
                            Transmision.MANUAL, Estado.USADO, 5, 4, true, true, false,
                            500.0, true, 4, true, true, true, Combustible.DIESEL,
                            700.0, 3.0, true, false);
    concesionario.agregarVehiculo(sedan);

    // Actualizar el Sedan
    boolean actualizado = concesionario.actualizarSedan(sedan, "NuevaMarca", "XYZ789", 2024, 5, 200.0, 2700.0,
                                                       TipoRegistro.VENTA, Transmision.AUTOMATICA, Estado.NUEVO,
                                                       5, 4, true, true, true, 600.0, true, 6,
                                                       true, true, true, Combustible.DIESEL, 750.0, 3.5, true, false);

    LOG.info("Resultado de actualizarSedan: " + actualizado);

    assertTrue(actualizado, "El Sedan no se actualizó correctamente.");

    LOG.info("Finalizando prueba: testActualizarSedan");
}


@Test
public void testActualizarVan() {
    LOG.info("Iniciando prueba: testActualizarVan");

    Administrador administrador = new Administrador("Joab", "Suarez", "jb@gmail.com", "123", "321", "joab123", "Laura", PreguntaSeguridad.BEST_FRIEND, "Laura");
    Concesionario concesionario = new Concesionario("Carros", 52145214.154, administrador);

    // Crear una Van y agregarla al concesionario
    Van van = new Van("Marca", "DEF456", 2020, 3, 150.0, 3500.0, TipoRegistro.ALQUILER,
                      Transmision.MANUAL, Estado.USADO, 8, 4, true, true, true,
                      700.0, 6, Combustible.DIESEL, 700.0, 3.5, true, false);
    concesionario.agregarVehiculo(van);

    // Actualizar la Van
    boolean actualizado = concesionario.actualizarVan(van, "NuevaMarca", "DEF456", 2024, 4, 160.0, 3600.0,
                                                     TipoRegistro.VENTA, Transmision.AUTOMATICA, Estado.USADO,
                                                     10, 5, true, true, true, 750.0, 8,
                                                     Combustible.DIESEL, 750.0, 4.0, true, false);

    LOG.info("Resultado de actualizarVan: " + actualizado);

    assertTrue(actualizado, "La van no se actualizó correctamente.");

    LOG.info("Finalizando prueba: testActualizarVan");
}

@Test
public void testComprarVehiculo() {
    LOG.info("Iniciando prueba: testComprarVehiculo");
    
    Administrador administrador = new Administrador("Joab", "Suarez", "jb@gmail.com", "123", "321", "joab123", "Laura", PreguntaSeguridad.BEST_FRIEND, "Laura");
    Concesionario concesionario = new Concesionario("Carros", 52145214.154, administrador);

    // Inicializar las listas en el test
    concesionario.setCamionetas(new LinkedList<>());  
    concesionario.setVehiculos(new LinkedList<>());  
    
    // Configurar los objetos necesarios
    Empleado empleado1 = new Empleado("Maicol", "Alvarez", "Maicol@gmail.com", "12341", "235263436", "Maicol123", "32541", PreguntaSeguridad.BEST_FRIEND, "Victoria", 22);
    Cliente cliente = new Cliente("Sergio", "Posada", "Sergio@gmail.com", "1107849207", "3245844293", "SdeSergio", "1107849207", PreguntaSeguridad.BEST_FRIEND, "Padilla");
    Vehiculo vehiculo = new Camioneta("Marca", "XYZ789", 2020, 4, 100.0, 3000.0, TipoRegistro.ALQUILER, 
                                      Transmision.MANUAL, Estado.USADO, 50, 2, true, true, false, 
                                      200.0, true, 3, true, true, true, true, Combustible.DIESEL, 
                                      700.0, 3.0, true, false);

    // Registrar el vehículo, cliente, empleado en el concesionario
    concesionario.agregarVehiculo(vehiculo);
    concesionario.agregarCliente(cliente);  
    concesionario.agregarEmpleado(empleado1);  

    // Definir los datos de la compra
    LocalDate fechaEntrega = LocalDate.of(2024, 11, 18);
    LocalDate fechaDevolucion = LocalDate.of(2024, 11, 19);
    double precio = 20000.0;

    // Comprar el vehículo
    concesionario.comprarVehiculo(fechaEntrega, fechaDevolucion, empleado1, cliente, vehiculo, precio);

    // Verificar la actualización de los vehículos y fondos
    assertFalse(concesionario.getVehiculos().contains(vehiculo), "El vehículo no se eliminó de la lista de vehículos.");
    assertTrue(cliente.getTransacciones().size() > 0, "El cliente no tiene transacciones.");
    assertEquals(52145214.154 - precio, concesionario.getFondos(), 0.01, "El fondo del concesionario no se actualizó correctamente.");
    assertTrue(concesionario.getClientes().contains(cliente), "El cliente no está registrado en el concesionario.");
    assertTrue(concesionario.getEmpleados().contains(empleado1), "El empleado no está registrado en el concesionario.");

    LOG.info("Finalizando prueba: testComprarVehiculo");
}

@Test
public void testVenderVehiculo() {
    LOG.info("Iniciando prueba: testVenderVehiculo");

    Administrador administrador = new Administrador("Joab", "Suarez", "jb@gmail.com", "123", "321", "joab123", "Laura", PreguntaSeguridad.BEST_FRIEND, "Laura");
    Concesionario concesionario = new Concesionario("Carros", 52145214.154, administrador);

    // Inicializar las listas en el test
    concesionario.setCamionetas(new LinkedList<>());  
    concesionario.setVehiculos(new LinkedList<>());  
    
    // Configurar los objetos necesarios
    Empleado empleado1 = new Empleado("Maicol", "Alvarez", "Maicol@gmail.com", "12341", "235263436", "Maicol123", "32541", PreguntaSeguridad.BEST_FRIEND, "Victoria", 22);
    Cliente cliente = new Cliente("Sergio", "Posada", "Sergio@gmail.com", "1107849207", "3245844293", "SdeSergio", "1107849207", PreguntaSeguridad.BEST_FRIEND, "Padilla");
    Vehiculo vehiculo = new Camioneta("Marca", "XYZ789", 2020, 4, 100.0, 3000.0, TipoRegistro.ALQUILER, 
                                      Transmision.MANUAL, Estado.USADO, 50, 2, true, true, false, 
                                      200.0, true, 3, true, true, true, true, Combustible.DIESEL, 
                                      700.0, 3.0, true, false);

    // Registrar el vehículo, cliente, empleado en el concesionario
    concesionario.agregarVehiculo(vehiculo);
    concesionario.agregarCliente(cliente);  
    concesionario.agregarEmpleado(empleado1);  

    // Definir los datos de la venta
    LocalDate fechaEntrega = LocalDate.of(2024, 11, 18);
    LocalDate fechaDevolucion = LocalDate.of(2024, 11, 19);
    double precio = 25000.0;

    // Vender el vehículo
    concesionario.venderVehiculo(empleado1, cliente, vehiculo, precio, fechaEntrega, fechaDevolucion);

    // Verificar la actualización de los vehículos y fondos
    assertFalse(concesionario.getVehiculos().contains(vehiculo), "El vehículo no se eliminó de la lista de vehículos.");
    assertTrue(cliente.getTransacciones().size() > 0, "El cliente no tiene transacciones.");
    assertEquals(52145214.154 + precio, concesionario.getFondos(), 0.01, "El fondo del concesionario no se actualizó correctamente.");
    assertTrue(concesionario.getClientes().contains(cliente), "El cliente no está registrado en el concesionario.");
    assertTrue(concesionario.getEmpleados().contains(empleado1), "El empleado no está registrado en el concesionario.");

    LOG.info("Finalizando prueba: testVenderVehiculo");
}

@Test
public void testAlquilarVehiculo() {
    LOG.info("Iniciando prueba: testAlquilarVehiculo");

    Administrador administrador = new Administrador("Joab", "Suarez", "jb@gmail.com", "123", "321", "joab123", "Laura", PreguntaSeguridad.BEST_FRIEND, "Laura");
    Concesionario concesionario = new Concesionario("Carros", 52145214.154, administrador);

    // Inicializar las listas en el test
    concesionario.setCamionetas(new LinkedList<>());  
    concesionario.setVehiculos(new LinkedList<>());  
    
    // Configurar los objetos necesarios
    Empleado empleado1 = new Empleado("Maicol", "Alvarez", "Maicol@gmail.com", "12341", "235263436", "Maicol123", "32541", PreguntaSeguridad.BEST_FRIEND, "Victoria", 22);
    Cliente cliente = new Cliente("Sergio", "Posada", "Sergio@gmail.com", "1107849207", "3245844293", "SdeSergio", "1107849207", PreguntaSeguridad.BEST_FRIEND, "Padilla");
    Vehiculo vehiculo = new Camioneta("Marca", "XYZ789", 2020, 4, 100.0, 3000.0, TipoRegistro.ALQUILER, 
                                      Transmision.MANUAL, Estado.USADO, 50, 2, true, true, false, 
                                      200.0, true, 3, true, true, true, true, Combustible.DIESEL, 
                                      700.0, 3.0, true, false);

    // Registrar el vehículo, cliente, empleado en el concesionario
    concesionario.agregarVehiculo(vehiculo);
    concesionario.agregarCliente(cliente);  
    concesionario.agregarEmpleado(empleado1);  

    // Definir los datos del alquiler
    LocalDate fechaEntrega = LocalDate.of(2024, 11, 18);
    LocalDate fechaDevolucion = LocalDate.of(2024, 11, 19);
    double precio = 1000.0;

    // Alquilar el vehículo
    concesionario.alquilarVehiculo(empleado1, cliente, vehiculo, precio, fechaEntrega, fechaDevolucion);

    // Verificar la actualización de los fondos y las transacciones
    assertTrue(cliente.getTransacciones().size() > 0, "El cliente no tiene transacciones.");
    assertEquals(52145214.154 + precio, concesionario.getFondos(), 0.01, "El fondo del concesionario no se actualizó correctamente.");
    assertTrue(concesionario.getVehiculos().contains(vehiculo), "El vehículo no está disponible para alquiler.");
    assertTrue(concesionario.getClientes().contains(cliente), "El cliente no está registrado en el concesionario.");
    assertTrue(concesionario.getEmpleados().contains(empleado1), "El empleado no está registrado en el concesionario.");

    LOG.info("Finalizando prueba: testAlquilarVehiculo");
}


}

