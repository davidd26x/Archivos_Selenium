package principal;

import modelos.Videojuego;
import reader.ExcelReader;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args) {
        final var listaTotal = ExcelReader.obtenerListaVideojuego();
        final var listaMayor50 = filtrarDuracion(listaTotal);

        System.out.printf("La lista es: %s%n", listaMayor50);
    }

    private static List<Videojuego> filtrarDuracion(List<Videojuego> listaTotalVideojuego){
        final var listaMayores50 = new ArrayList<Videojuego>();

        for (var videojuego : listaTotalVideojuego) {
            if (videojuego.getDuracion() > 50){
                listaMayores50.add(videojuego);
            }
        }
        
        return listaMayores50;
    }
}
