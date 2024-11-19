/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class TransaccionTest {
    private static final Logger LOG = Logger.getLogger(TransaccionTest.class.getName());

    @Test
    public void testTransaccionConstructor() {
        LOG.info("Iniciando test de constructor de Transaccion");

        // Crear cliente
        Cliente cliente = new Cliente("Juan", "Pérez", "juanperez@gmail.com", "987654321", "123456789", "juanp", "pass123", PreguntaSeguridad.PET_NAME, "Max");
        
        // Crear empleado
        Empleado empleado = new Empleado("Ana", "Martínez", "ana@gmail.com", "54321", "123456789", "anaM", "pass456", PreguntaSeguridad.BEST_FRIEND, "Sofía", 30);

        // Crear la transacción
        Transaccion transaccion = new Transaccion(
            LocalDate.of(2024, 1, 1),
            LocalDate.of(2024, 1, 10),
            1000.0,
            TipoTransaccion.COMPRA,
            empleado,
            cliente,
            new Camioneta("Marca", "XYZ789", 2020, 4, 100.0, 3000.0, TipoRegistro.ALQUILER, Transmision.MANUAL, Estado.USADO, 50, 2, true, true, false, 200.0, true, 3, true, true, true, true, Combustible.DIESEL, 700.0, 3.0, true, false)
        );

        // Verificar que los valores del objeto transacción sean correctos
        assertEquals(LocalDate.of(2024, 1, 1), transaccion.getfechaEntrega());
        assertEquals(LocalDate.of(2024, 1, 10), transaccion.getfechaEntregaDevolucion());
        assertEquals(1000.0, transaccion.getPrecio(), 0.01);
        assertEquals(TipoTransaccion.COMPRA, transaccion.getTipoTransaccion());
        assertEquals(cliente, transaccion.getCliente());
        assertEquals(empleado, transaccion.getEmpleado());

        LOG.info("Finalizando test de constructor de Transaccion");
    }

    @Test
    public void testTransaccionCambioDeValor() {
        LOG.info("Iniciando test de cambio de valor de Transaccion");

        // Crear cliente
        Cliente cliente = new Cliente("Juan", "Pérez", "juanperez@gmail.com", "987654321", "123456789", "juanp", "pass123", PreguntaSeguridad.PET_NAME, "Max");
        
        // Crear empleado
        Empleado empleado = new Empleado("Carlos", "Gómez", "carlos@gmail.com", "12345", "987654321", "carlosG", "pass789", PreguntaSeguridad.BEST_FRIEND, "Pedro", 40);

        // Crear la transacción inicial
        Transaccion transaccion = new Transaccion(
            LocalDate.of(2024, 2, 1),
            LocalDate.of(2024, 2, 10),
            1500.0,
            TipoTransaccion.ALQUILER,
            empleado,
            cliente,
            new Camioneta("Marca", "ABC123", 2021, 4, 120.0, 4000.0, TipoRegistro.ALQUILER, Transmision.AUTOMATICA, Estado.NUEVO, 100, 1, true, true, false, 300.0, true, 4, true, true, true, true, Combustible.ELECTRICO, 600.0, 3.5, true, false)
        );

        // Verificar el valor inicial
        assertEquals(1500.0, transaccion.getPrecio(), 0.01);

        // Cambiar el valor de la transacción
        transaccion.setPrecio(2000.0);

        // Verificar que el valor ha cambiado correctamente
        assertEquals(2000.0, transaccion.getPrecio(), 0.01);

        LOG.info("Finalizando test de cambio de valor de Transaccion");
    }

    @Test
    public void testTransaccionTipoTransaccion() {
        LOG.info("Iniciando test de tipo de transacción en Transaccion");

        // Crear cliente
        Cliente cliente = new Cliente("Carlos", "Hernández", "carloshernandez@gmail.com", "567890123", "987654321", "carlosH", "pass123", PreguntaSeguridad.PET_NAME, "Rex");
        
        // Crear empleado
        Empleado empleado = new Empleado("Elena", "Jiménez", "elena@gmail.com", "67890", "123456789", "elenaJ", "pass456", PreguntaSeguridad.BEST_FRIEND, "Laura", 33);

        // Crear la transacción de tipo ALQUILER
        Transaccion transaccion = new Transaccion(
            LocalDate.of(2024, 3, 1),
            LocalDate.of(2024, 3, 10),
            2000.0,
            TipoTransaccion.ALQUILER,
            empleado,
            cliente,
            new Camioneta("Marca", "LMN456", 2022, 4, 140.0, 5000.0, TipoRegistro.ALQUILER, Transmision.AUTOMATICA, Estado.NUEVO, 120, 1, true, true, false, 400.0, true, 5, true, true, true, true, Combustible.HIBRIDO, 800.0, 4.0, true, false)
        );

        // Verificar el tipo de transacción
        assertEquals(TipoTransaccion.ALQUILER, transaccion.getTipoTransaccion());

        // Cambiar el tipo de transacción
        transaccion.setTipoTransaccion(TipoTransaccion.COMPRA);

        // Verificar que el tipo ha cambiado correctamente
        assertEquals(TipoTransaccion.COMPRA, transaccion.getTipoTransaccion());

        LOG.info("Finalizando test de tipo de transacción en Transaccion");
    }
}
