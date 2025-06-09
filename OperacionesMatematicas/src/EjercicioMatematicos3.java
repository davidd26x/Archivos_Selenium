import java.util.Random;

public class EjercicioMatematicos3 {
    public static void main(String[] args) {
        final var min = 5;
        final var max = 100;

        final var random = new Random();

        final var cateto1 = (max - min) * random.nextDouble() + min;
        final var cateto2 = (max - min) * random.nextDouble() + min;

        final var hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));

        System.out.printf("Para los catetos %.3f & %.3f%ntenemos una hipotenusa de %.3f", cateto1, cateto2, hipotenusa);
    }
}
