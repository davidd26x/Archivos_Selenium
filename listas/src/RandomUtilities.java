import java.util.Random;

public class RandomUtilities {
    static int generarRandomInt(int min, int max, Random random) {
        return random.nextInt(max - min) + min;
    }

    static double generarRandomDouble(int min, int max, Random random) {
        return (max - min) * random.nextDouble() + min;
    }

    static int[] generarRandomArrayInt(int n, int min, int max, Random random) {
        final var array = new int[n];

        for (var i = 0; i < n; i++) {
            array[i] = generarRandomInt(min, max, random);
        }
        return array;
    }


    static double[] generarRandomArrayDouble(int n, int min, int max, Random random) {
        final var array = new double[n];

        for (var i = 0; i < n; i++) {
            array[i] = generarRandomDouble(min, max, random);
        }
        return array;
    }
}
