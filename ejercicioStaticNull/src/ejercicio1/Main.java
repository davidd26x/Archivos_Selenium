package ejercicio1;

public class Main {
    public static void main(String[] args) {
        final var vector1 = new Vector2D("SATURNO", 35.13, 94.44);
        final var vector2 = new Vector2D("MARTE", 83.63, 58.60);

        //método static
        final var vectorSuma = Vector2D.calcularSumaVectores("TIERRA", vector1, vector2);

        System.out.printf("Nombre: %s, Módulo: %.2f%n", vector1.getNombre(), vector1.getModulo());
        System.out.printf("Nombre: %s, Módulo: %.2f%n", vector2.getNombre(), vector2.getModulo());
        System.out.printf("Nombre: %s, Módulo: %.2f%n", vectorSuma.getNombre(), vector2.getModulo());
    }

}
