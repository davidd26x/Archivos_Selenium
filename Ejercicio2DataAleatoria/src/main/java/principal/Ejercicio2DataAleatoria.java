package principal;

import com.github.javafaker.Faker;
import modelos.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio2DataAleatoria {
    public static void main(String[] args) {
        final var faker = new Faker();

        final var n = faker.number().numberBetween(20, 50);
        final var listaUsuario = crearListaUsuario(n);

        System.out.printf("La lista de tamaño %d de usuarios es: %s%n", n, listaUsuario);
    }

    private static List<Usuario> crearListaUsuario(int n) {
        final var listaUsuario = new ArrayList<Usuario>();

        for (var i = 0; i < n; i++) {
            listaUsuario.add(new Usuario());
        }

        return listaUsuario;
    }
}
