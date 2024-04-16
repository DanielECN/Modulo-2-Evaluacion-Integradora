package cl.billeteraVirtualBootcamp.clases;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * Se configura el test con BeforeEach de la clase Cuenta, para que se ejecute antes de cada prueba.
 */

class CuentaTest {

    Cuenta CuentaTest;

    @BeforeEach
    public void configuration() {
        CuentaTest = new Cuenta();

    }

    /**
     * 1) Metodo de prueba para crear una cuenta cliente por consola, verifico que el metodo crea un objeto
     * tipo Cuenta con los valores que se esperan que serian numeroCuenta, titularCuenta y saldoCuenta.
     */

    @Test
    void crearCuentaClientePorConsola() {
        Cuenta Cuenta = new Cuenta(1, "Juan", 1000);

        assertEquals(1, Cuenta.getNumeroCuenta());
        assertEquals("Juan", Cuenta.getTitularCuenta());
        assertEquals(1000, Cuenta.getSaldoCuenta());
    }
}