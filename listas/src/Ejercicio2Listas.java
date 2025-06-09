import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ejercicio2Listas {
    public static void main(String[] args) {
        final var listaAlto = new ArrayList<String>();
        final var listaMedio = new ArrayList<String>();
        final var listaBajo = new ArrayList<String>();

        final var arrayNombres = crearArrayNombres();
        final var arrayNotas = crearArrayNotas();

        rellenarListasNotas(listaAlto, listaMedio, listaBajo, arrayNombres, arrayNotas);

        System.out.printf("Lista alto: %s%n", listaAlto);
        System.out.printf("Lista medio: %s%n", listaMedio);
        System.out.printf("Lista bajo: %s%n", listaBajo);
    }

    static String[] crearArrayNombres() {
        return new String[]{"Carlos", "Antonio", "Jorge", "Ana", "Mayra", "Julieta", "Maria", "Rodrigo", "Anabelle", "Luz"};
    }

    static int[] crearArrayNotas() {
        return RandomUtilities.generarRandomArrayInt(10, 1, 20, new Random());
    }

    static void rellenarListasNotas(
            List<String> listaAlto,
            List<String> listaMedio,
            List<String> listaBajo,
            String[] arrayNombres,
            int[] arrayNotas
    ) {
        final var n = arrayNotas.length;
        for (var i = 0; i < n; i++) {
            final var nota = arrayNotas[i];
            final var nombre = arrayNombres[i];

            if (nota >= 16) {
                listaAlto.add(nombre);
            } else if (nota > 10) {
                listaMedio.add(nombre);
            } else {
                listaBajo.add(nombre);
            }
        }
    }
}
