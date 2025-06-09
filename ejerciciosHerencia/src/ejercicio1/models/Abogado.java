package ejercicio1.models;

public class Abogado extends Persona{
    private final String notaria;
    private final int juiciosGanados;
    private final int juiciosAsistidos;

    public Abogado(String nombre, String apellido, int edad, boolean casado,
                   String notaria, int juiciosGanados, int juiciosAsistidos) {
        super(nombre, apellido, edad, casado);
        this.notaria = notaria;
        this.juiciosGanados = juiciosGanados;
        this.juiciosAsistidos = juiciosAsistidos;
    }

    @Override
    public String toString() {
        final var multilinea = """
                {
                    nombre: %s
                    apellido: %s
                    edad: %d
                    casado: %b
                    juicios ganados: %d
                    juicios asistidos: %d
                }
                """;

        return String.format(
                multilinea,
                nombre,
                apellido,
                edad,
                casado,
                juiciosGanados,
                juiciosAsistidos
        );
    }
}
