package ejercicio1.parser;

import ejercicio1.modelos.Producto;

import java.util.List;

public class ProductosParser {
    public static Producto[] obtenerArrayProducto(List<String> listaInput) {
        final var n = listaInput.size();
        final var arrayProductos = new Producto[n];

        for (var i = 0; i < n; i++) {
            arrayProductos[i] = parsearProducto(listaInput.get(i)); //Pasar de string a producto
        }

        return arrayProductos;
    }

    private static Producto parsearProducto(String data) {
        final var arrayString = data.split(",");

        final var nombre = arrayString[0];
        final var precio = Double.parseDouble(arrayString[1]);
        final var stock = Integer.parseInt(arrayString[2]);
        final var peso = Double.parseDouble(arrayString[3]);
        final var perecible = Boolean.parseBoolean(arrayString[4]);
        final var volumen = Double.parseDouble(arrayString[5]);

        return new Producto(nombre, precio, stock, peso, perecible, volumen);
    }
}
