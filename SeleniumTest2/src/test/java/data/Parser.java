package data;

import modelos.MensajeError;

import java.util.HashMap;
import java.util.Map;

public class Parser {
    public static Map<String, MensajeError> obtenerMapMensajeError(){
        final var map = new HashMap<String, MensajeError>();

        final var listaMensajeError = ExcelReader.leerMensajesErrorExcel();

        for(var mensajeError : listaMensajeError){
            map.put(mensajeError.getNombre(), mensajeError);
        }

        return map;
    }
}
