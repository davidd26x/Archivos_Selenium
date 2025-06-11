package principal;

import modelos.Monstruo;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reader.ExcelReader;
import utilities.BaseTest;

import java.util.List;

public class ExcelMonstruoTests extends BaseTest {
    private List<Monstruo> listaMonstruo;

    @BeforeMethod
    public void setUp() {
        listaMonstruo = ExcelReader.obtenerListaMonstruo();
    }

    @Test
    public void primerTest() {
        final var primerMonstruo = listaMonstruo.get(0);
        System.out.printf("El nombre del 1er monstruo es: %s%n", primerMonstruo.getNombre());
    }

    @Test
    public void segundoTest() {
        final var n = listaMonstruo.size();
        System.out.printf("El tamano de la lista de monstruos es: %s%n", n);
    }

    @Test
    public void tercerTest() {
        final var nivelTercerMonstruo = listaMonstruo.get(2);
        System.out.printf("El nivel del tercer monstruo es: %s%n", nivelTercerMonstruo.getNivel());
    }
}
