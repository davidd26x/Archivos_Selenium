package ejercicio3;

public class Persona {
    private final String nombre;
    private final String apellido;
    private final int edad;
    private final double peso;
    private final boolean casado;
    private final Color color;
    private final Profesion profesion;

    public Persona(String nombre, String apellido, int edad, double peso,
                   boolean casado, Color color, Profesion profesion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.peso = peso;
        this.casado = casado;
        this.color = color;
        this.profesion = profesion;
    }

    @Override
    public String toString() {
        final var multilinea = """
                
                {
                nombre : %s
                apellido: %s
                edad: %d
                peso: %.2f
                casado: %b
                color: %s
                profesion: %s
                }
                """;

        return String.format(
                multilinea,
                nombre,
                apellido,
                edad,
                peso,
                casado,
                color,
                profesion
        );
    }

    public enum Profesion {
        INGENIERO,
        DENTISTA,
        ABOGADO
    }
}
