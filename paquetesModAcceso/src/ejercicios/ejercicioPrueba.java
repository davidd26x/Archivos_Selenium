package ejercicios;

import utilities.RandomUtilities;

import java.util.Random;

public class ejercicioPrueba {
    public static void main(String[] args) {
        final var numeroAleatorio = generarNum();
        mostrarInfo(numeroAleatorio);
    }

    private static int generarNum() {
        return RandomUtilities.generarRandomInt(5, 10, new Random());
    }

    private static void mostrarInfo(int num) {
        System.out.printf("El número aleatorio es: %d%n", num);
    }
}
