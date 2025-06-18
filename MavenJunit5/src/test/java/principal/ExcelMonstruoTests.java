package principal;

import modelos.Monstruo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import reader.ExcelReader;
import utilities.BaseTest;

import java.util.List;

public class ExcelMonstruoTests extends BaseTest {
    private List<Monstruo> listaMonstruo;

    @BeforeEach
    public void setUp() {
        listaMonstruo = ExcelReader.obtenerListaMonstruo();
    }

    @Test
    public void primerTest() {
        final var primerMonstruo = listaMonstruo.get(0);
        System.out.printf("El nombre del primer monstruo es: %s%n", primerMonstruo.getNombre());
    }

    @Test
    public void segundoTest() {
        final var n = listaMonstruo.size();
        System.out.printf("El tamano de la lista de monstruos es: %d%n", n);
    }

    @Test
    public void tercerTest() {
        final var tercerMonstruo = listaMonstruo.get(2);
        System.out.printf("El nivel del 3er monstruo es: %d%n", tercerMonstruo.getNivel());
    }
}
