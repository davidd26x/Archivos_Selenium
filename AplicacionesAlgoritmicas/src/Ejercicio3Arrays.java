import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio3Arrays {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        final var tamArray = ScannerManager.leerInt(scanner, "Ingrese el tamano del array");
        final var min = ScannerManager.leerInt(scanner, "Ingrese el min");
        final var max = ScannerManager.leerInt(scanner, "Ingrese el max");


        scanner.close();

        final var random = new Random();
        final var array1 = RandomUtilities.generarRandomArrayDouble(tamArray, min, max, random);
        final var array2 = RandomUtilities.generarRandomArrayDouble(tamArray, min, max, random);

        final var promedioPonderado = calcularPromedioPonderado(array1, array2);

        imprimirInformacion(array1, array2, promedioPonderado);
    }

    static double calcularPromedioPonderado(double[] array1, double[] array2) {
        final var n = array1.length;
        var numerador = 0;

        for (var i = 0; i < n; i++) {
            numerador += array1[i] * array2[i];
        }


        return numerador / n;
    }


    static void imprimirInformacion(double[] array1, double[] array2, double promedioPonderado) {
        System.out.printf("Array 1: %s%n", Arrays.toString(array1));
        System.out.printf("Array 2: %s%n", Arrays.toString(array2));
        System.out.printf("Promedio ponderado:  %s%n", promedioPonderado);
    }
}
