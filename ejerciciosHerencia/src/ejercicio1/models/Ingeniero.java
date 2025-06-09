package ejercicio1.models;

public class Ingeniero extends Persona{
    private final String constructora;
    private final int edificiosConstruidos;
    private final int edificiosPlanificados;

    public Ingeniero(String nombre, String apellido, int edad, boolean casado,
                     String constructora, int edificiosConstruidos, int edificiosPlanificados) {
        super(nombre, apellido, edad, casado);
        this.constructora = constructora;
        this.edificiosConstruidos = edificiosConstruidos;
        this.edificiosPlanificados = edificiosPlanificados;
    }

    @Override
    public String toString() {
        final var multilinea = """
                {
                    nombre: %s
                    apellido: %s
                    edad: %d
                    casado: %b
                    constructora: %s
                    edificios construidos: %d
                    edificios planificados: %d
                }
                """;

        return String.format(
                multilinea,
                nombre,
                apellido,
                edad,
                casado,
                constructora,
                edificiosConstruidos,
                edificiosPlanificados
        );
    }


}
