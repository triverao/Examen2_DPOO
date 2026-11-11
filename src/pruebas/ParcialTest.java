package pruebas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import logica.EcuacionNoCuadraticaException;
import logica.Parcial;
import logica.RaicesComplejasException;

public class ParcialTest {

    private Parcial parcial;

    @BeforeEach
    void setUp() {
        parcial = new Parcial();
    }

    @Test
    void testDosRaices() throws Exception {
        assertEquals("x=3.0, x=2.0", parcial.calcularRaices(1, -5, 6));
    }

    @Test
    void testRaizDoble() throws Exception {
        assertEquals("x=-1.0, x=-1.0", parcial.calcularRaices(1, 2, 1));
    }

    @Test
    void testANoPuedeSerCero() {
        assertThrows(EcuacionNoCuadraticaException.class, () -> parcial.calcularRaices(0, 2, 1));
    }

    @Test
    void testRaicesComplejas() {
        assertThrows(RaicesComplejasException.class, () -> parcial.calcularRaices(1, 0, 1));
    }
}