import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var n = ScannerManager.leerInt(scanner, "Ingrese un número");
        scanner.close();

        if (esPar(n)) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }

    }

    public static boolean esPar(int n) {
        return n % 2 == 0;
    }
}
