import java.util.Scanner;

public class l4TrabajoLlenarUnVector {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Pedir al usuario el tamaño del vector
        System.out.print("Ingrese el tamaño N del vector: ");
        int N = teclado.nextInt();

        // Declarar el vector de tamaño
        int[] vector = new int[N];

        // Pedir al usuario que ingrese cada elemento del vector
        for (int i = 0; i < N; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            vector[i] = teclado.nextInt();
        }

        // Calcular la suma de todos los elementos
        int suma = 0;
        for (int i = 0; i < N; i++) {
            suma += vector[i];
        }

        // Mostrar el resultado
        System.out.println("La suma de todos los elementos es: " + suma);
    }
}
