package ejercicio2.parser;

import ejercicio2.Videojuego;

import java.util.ArrayList;
import java.util.List;

public class VideojuegoParser {
    public static List<Videojuego> crearListaVideojuego(List<String> listaInput) {
        final var listaVideojuego = new ArrayList<Videojuego>();

        for (var elemento : listaInput) {
            listaVideojuego.add(parsearVideojuego(elemento));
        }
        return listaVideojuego;
    }

    private static Videojuego parsearVideojuego(String data) {
        final var arrayString = data.split(",");

        final var nombre = arrayString[0];
        final var epoca = Integer.parseInt(arrayString[1]);
        final var precio = Double.parseDouble(arrayString[2]);
        final var duracion = Integer.parseInt(arrayString[3]);
        final var genero = Videojuego.Genero.valueOf(arrayString[4]);
        final var empresa = Videojuego.Empresa.valueOf(arrayString[5]);

        return new Videojuego(nombre, epoca, precio, duracion, genero, empresa);
    }
}
