Feature: Lectura de JSON
  Scenario: ID sea positivo
    Given Leo el JSON de User
    Then Verifico que el id sea positivo

  Scenario: Longitud tiene su valor correcto
    Given Leo el JSON de User
    Then Verifico que la longitud sea 71.7478

  Scenario: La longitud de company bs sea correcta
    Given Leo el JSON de User
    Then Verifico que la longitud de company bs sea mayor que 10