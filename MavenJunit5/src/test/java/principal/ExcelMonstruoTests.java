package principal;

import annotations.Regression;
import annotations.Smoke;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
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
    @Regression
    @Smoke
    @Description("Probando el primer nombre")
    @Severity(SeverityLevel.BLOCKER)
    public void primerTest() {
        final var primerMonstruo = listaMonstruo.get(0);
        Assertions.assertEquals(primerMonstruo.getNombre(), "TOLOSA", "1er nombre no hace match");
    }

    @Test
    @Regression
    @Smoke
    @Description("Probando la longitud de la lista")
    @Severity(SeverityLevel.NORMAL)
    public void segundoTest() {
        final var n = listaMonstruo.size();
        Assertions.assertEquals(n, 14, "longitud incorrecta");
    }

    @Test
    @Regression
    @Description("Probando el tercer nivel")
    @Severity(SeverityLevel.TRIVIAL)
    public void tercerTest() {
        final var tercerMonstruo = listaMonstruo.get(2);
        Assertions.assertEquals(tercerMonstruo.getNivel(), 22, "3er nivel no hace match");
    }

    @Test
    @Regression
    @Description("Probando toda la informacion del ultimo monstruo")
    @Severity(SeverityLevel.CRITICAL)
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
