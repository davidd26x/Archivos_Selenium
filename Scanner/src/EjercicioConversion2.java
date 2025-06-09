public class EjercicioConversion2 {
    public static void main(String[] args) {
        final var cantidad1 = "22";
        final var cantidad2 = "5";
        final var cantidad3 = "111";

        final var suma = calcularSuma(cantidad1, cantidad2, cantidad3);
        imprimirSuma(suma);
    }

    static int calcularSuma(String cantidad1, String cantidad2, String cantidad3) {
        final var cantidad1Int = Integer.parseInt(cantidad1);
        final var cantidad2Int = Integer.parseInt(cantidad2);
        final var cantidad3Int = Integer.parseInt(cantidad3);

        return cantidad1Int + cantidad2Int + cantidad3Int;
    }

    static void imprimirSuma(int cantidadTotal) {
        System.out.printf("La cantidad total es %d", cantidadTotal);
    }
}
