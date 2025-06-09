import java.util.Random;

public class bucleFor {
    public static void main(String[] args) {
        final var n = RandomUtilities.generarRandomInt(5, 20, new Random());

        mostrarNumeros1(n);
        mostrarNumeros2(n);
        mostrarNumeros3(n);
    }

    //secuencia 1, 2, 3, ..., n - 1
    static void mostrarNumeros1(int n) {
        for (var i = 1; i < n; i++) {
            System.out.printf("%d ", i);
        }
        System.out.println(); //enter
    }

    //secuencia 1, 2, 3, ..., n - 1
    static void mostrarNumeros2(int n) {
        for (var i = 0; i <= n; i++) {
            System.out.printf("%d ", i);
        }
        System.out.println(); //enter
    }

    //secuencia n, n-1, n-2, ..., 1
    static void mostrarNumeros3(int n) {
        for (var i = n; i >= 1; i--) {
            System.out.printf("%d ", i);
        }
        System.out.println(); //enter
    }

}
