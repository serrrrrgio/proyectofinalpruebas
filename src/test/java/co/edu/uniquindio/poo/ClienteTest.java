/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class ClienteTest {
    private static final Logger LOG = Logger.getLogger(ClienteTest.class.getName());

    @Test
public void testAgregarTransaccion() {
    LOG.info("Iniciando test de agregarTransaccion() de Cliente");

    Cliente cliente = new Cliente("Juan", "Pérez", "juanperez@gmail.com", "987654321", "123456789", "juanp", "pass123", PreguntaSeguridad.PET_NAME, "Max");

    // Crear una transacción
    Transaccion transaccion = new Transaccion(
        LocalDate.of(2024, 1, 1),
        LocalDate.of(2024, 1, 10),
        1000.0,
        TipoTransaccion.COMPRA,
        new Empleado("Ana", "Martínez", "ana@gmail.com", "54321", "123456789", "anaM", "pass456", PreguntaSeguridad.BEST_FRIEND, "Sofía", 30),
        new Cliente("Juan", "Pérez", "juanperez@gmail.com", "987654321", "123456789", "juanp", "pass123", PreguntaSeguridad.PET_NAME, "Max"),
        new Camioneta("Marca", "XYZ789", 2020, 4, 100.0, 3000.0, TipoRegistro.ALQUILER, Transmision.MANUAL, Estado.USADO, 50, 2, true, true, false, 200.0, true, 3, true, true, true, true, Combustible.DIESEL, 700.0, 3.0, true, false)
    );

    // Agregar la transacción
    cliente.agregarTransaccion(transaccion);

    // Verificar que la transacción se haya agregado
    assertEquals(1, cliente.getTransacciones().size());
    assertEquals(transaccion, cliente.getTransacciones().get(0));

    LOG.info("Finalizando test de agregarTransaccion() de Cliente");
}

@Test
public void testAgregarVariasTransacciones() {
    LOG.info("Iniciando test de agregar varias transacciones de Cliente");

    Cliente cliente = new Cliente("Juan", "Pérez", "juanperez@gmail.com", "987654321", "123456789", "juanp", "pass123", PreguntaSeguridad.PET_NAME, "Max");

    // Crear transacciones
    Transaccion transaccion1 = new Transaccion(
        LocalDate.of(2024, 1, 1),
        LocalDate.of(2024, 1, 10),
        1000.0,
        TipoTransaccion.COMPRA,
        new Empleado("Ana", "Martínez", "ana@gmail.com", "54321", "123456789", "anaM", "pass456", PreguntaSeguridad.BEST_FRIEND, "Sofía", 30),
        new Cliente("Juan", "Pérez", "juanperez@gmail.com", "987654321", "123456789", "juanp", "pass123", PreguntaSeguridad.PET_NAME, "Max"),
        new Camioneta("Marca", "XYZ789", 2020, 4, 100.0, 3000.0, TipoRegistro.ALQUILER, Transmision.MANUAL, Estado.USADO, 50, 2, true, true, false, 200.0, true, 3, true, true, true, true, Combustible.DIESEL, 700.0, 3.0, true, false)
    );
    Transaccion transaccion2 = new Transaccion(
        LocalDate.of(2024, 2, 1),
        LocalDate.of(2024, 2, 10),
        1500.0,
        TipoTransaccion.ALQUILER,
        new Empleado("Carlos", "López", "carlos@gmail.com", "54322", "987654321", "carlosL", "pass789", PreguntaSeguridad.BEST_FRIEND, "Juan", 35),
        new Cliente("Juan", "Pérez", "juanperez@gmail.com", "987654321", "123456789", "juanp", "pass123", PreguntaSeguridad.PET_NAME, "Max"),
        new Camioneta("Marca", "ABC123", 2021, 4, 120.0, 4000.0, TipoRegistro.ALQUILER, Transmision.AUTOMATICA, Estado.NUEVO, 100, 1, true, true, false, 300.0, true, 4, true, true, true, true, Combustible.ELECTRICO, 600.0, 3.5, true, false)
    );

    // Agregar transacciones
    cliente.agregarTransaccion(transaccion1);
    cliente.agregarTransaccion(transaccion2);

    // Verificar que ambas transacciones se hayan agregado
    assertEquals(2, cliente.getTransacciones().size());
    assertEquals(transaccion1, cliente.getTransacciones().get(0));
    assertEquals(transaccion2, cliente.getTransacciones().get(1));

    LOG.info("Finalizando test de agregar varias transacciones de Cliente");
}




}