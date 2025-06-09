public class EjercicioMatematicos1 {
    public static void main(String[] args) {
        var velocidad_inicial = 15.24;
        var aceleracion = 3.75;
        var tiempo = 5;

        final var velocidad_final = velocidad_inicial + aceleracion * tiempo;

        System.out.printf("Para una velocidad inicial %.3f, una aceleración %.3f y un tiempo %d " +
                "se tiene una velocidad final de %.3f", velocidad_inicial, aceleracion, tiempo, velocidad_final);
    }
}
