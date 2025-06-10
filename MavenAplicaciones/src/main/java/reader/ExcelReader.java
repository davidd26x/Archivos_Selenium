package reader;

import com.poiji.bind.Poiji;
import modelos.Videojuego;

import java.io.File;
import java.util.List;

public class ExcelReader {
    private final static String excelPath = "src/main/resources/data/dataExcel.xlsx";

    public static List<Videojuego> obtenerListaVideojuego(){
        return Poiji.fromExcel(new File(excelPath), Videojuego.class);
    }
}
