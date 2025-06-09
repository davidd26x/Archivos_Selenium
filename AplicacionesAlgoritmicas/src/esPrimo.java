import java.util.Scanner;

public class esPrimo {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var n = ScannerManager.leerInt(scanner, "Ingrese número para verificar si es primo");

        scanner.close();

        final var esPrimo = esPrimo(n);
        System.out.printf("El número (%d) es primo? %b%n", n, esPrimo);
    }

    static boolean esPrimo(int n) {
        var i = 2;

        while (i < n) {
            if (n % i != 0) {
                i++;
            } else {
                return false;
            }
        }
        return true;
    }
}
