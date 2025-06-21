Feature: Data aleatoria

  Background: Precondicion
    Given Genero un par de numeros int aleatorio positivos

  Scenario: Suma positiva
    When Sumo los valores
    Then Verifico que la suma sea positiva

  Scenario: Producto positivo
    When Multiplico los valores
    Then Verifico que el producto sea positivo

  Scenario: Raiz cuadrada positiva
    When Calculo la raiz cuadrada de ambos
    Then Verifico que la raiz cuadrada de ambos sean positivos