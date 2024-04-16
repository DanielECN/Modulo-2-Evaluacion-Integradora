package cl.billeteraVirtualBootcamp.clases;
/**
 * Esta subclase MonedaEnEuro se extiende de Moneda por lo que pasa a ser su hija, ya que su padre es abstracto, esta de igual manera
 * tiene que implementar el mismo metodo abstracto de lo contrario daria error, de esta manera se crea el Override que tiene
 * el metodo, con la diferencia que ahora puede tener cuerpo {} y por ende puede tener logica de igual manera
 */
public class MonedaEnEuro extends Moneda{
    /**
     *Esta sera mi constante VALOR_EURO (que es lo que vale el euro actualmente en pesos chilenos),porque el valor siempre
     * se mantendra dentro de toda la aplicacion y la idea es que ese valor no cambiara. esta constante sera static (cualquiera puede acceder a ella)
     * y tambien sera final (que no se puede modificar desde afuera por que sera su valor final).
     * Luego creo mi variable dineroEnEuros para poder trabajarla
     */
    public static final double VALOR_EURO = 1063;
    double dineroEnEuros;

    /**
     * verificarDatos verificara el dinero que entrara para poder leerlo y dividirlo por el VALOR_EURO para que me entrege
     * la informacion del dinero en euros que entrara a la cuenta.
     *
     * @param dinero sera el dinero o saldo que entre a la cuenta para que luego pueda hacer la conversion y transformarlo a
     *        la moneda que quiero en especifico.
     *
     * @return para que finalmente me pueda retornar el dineroEnEuros que es la moneda a la que queria convertir mi dinero o saldo
     * que entrara por la cuenta.
     */
    @Override
    public double verificarDatos(double dinero) {
            this.dineroEnEuros = dinero/VALOR_EURO;
            return dineroEnEuros;
    }

}
