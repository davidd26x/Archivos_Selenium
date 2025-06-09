import java.util.Random;

public class EjerciciosMetodos4 {
    public static void main(String[] args) {
        final var random = new Random();

        final var radio = RandomUtilities.generarRandomInt(10, 25, random);

        final var area = calcularArea(radio);
        final var perimetro = calcularPerimetro(radio);

        imprimirResultados(radio, area, perimetro);
    }

    static double calcularArea(int radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    static double calcularPerimetro(int radio) {
        return 2 * Math.PI * radio;
    }

    static void imprimirResultados(int radio, double area, double perimetro) {
        System.out.printf("Para un radio de %d, un área de %.3f, se obtiene un perímetro de %.3f", radio, area, perimetro);
    }
}
