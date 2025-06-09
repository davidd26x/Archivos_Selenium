package ejercicio1;

public class Vector2D {
    private final String nombre;
    private final double x;
    private final double y;
    private final double modulo;

    public Vector2D(String nombre, double x, double y) {
        this.nombre = nombre;
        this.x = x;
        this.y = y;
        this.modulo = calcularModulo();
    }

    private double calcularModulo() {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public static Vector2D calcularSumaVectores(String nombre, Vector2D vector1, Vector2D vector2) {
        final var x = vector1.x * vector2.x;
        final var y = vector1.y + vector2.y;

        return new Vector2D(nombre, x, y);
    }

    public String getNombre() {
        return nombre;
    }

    public double getModulo() {
        return modulo;
    }
}
