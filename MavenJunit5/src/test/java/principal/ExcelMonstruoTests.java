package principal;

import modelos.Monstruo;
import org.junit.jupiter.api.Assertions;
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
        Assertions.assertEquals(primerMonstruo.getNombre(), "TOLOSA", "1er nombre no hace match");
    }

    @Test
    public void segundoTest() {
        final var n = listaMonstruo.size();
        Assertions.assertEquals(n, 14, "longitud incorrecta");
    }

    @Test
    public void tercerTest() {
        final var tercerMonstruo = listaMonstruo.get(2);
        Assertions.assertEquals(tercerMonstruo.getNivel(), 22, "3er nivel no hace match");
    }

    @Test
    public void cuartoTest() {
        final var ultimoMonstruo = listaMonstruo.get(listaMonstruo.size() - 1);

        Assertions.assertAll(
                () -> Assertions.assertEquals(ultimoMonstruo.getNombre(), "LUCENA"),
                () -> Assertions.assertEquals(ultimoMonstruo.getEdad(), 3),
                () -> Assertions.assertEquals(ultimoMonstruo.getPeso(), 8.57),
                () -> Assertions.assertEquals(ultimoMonstruo.getGenero(), "MACHO"),
                () -> Assertions.assertEquals(ultimoMonstruo.getTipo(), "PLANTA"),
                () -> Assertions.assertEquals(ultimoMonstruo.getNivel(), 36)
        );
    }
}
