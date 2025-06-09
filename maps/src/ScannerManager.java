import java.util.Scanner;

public class ScannerManager {

    static int leerInt(Scanner scanner, String mensaje) {
        System.out.printf("%s: ", mensaje);
        return scanner.nextInt();
    }

    static double leerDouble(Scanner scanner, String mensaje) {
        System.out.printf("%s: ", mensaje);
        return scanner.nextDouble();
    }

    static String leerString(Scanner scanner, String mensaje) {
        System.out.printf("%s: ", mensaje);
        return scanner.nextLine();
    }

    static char leerChar(Scanner scanner, String mensaje) {
        System.out.printf("%s: ", mensaje);
        return scanner.next().charAt(0);
    }
}
