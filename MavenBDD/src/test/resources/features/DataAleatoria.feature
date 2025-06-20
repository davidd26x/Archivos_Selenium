Feature: Data aleatoria

  Scenario: Suma positiva
    Given Genero un par de numeros int aleatorio positivos
    When Sumo los valores
    Then Verifico que la suma sea positiva

  Scenario: Producto positivo
    Given Genero un par de numeros int aleatorio positivos
    When Multiplico los valores
    Then Verifico que el producto sea positivo

  Scenario: Raiz cuadrada positiva
    Given Genero un par de numeros int aleatorio positivos
    When Calculo la raiz cuadrada de ambos
    Then Verifico que la raiz cuadrada de ambos sean positivos