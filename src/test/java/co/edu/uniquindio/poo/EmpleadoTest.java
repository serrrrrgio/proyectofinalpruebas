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
public class EmpleadoTest {
    private static final Logger LOG = Logger.getLogger(EmpleadoTest.class.getName());

    @Test
public void testAgregarTransaccionEmpleado() {
    LOG.info("Iniciando test de agregarTransaccion() de Empleado");

    Empleado empleado = new Empleado("Ana", "González", "ana@gmail.com", "123456789", "987654321", "ana123", "pass123", PreguntaSeguridad.PET_NAME, "Tommy", 3000.0);

    // Crear una transacción
    Transaccion transaccion = new Transaccion(
        LocalDate.of(2024, 1, 1),
        LocalDate.of(2024, 1, 10),
        1000.0,
        TipoTransaccion.COMPRA,
        new Empleado("Carlos", "López", "carlos@gmail.com", "54321", "987654321", "carlosL", "pass456", PreguntaSeguridad.BEST_FRIEND, "Juan", 3500.0),
        new Cliente("Juan", "Pérez", "juanperez@gmail.com", "987654321", "123456789", "juanp", "pass123", PreguntaSeguridad.PET_NAME, "Max"),
        new Camioneta("Marca", "XYZ789", 2020, 4, 100.0, 3000.0, TipoRegistro.ALQUILER, Transmision.MANUAL, Estado.USADO, 50, 2, true, true, false, 200.0, true, 3, true, true, true, true, Combustible.DIESEL, 700.0, 3.0, true, false)
    );

    // Agregar la transacción
    empleado.agregarTransaccion(transaccion);

    // Verificar que la transacción se haya agregado
    assertEquals(1, empleado.getTransacciones().size());
    assertEquals(transaccion, empleado.getTransacciones().get(0));

    LOG.info("Finalizando test de agregarTransaccion() de Empleado");
}
@Test
public void testObtenerSalarioCadena() {
    LOG.info("Iniciando test de obtenerSalarioCadena() de Empleado");

    Empleado empleado = new Empleado("Ana", "González", "ana@gmail.com", "123456789", "987654321", "ana123", "pass123", PreguntaSeguridad.PET_NAME, "Tommy", 3000.0);

    // Verificar que el salario se devuelve como cadena
    String salarioCadena = empleado.obtenerSalarioCadena();
    assertEquals("3000.0", salarioCadena);

    LOG.info("Finalizando test de obtenerSalarioCadena() de Empleado");
}



}