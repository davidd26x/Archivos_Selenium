package modelos;

import com.github.javafaker.Faker;

public class Usuario {
    private final String nombreCompleto;
    private final int edad;
    private final double balance;
    private final String username;
    private final String password;

    public Usuario() {
        final var faker = new Faker();

        nombreCompleto = faker.name().fullName();
        edad = faker.number().numberBetween(20, 40);
        balance = faker.number().randomDouble(2, 1000, 10000);
        username = faker.name().username();
        password = faker.internet().password();
    }

    @Override
    public String toString() {
        final var multilinea = """
                {
                    nombre completo: %s
                    edad: %d
                    balance: %.2f
                    username: %s
                    password: %s
                }
                """;
        return String.format(
                multilinea,
                nombreCompleto,
                edad,
                balance,
                username,
                password
        );
    }
}
