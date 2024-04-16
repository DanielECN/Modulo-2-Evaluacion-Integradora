package cl.billeteraVirtualBootcamp.clases;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author Daniel Cerda, estudiante Bootcamp Desarrollo de aplicaciones móviles android trainee v2.0

 * Mi clase principal cuenta, de donde podre manipular los datos del titular(String),
 * numero de cuenta(int), saldo(double)
 */
public class Cuenta {

    /**
     * 1) ATRIBUTOS DE UNA CLASE
     * Atributos principales de mi clase que contiene las variables numeroCuenta, saldoCuenta y titularCuenta con sus
     * respectivos MODIFICADORES DE ACCESO(publico, privado, protegido) que en este caso seran todos private
     */

    private int numeroCuenta;
    private double saldoCuenta;
    private String titularCuenta;

    /**
     * 2) CONSTRUCTOR; en el fondo es un metodo, con la diferencia que se tiene que llamar igual a la clase,
     * se puede tener uno vacio que es por defecto y mas de uno que puede recibir parametros, en general n constructores
     * para asignarle el valor del atributo, lo hago con this.atributo = parametro;
     */
    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, String titular, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.titularCuenta = titular;
        this.saldoCuenta = saldo;
    }

    /**
     * 3) METODOS DE ACCESO; se utilizan por el famoso concepto de encapsulamiento, para poder encapsular los datos y
     * hacerlos mas privados, permite dar mayor seguridad restringiendo el acceso a diferentes atributos, metodos,
     * constructores asegurando que el usuario siga una ruta especifica para acceder a la información.
     */

    public static Cuenta CrearCuentaClientePorConsola(String nombreCliente) {
        Scanner scanner = new Scanner(System.in);
        int numeroCuenta;
        double saldoCuenta;

        System.out.println("Ingrese el numero de cuenta: ");
        numeroCuenta = scanner.nextInt();
        scanner.nextLine(); // va a la siguiente linea

        System.out.println("Ingrese el saldo de la cuenta: ");
        saldoCuenta = scanner.nextDouble();

        return new Cuenta(numeroCuenta, nombreCliente, saldoCuenta);

    }

    /**
     * Getters y setters (que son los metodos de acceso) de mi numero de cuenta, saldo de cuenta y titular de cuenta
     * para poder obtener y modificar los datos
     */
    public int getNumeroCuenta() {return numeroCuenta;}
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public double getSaldoCuenta() {return saldoCuenta;}
    public void setSaldoCuenta(double saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }
    public String getTitularCuenta() {
        return titularCuenta;
    }
    public void setTitularCuenta(String titularCuenta) {
        this.titularCuenta = titularCuenta;
    }

    /**
     * 4) Metodos de comportamiento
     */

    /**
     * Metodo de comportamiento para visualizar los datos de mi cuenta.
     * Se hace un string formatoSaldo y se llama la función formatearSaldo(saldoCuenta) para mostrar un numero mas legible.
     * Ademas agrego la conversión del saldo en Euros y Dolares sacado de la clase abstracta Moneda para verificar los datos
     * y lo llamo de las subclases MonedaEnEuro y MonedaEnDolar y para que los digitos sean mas legibles en esos valores  le agrego
     * el metodo de formatearSaldo al dineroEuro y dineroDolar
     */

    public void mostrarInformacionCuentaCorriente() {

        double dineroEuro;
        double dineroDolar;
        MonedaEnEuro monedaEnEuro = new MonedaEnEuro();
        dineroEuro = monedaEnEuro.verificarDatos(saldoCuenta);

        MonedaEnDolar monedaEnDolar = new MonedaEnDolar();
        dineroDolar = monedaEnDolar.verificarDatos(saldoCuenta);

        String formatoSaldo = formatearSaldo(saldoCuenta);

        System.out.println("-----------------------------------------------------------");
        System.out.println("Numero de cuenta: " + numeroCuenta);
        System.out.println("Titular de cuenta: " + titularCuenta);
        System.out.println("Saldo de cuenta: | $" + formatoSaldo + " clp" + "| €" + formatearSaldo(dineroEuro) + " euros " + " | $"+ formatearSaldo(dineroDolar) + " dolares |");
        System.out.println("-----------------------------------------------------------");

    }
    // AgregarSaldo
    /**
     * Metodo para sumar el saldo, donde le digo que si la cantidad es mayor a 0, al saldo le sume la cantidad
     * indicada por el usuario, si es menor a 0 enviara un mensaje(que debe ser mayor), la cantidad ingresada
     * tiene un formato para que sea mas legible el numero, luego mostrara el saldo actual y finalmente la informacion
     * completa de la cuenta actualizada con sus respectivos saldos en CLP, DOLAR y EURO, que el formato entregado tiene que ser
     * la cantidad indicada por el usuario dividido por el precio del dolar/euro para que lo muestre correctamente por pantalla.
     */
    public void ingresarDinero() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese cantidad dinero para agregar a su saldo: ");

        double cantidad = scanner.nextDouble();

        String formatoCantidad = formatearSaldo(cantidad);
        String formatoCantidadEuro = formatearSaldo(cantidad/MonedaEnEuro.VALOR_EURO);
        String formatoCantidadDolar = formatearSaldo(cantidad/MonedaEnDolar.VALOR_DOLAR);



        if (cantidad > 0) {
            saldoCuenta += cantidad;
            System.out.println("Se han ingresado $" + formatoCantidad + " clp" + "| €" + formatoCantidadEuro + " euros " + " | $"+ formatoCantidadDolar + " dolares | a la cuenta.");
            System.out.println("-----------------------------------------------------------");
            System.out.println("Mostrando informacion de la cuenta actualizada");
        } else {
            System.out.println("La cantidad a ingresar debe ser mayor que cero.");
        }
    }

    // RestarSaldo

    /**
     * Lo mismo que el metodo de sumar saldo, solo que ahora se le resta y muestra la informacion por pantalla
     */
    public void restarDinero() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese cantidad dinero para restar a su saldo: ");

        double restoDinero = scanner.nextDouble();

        String formatoCantidad = formatearSaldo(restoDinero);
        String formatoCantidadEuro = formatearSaldo(restoDinero/MonedaEnEuro.VALOR_EURO);
        String formatoCantidadDolar = formatearSaldo(restoDinero/MonedaEnDolar.VALOR_DOLAR);

        if (restoDinero > 0) {
            saldoCuenta -= restoDinero;
            System.out.println("Se han restado $" + formatoCantidad + " clp" + "| €" + formatoCantidadEuro + " euros " + " | $"+ formatoCantidadDolar + " dolares | a la cuenta.");
            System.out.println("-----------------------------------------------------------");
            System.out.println("Mostrando informacion de la cuenta actualizada");
        } else {
            System.out.println("La cantidad a ingresar debe ser mayor que cero.");
        }
    }
    /**
     * 5) OPCIONAL "Metodos  utilitarios de logica"
     * Metodo usado para mostrar el saldo en un numero o formato mas legible, seguira el patron #,### que
     * indica el numero y como quiero que lo muestre
     *
     * @return me retorna el saldo con su formato
     */
    private String formatearSaldo(double saldoCuenta) {
        DecimalFormat formatoSaldo = new DecimalFormat("#,###");

        return formatoSaldo.format(saldoCuenta);
    }
}
