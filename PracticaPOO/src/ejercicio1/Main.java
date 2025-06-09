package ejercicio1;

public class Main {
    public static void main(String[] args) {
        final var producto1 = new Producto("SALMON", 15.42, 35, 2.832, true, 4.606);

        final var producto2 = new Producto("JITOMATE", 11.98, 84, 3.310, false, 9.915);

        System.out.printf("Producto 1: %s%n", producto1);
        System.out.printf("Producto 2: %s%n", producto2);
    }
}
