package ejercicio2;

import ejercicio2.modelos.Videojuego;
import ejercicio2.parser.VideojuegoParser;
import utilities.FileManager;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final var fileInput = new File("src/ejercicio2/input/videojuegos.csv");
        final var listaInput = FileManager.leerFile(fileInput);

        final var listaVideojuegos = VideojuegoParser.crearListaVideojuego(listaInput);
        final var listaXbox = filtrarListaXbox(listaVideojuegos);

        System.out.printf("La lista es: %s%n", listaXbox);
    }

    private static List<Videojuego> filtrarListaXbox(List<Videojuego> listaTotal) {
        final var listaXbox = new ArrayList<ejercicio2.Videojuego>();

        for (var videojuego : listaTotal) {
            if (videojuego.getEmpresa().equals(ejercicio2.Videojuego.Empresa.XBOX)) {
                listaXbox.add(videojuego);
            }
        }

        return listaXbox;
    }


}
