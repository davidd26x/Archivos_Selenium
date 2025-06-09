package ejercicio1;

import ejercicio1.modelos.Producto;
import ejercicio1.parser.ProductosParser;
import utilities.FileManager;

import java.io.File;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        final var fileInput = new File("src/ejercicio1/input/productos.csv");
        final var listaInput = FileManager.leerFile(fileInput);

        final var arrayProductos = ProductosParser.obtenerArrayProducto(listaInput);
        ordenarArrayProducto(arrayProductos);

        System.out.printf("Array ordenado: %s%n", Arrays.toString(arrayProductos));
    }

    private static void ordenarArrayProducto(Producto[] array) {
        final var n = array.length;

        for (var i = 0; i < n; i++) {
            for (var j = 0; j < n - i - 1; j++) {
                if (array[j].getPrecio() > array[j + 1].getPrecio()) {
                    final var temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
