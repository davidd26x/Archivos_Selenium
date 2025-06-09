package ejercicio1.parser;

import ejercicio1.models.Ingeniero;

import java.util.ArrayList;
import java.util.List;

public class IngenieroParser {
    //lista input que viene del file leído
    public static List<Ingeniero> generarListaIngeniero(List<String> listaInput){
        final var listaIngeniero = new ArrayList<Ingeniero>();

        for (var data : listaInput){
            listaIngeniero.add(parsearIngeniero(data));
        }

        return listaIngeniero;
    }

    private static Ingeniero parsearIngeniero(String data){
        final var arrayString = data.split(",");

        final var nombre = arrayString[0];
        final var apellido = arrayString[1];
        final var edad = Integer.parseInt(arrayString[2]);
        final var casado = Boolean.parseBoolean(arrayString[3]);
        final var constructora = arrayString[4];
        final var edificiosConstruidos = Integer.parseInt(arrayString[5]);
        final var edificiosPlanificados = Integer.parseInt(arrayString[6]);

        return new Ingeniero(nombre, apellido, edad, casado, constructora, edificiosConstruidos, edificiosPlanificados);
    }
}
