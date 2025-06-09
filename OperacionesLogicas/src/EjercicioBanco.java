import java.util.Scanner;

public class EjercicioBanco {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var montoInicial = ScannerManager.leerDouble(scanner, "Ingrese el monto inicial: ");
        scanner.close();

        imprimirResult(montoInicial, calcularMonto(montoInicial));
    }

    static double calcularMonto(double montoInicial) {
        final var aumento1 = (montoInicial % 2 == 0) ? montoInicial * 0.1 : 0; //Si es par se le aumenta 10%
        final var aumento2 = (montoInicial % 3 == 0) ? 500 : 0; //Si es múltiplo de 3 se le aumenta 500
        final var aumento3 = (montoInicial > 500) ? 300 : 0; //Si es mayor a 500 se le aumenta 300

        return montoInicial + aumento1 + aumento2 + aumento3;
    }

    static void imprimirResult(double montoInicial, double montoFinal) {
        System.out.printf("Para el préstamo inicial de %.2f se le cobrará un monto final de %.2f%n", montoInicial, montoFinal);
    }
}
