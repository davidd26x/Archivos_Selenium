import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1Arrays {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);


        scanner.close();
    }

    static int[] calcularProductoEscalar(int[] array, int escalar) {
        final var n = array.length;
        final var nuevoArray = new int[n];

        for (var i = 0; i < n; i++) {
            nuevoArray[i] = array[i] * escalar;
        }

        return nuevoArray;
    }

    static void imprimirInformacion(int[] arrayOriginal, int[] arrayNuevo) {
        System.out.printf("El array original es: %s%n", Arrays.toString(arrayOriginal));
        System.out.printf("El array nuevo es: %s%n", Arrays.toString(arrayNuevo));
    }
}
