package steps;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class DataAleatoriaStepDefinition {
    private final Faker faker = new Faker();
    private int a;
    private int b;
    private int suma;
    private int producto;
    private double raizCuadrada1;
    private double raizCuadrada2;


    @Given("Genero un par de numeros int aleatorio positivos")
    public void generarParNumerosIntAleatorios() {
        a = faker.number().numberBetween(1, 50);
        b = faker.number().numberBetween(1, 50);
    }

    @When("Sumo los valores")
    public void sumarValores() {
        suma = a + b;
    }


    @Then("Verifico que la suma sea positiva")
    public void verificarSumaPositiva() {
        Assertions.assertTrue(suma > 0);
        
    }

    @When("Multiplico los valores")
    public void multiplicarValores() {
        producto = a * b;
        
    }

    @Then("Verifico que el producto sea positivo")
    public void verificarProductoPositivo() {
        Assertions.assertTrue(producto > 0);
        
    }

    @When("Calculo la raiz cuadrada de ambos")
    public void calcularRaizCuadrada() {
        raizCuadrada1 = Math.sqrt(a);
        raizCuadrada2 = Math.sqrt(b);
        
    }

    @Then("Verifico que la raiz cuadrada de ambos sean positivos")
    public void verificarRaizCuadradaPositiva() {
        Assertions.assertAll(
                () -> Assertions.assertTrue(raizCuadrada1 > 0),
                () -> Assertions.assertTrue(raizCuadrada2 > 0)
        );
    }
}
