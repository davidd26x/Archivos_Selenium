import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        final var arrayAleatorio = RandomUtilities.generarRandomArrayInt(5, 10, 100, new Random());

        final var scanner = new Scanner(System.in);

        int indexLeido;

        do {
            mostrarArray(arrayAleatorio);
            indexLeido = ScannerManager.leerInt(scanner, "Ingrese el index deseado");

            if (indexLeido != -1) {
                mostrarElemento(indexLeido, arrayAleatorio);
            }
        } while (indexLeido != -1);


        scanner.close();
    }

    static void mostrarElemento(int i, int[] array) {
        System.out.printf("El elemento con el index %s es %d%n", i, array[i]);
    }

    static void mostrarArray(int[] array) {
        System.out.printf("El array es: %s%n", Arrays.toString(array));
    }
}
