public class Main {
    public static void main(String[] args) {
        final var num1 = Integer.parseInt(args[0]);
        final var num2 = Integer.parseInt(args[1]);

        final var producto = num1 * num2;

        System.out.printf("El producto es: %d%n", producto);
    }
}
