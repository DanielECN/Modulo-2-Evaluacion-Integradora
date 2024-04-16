package cl.billeteraVirtualBootcamp.clases;

/**
 * Esta subclase MonedaEnDolar se extiende de Moneda por lo que pasa a ser su hija, ya que su padre es abstracto, esta de igual manera
 * tiene que implementar el mismo metodo abstracto de lo contrario daria error, de esta manera se crea el Override que tiene
 * el metodo, con la diferencia que ahora puede tener cuerpo {} y por ende puede tener logica de igual manera
 */
public class MonedaEnDolar extends Moneda{
    /**
     *Esta sera mi constante VALOR_DOLAR (que es lo que vale el dolar actualmente en pesos chilenos).
     * esta constante sera static (cualquier clase puede acceder a ella)y tambien sera final (que no se puede modificar desde afuera por que sera su valor final).
     * Luego creo mi variable dineroEnDolares para poder trabajarla
     */
    public static double VALOR_DOLAR = 976;
    double dineroEnDolares;
    /**
     * verificarDatos verificara el dinero que entrara para poder leerlo y dividirlo por el VALOR_DOLAR para que me entrege
     * la informacion del dinero en dolares que entrara a la cuenta.
     *
     * @param dinero sera el dinero o saldo que entre a la cuenta para que luego pueda hacer la conversion y transformarlo a
     *        la moneda que quiero en especifico en este caso en dolares
     *
     * @return para que finalmente me pueda retornar el dineroEnDolares que es la moneda a la que queria convertir mi dinero o saldo
     * que entrara por la cuenta.
     */
    @Override
    protected double verificarDatos(double dinero) {
            this.dineroEnDolares = dinero/VALOR_DOLAR;
            return dineroEnDolares;
    }
}
