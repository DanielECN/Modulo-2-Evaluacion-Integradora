/**
 * Importación de la clase Cliente y Cuenta que se encuentra dentro del paquete de clases.
 */
import cl.billeteraVirtualBootcamp.clases.Cliente;

/**
 * Clase main, la principal, sin esta clase no puede existir nuestro programa, esta ejecutara todo
 */
public class Main {
    /**
     * Nuestro metodo main, recomendable para cualquier proyecto java
     */
    public static void main(String[] args) {

        // crea el cliente desde la clase Cliente y muestra la informacion de la cuenta accediendo al getCuentaCliente().
        Cliente cliente = Cliente.crearClienteDesdeConsola();
        cliente.getCuentaCliente().mostrarInformacionCuentaCorriente();

        //llamo al metodo ingresar dinero para sumar dinero al saldo .
        cliente.getCuentaCliente().ingresarDinero();
        //y muestro nuevamente la informacion de la cuenta para ver si se agrego correctamente.
        cliente.getCuentaCliente().mostrarInformacionCuentaCorriente();

        //llamo al metodo para restar dinero al saldo.
        cliente.getCuentaCliente().restarDinero();
        //y muestro nuevamente la informacion de la cuenta para ver si se agrego correctamente.
        cliente.getCuentaCliente().mostrarInformacionCuentaCorriente();

    }
}