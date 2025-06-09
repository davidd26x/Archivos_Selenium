public class EjercicioMatematicos2 {
    public static void main(String[] args) {
        var aceleracion = 100.5032;
        var masa = 76.1265;
        final var fuerza = masa * aceleracion;

        System.out.printf("Para una masa de %.4f y aceleración de %.4f tenemos una fuerza de %.4f", masa, aceleracion, fuerza);
    }
}
