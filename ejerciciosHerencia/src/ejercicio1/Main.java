package ejercicio1;

import ejercicio1.parser.AbogadoParser;
import ejercicio1.parser.DentistaParser;
import ejercicio1.parser.IngenieroParser;
import utilities.FileManager;
import utilities.RandomUtilities;

import java.io.File;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        final var listaInputIngeniero =
                FileManager.leerFile(new File("src/ejercicio1/input/ingenieros.csv"));

        final var listaInputAbogado =
                FileManager.leerFile(new File("src/ejercicio1/input/abogados.csv"));

        final var listaInputDentista =
                FileManager.leerFile(new File("src/ejercicio1/input/dentistas.csv"));

        final var listaIngenieros = IngenieroParser.generarListaIngeniero(listaInputIngeniero);
        final var listaAbogados = AbogadoParser.generarListaAbogado(listaInputAbogado);
        final var listaDentista = DentistaParser.generarListaDentista(listaInputDentista);

        final var random = new Random();
        final var randomIndexIngeniero = RandomUtilities
                .generarRandomInt(0, listaIngenieros.size() - 1, random);
        final var randomIndexAbogado = RandomUtilities
                .generarRandomInt(0, listaAbogados.size() - 1, random);
        final var randomIndexDentista = RandomUtilities
                .generarRandomInt(0, listaDentista.size() - 1, random);

        System.out.printf("Random ingeniero: %s%n", listaIngenieros.get(randomIndexIngeniero));
        System.out.printf("Random abogado: %s%n", listaAbogados.get(randomIndexAbogado));
        System.out.printf("Random dentista: %s%n", listaDentista.get(randomIndexDentista));

    }
}
