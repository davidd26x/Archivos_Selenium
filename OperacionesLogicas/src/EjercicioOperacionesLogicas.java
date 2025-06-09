import java.util.Random;

public class EjercicioOperacionesLogicas {
    public static void main(String[] args) {
        final var numero = RandomUtilities.generarRandomInt(10, 200, new Random());

        System.out.printf("El número %d es par y mayor que 50? %b%n", numero, preguntarCondiciones1(numero));
        System.out.printf("El número %d es múltiplo de 3 o menor o igual que 35? %b%n", numero, preguntarCondiciones2(numero));
    }

    static boolean preguntarCondiciones1(int numero) {
        return (numero % 2 == 0) && (numero > 50);
    }

    static boolean preguntarCondiciones2(int numero) {
        return (numero % 3 == 0) || (numero <= 35);
    }
}
