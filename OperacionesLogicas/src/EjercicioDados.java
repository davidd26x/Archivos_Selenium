import java.util.Random;
import java.util.Scanner;

public class EjercicioDados {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var numeroPlayer = ScannerManager.leerInt(scanner, "Escriba un número entre 1 y 6");
        scanner.close();

        if (validarNumero(numeroPlayer)) {
            final var numeroAleatorio = RandomUtilities.generarRandomInt(1, 6, new Random());
            mostrarMensajeGanador(numeroPlayer, numeroAleatorio);
        } else {
            System.out.printf("Número inválido, inténtalo de nuevo");
        }
    }

    static boolean validarNumero(int numeroPlayer) {
        return (numeroPlayer >= 1) && (numeroPlayer <= 6);
    }

    static void mostrarMensajeGanador(int numeroPlayer, int numeroAleatorio) {
        System.out.printf("El número aleatorio es: %d%n", numeroAleatorio);

        if (numeroPlayer == numeroAleatorio) {
            System.out.println("Ganaste");
            System.out.printf("El número del jugador: %d es el mismo que el número aleatorio: %d", numeroPlayer, numeroAleatorio);
        } else {
            System.out.println("Perdiste");
        }
    }
}
