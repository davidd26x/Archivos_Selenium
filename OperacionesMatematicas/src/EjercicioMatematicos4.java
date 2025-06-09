import java.util.Random;

public class EjercicioMatematicos4 {
    public static void main(String[] args) {
        //Valores para video 14
        final var min = 20;
        final var max = 100;
        final var random = new Random();


        final var radio = random.nextInt(max - min + 1) + min;

        final var area = Math.PI * Math.pow(radio, 2);
        final var perimetro = Math.PI * radio;

        System.out.printf("Para un radio %d se tiene un perímetro de %.3f y un área de %.3f", radio, perimetro, area);
    }
}
