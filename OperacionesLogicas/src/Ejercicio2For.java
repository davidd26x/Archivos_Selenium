import java.util.Random;

public class Ejercicio2For {
    public static void main(String[] args) {
        final var n = RandomUtilities.generarRandomInt(15, 100, new Random());

        final var contador1 = contarValores(n);
        final var contador2 = contarValores2(n);
        final var contador3 = contarValores3(n);

        System.out.printf("1er contador: %d%n", contador1);
        System.out.printf("2do contador: %d%n", contador2);
        System.out.printf("3er contador: %d%n", contador3);
    }

    /*
     secuencia: 1, 2, ..., n -1
     filtro: pares
     accion: contar
    */
    static int contarValores(int n) {
        var contador = 0;

        for (var i = 1; i < n; i++) {
            if (i % 2 == 0) {
                contador++;
            }
        }
        return contador;
    }

    /*
    secuencia: 1, 2, ..., n - 1, n
    filtro: multiplos de 3
    accion: contar
    */
    static int contarValores2(int n) {
        var contador = 0;
        for (var i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                contador++;
            }
        }
        return contador;
    }

    /*
    secuencia: 1, 2, ..., n - 1, n
    filtro: terminen en 0
    accion: contar
    */

    static int contarValores3(int n) {
        var contador = 0;
        for (var i = 1; i <= n; i++) {
            if (i % 10 == 0) {
                contador++;
            }
        }
        return contador;
    }
}
