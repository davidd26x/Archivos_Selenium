import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var n = ScannerManager.leerInt(scanner, "Ingrese cantidad de números serie de Fibonacci");
        scanner.close();

        mostrarSerieFibonacci(n);

    }

    static void mostrarSerieFibonacci(int n) {
        var anterior = 0;
        var actual = 1;

        System.out.printf("%d %d ", anterior, actual);

        //Mostrando los siguientes
        for (var i = 0; i < n; i++) {
            final var temp = anterior + actual;
            anterior = actual;
            actual = temp;
            System.out.printf("%d ", actual);
        }
    }
}
