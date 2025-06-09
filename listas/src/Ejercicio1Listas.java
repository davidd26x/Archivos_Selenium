import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ejercicio1Listas {
    public static void main(String[] args) {
        final var listaAlto = new ArrayList<String>();
        final var listaMedio = new ArrayList<String>();
        final var listaBajo = new ArrayList<String>();


        final var arrayNombres = crearArrayNombres();
        final var arrayImc = crearArrayIMC();

        rellenarListasIMC(listaAlto, listaMedio, listaBajo, arrayNombres, arrayImc);

        System.out.printf("Lista alto: %s%n", listaAlto);
        System.out.printf("Lista medio: %s%n", listaMedio);
        System.out.printf("Lista bajo: %s%n", listaBajo);
    }

    static String[] crearArrayNombres() {
        return new String[]{"Carlos", "Antonio", "Jorge", "Ana", "Mayra", "Julieta", "Maria", "Rodrigo", "Anabelle", "Luz"};
    }

    static double[] crearArrayIMC() {
        return RandomUtilities.generarRandomArrayDouble(10, 1, 50, new Random());
    }

    static void rellenarListasIMC(
            List<String> listaAlto,
            List<String> listaMedio,
            List<String> listaBajo,
            String[] arrayNombres,
            double[] arrayIMC
    ) {
        final var n = arrayIMC.length;

        for (var i = 0; i < n; i++) {
            final var imc = arrayIMC[i];
            final var nombre = arrayNombres[i];

            if (imc >= 40) {
                listaAlto.add(nombre);
            } else if (imc >= 25) {
                listaMedio.add(nombre);
            } else {
                listaBajo.add(nombre);
            }
        }
    }
}
