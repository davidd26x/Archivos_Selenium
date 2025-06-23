Feature: Lectura de JSON

  Background: Precondicion
    Given Leo el JSON de User

  @regression @smoke
  Scenario: ID sea positivo
    Then Verifico que el id sea positivo

  @regression
  Scenario: Longitud tiene su valor correcto
    Then Verifico que la longitud sea 71.7478

  @regression
  Scenario: La longitud de company bs sea correcta
    Then Verifico que la longitud de company bs sea mayor que 10