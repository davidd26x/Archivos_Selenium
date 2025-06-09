public class EjercicioConversion1 {
    public static void main(String[] args) {

        final var precio1 = "45.50";
        final var precio2 = "32.20";
        final var precio3 = "75.12";

        final var suma = calcularSuma(precio1, precio2, precio3);
        imprimirSuma(suma);
    }

    static double calcularSuma(String precio1, String precio2, String precio3) {
        final var precio1Double = Double.parseDouble(precio1);
        final var precio2Double = Double.parseDouble(precio2);
        final var precio3Double = Double.parseDouble(precio3);

        return precio1Double + precio2Double + precio3Double;
    }

    static void imprimirSuma(double precioTotal) {
        System.out.printf("El precio total es de %.2f", precioTotal);
    }
}
