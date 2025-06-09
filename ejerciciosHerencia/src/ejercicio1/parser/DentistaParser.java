package ejercicio1.parser;

import ejercicio1.models.Dentista;

import java.util.ArrayList;
import java.util.List;


public class DentistaParser {
    //lista input que viene del file leído
    public static List<Dentista> generarListaDentista(List<String> listaInput){
        final var listaDentista = new ArrayList<Dentista>();

        for (var data : listaInput){
            listaDentista.add(parsearDentista(data));
        }

        return listaDentista;
    }

    private static Dentista parsearDentista(String data){
        final var arrayString = data.split(",");

        final var nombre = arrayString[0];
        final var apellido = arrayString[1];
        final var edad = Integer.parseInt(arrayString[2]);
        final var casado = Boolean.parseBoolean(arrayString[3]);
        final var centroDental = arrayString[4];
        final var pacientesFelices = Integer.parseInt(arrayString[5]);
        final var pacientesTotales = Integer.parseInt(arrayString[6]);

        return new Dentista(nombre, apellido, edad, casado, centroDental, pacientesFelices, pacientesTotales);
    }
}
