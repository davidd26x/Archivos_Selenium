package ejercicio1.parser;

import ejercicio1.models.Abogado;

import java.util.ArrayList;
import java.util.List;

public class AbogadoParser {
    //lista input que viene del file leído
    public static List<Abogado> generarListaAbogado(List<String> listaInput){
        final var listaAbogado = new ArrayList<Abogado>();

        for (var data : listaInput){
            listaAbogado.add(parsearAbogado(data));
        }

        return listaAbogado;
    }

    private static Abogado parsearAbogado(String data){
        final var arrayString = data.split(",");

        final var nombre = arrayString[0];
        final var apellido = arrayString[1];
        final var edad = Integer.parseInt(arrayString[2]);
        final var casado = Boolean.parseBoolean(arrayString[3]);
        final var notaria = arrayString[4];
        final var juiciosGanados = Integer.parseInt(arrayString[5]);
        final var juiciosAsistidos = Integer.parseInt(arrayString[6]);

        return new Abogado(nombre, apellido, edad, casado, notaria, juiciosGanados, juiciosAsistidos);
    }
}
