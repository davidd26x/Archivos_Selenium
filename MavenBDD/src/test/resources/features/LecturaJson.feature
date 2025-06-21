Feature: Lectura de JSON

  Background: Precondicion
    Given Leo el JSON de User

  Scenario: ID sea positivo
    Then Verifico que el id sea positivo

  Scenario: Longitud tiene su valor correcto
    Then Verifico que la longitud sea 71.7478

  Scenario: La longitud de company bs sea correcta
    Then Verifico que la longitud de company bs sea mayor que 10