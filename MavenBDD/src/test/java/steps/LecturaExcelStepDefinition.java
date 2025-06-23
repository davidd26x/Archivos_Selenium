package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import modelos.Monstruo;
import org.junit.jupiter.api.Assertions;
import reader.ExcelReader;

import java.util.List;

public class LecturaExcelStepDefinition {
    private List<Monstruo> listaMonstruo;
    private Monstruo monstruo;
    private int tamLista;

    @Given("Leo la lista de monstruos de Excel")
    public void leerListaMonstruoExcel() {
        listaMonstruo = ExcelReader.obtenerListaMonstruo();
    }

    @When("Obtengo el primer elemento")
    public void obtenerPrimerElemento() {
        monstruo = listaMonstruo.get(0);
    }

    @Then("Verifico que el nombre sea {string} y su edad sea {int}")
    public void verificarNombreEdad(String nombre, int edad) {
        Assertions.assertAll(
                () -> Assertions.assertEquals(monstruo.getNombre(), nombre),
                () -> Assertions.assertEquals(monstruo.getEdad(), edad)
        );
    }

    @When("Obtengo el ultimo elemento")
    public void obtenerUltimoElemento() {
        monstruo = listaMonstruo.get(listaMonstruo.size() - 1);
    }

    @Then("Verifico que sea de genero {string} y su tipo sea {string}")
    public void verificarGeneroTipo(String genero, String tipo) {
        Assertions.assertAll(
                () -> Assertions.assertEquals(monstruo.getGenero(), genero),
                () -> Assertions.assertEquals(monstruo.getTipo(), tipo)
        );
    }

    @When("Obtengo la longitud de la lista")
    public void obtenerLongitudLista() {
        tamLista = listaMonstruo.size();
    }

    @Then("Verifico que la longitud de la lista sea {int}")
    public void verificarLongitudLista(int tamEsperado) {
        Assertions.assertEquals(tamLista, tamEsperado);
    }

    @When("Obtengo el elemento con index {int}")
    public void obtenerElementoIndex(int index) {
        monstruo = listaMonstruo.get(index);
    }

    @Then("Verifico que tenga el nombre {string}, edad {int} y peso {double}")
    public void verificarDatosMonstruo(String nombre, int edad, double peso) {
        Assertions.assertAll(
                () -> Assertions.assertEquals(monstruo.getNombre(), nombre),
                () -> Assertions.assertEquals(monstruo.getEdad(), edad),
                () -> Assertions.assertEquals(monstruo.getPeso(), peso)
        );
    }
}
