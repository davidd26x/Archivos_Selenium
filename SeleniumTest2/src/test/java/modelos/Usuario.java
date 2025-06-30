package modelos;

import com.github.javafaker.Faker;

public class Usuario {
    private final String name;
    private final String lastname;
    private final String zipcode;

    public Usuario() {
        final var faker = new Faker();
        name = faker.name().firstName();
        lastname = faker.name().lastName();
        zipcode = faker.address().zipCode();
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getZipcode() {
        return zipcode;
    }
}
