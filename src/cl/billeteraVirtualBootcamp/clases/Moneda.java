package cl.billeteraVirtualBootcamp.clases;

/**
 * Creo mi super clase Moneda, para hacerla abstracta le agrego la palabra abstract,  esta clase tiene que por lo menos
 * haber un metodo que lo compartan otras clases, entonces a partir de aqui puedo empezar a crear mis otras subclases
 * que en este caso serian MonedaEnDolar y MonedaEnEuro que se extenderan de esta Moneda y lo que compartiran es que si o si
 * se verificaran los fondos de estas, en este caso el metodo abstracto verificarDatos.
 */
public abstract class Moneda {
    protected abstract double verificarDatos(double dinero);

}
