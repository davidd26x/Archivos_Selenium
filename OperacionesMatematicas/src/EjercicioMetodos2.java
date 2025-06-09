import java.util.Random;

public class EjercicioMetodos2 {
    public static void main(String[] args) {
        final var random = new Random();

        final var velocidadInicial = RandomUtilities.generarRandomDouble(10, 30, random);
        final var aceleracion = RandomUtilities.generarRandomDouble(2, 5, random);
        final var tiempo = RandomUtilities.generarRandomInt(3, 5, random);

        final var velocidadFinal = calcularVelocidadFinal(velocidadInicial, aceleracion, tiempo);
        imprimirResultados(velocidadInicial, aceleracion, tiempo, velocidadFinal);
    }

    static double calcularVelocidadFinal(double velocidadInicial, double aceleracion, int tiempo) {
        return velocidadInicial + aceleracion * tiempo;
    }

    static void imprimirResultados(double velocidadInicial, double aceleracion, int tiempo, double velocidadFinal) {
        System.out.printf("Para una velocidad inicial de %.3f, aceleración de %.3f y tiempo de %d, se obtiene una velocidad final de %.3f", velocidadInicial, aceleracion, tiempo, velocidadFinal);
    }
}
