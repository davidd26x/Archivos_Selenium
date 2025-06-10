package modelos;

import com.github.javafaker.Faker;

public class Deportista {
    private final String nombre;
    private final String apellido;
    private final int edad;
    private final double velocidad;
    private final double estamina;
    private final double fuerza;
    private final String email;

    public Deportista() {
        final var faker = new Faker();

        nombre = faker.name().firstName();
        apellido = faker.name().lastName();
        edad = faker.number().numberBetween(20, 60);
        velocidad = faker.number().randomDouble(2, 20, 80);
        estamina = faker.number().randomDouble(2, 15, 50);
        fuerza = faker.number().randomDouble(2, 12, 60);
        email = faker.internet().emailAddress();
    }

    public String getNombre() {
        return nombre;
    }

    public double getVelocidad() {
        return velocidad;
    }

    @Override
    public String toString() {
        final var multilinea = """
                {
                    nombre: %s
                    apellido: %s
                    edad: %d
                    velocidad: %.2f
                    estamina: %.2f
                    fuerza: %.2f
                    email: %s
                }
                """;
        return String.format(
                multilinea,
                nombre,
                apellido,
                edad,
                velocidad,
                estamina,
                fuerza,
                email
        );
    }
}
