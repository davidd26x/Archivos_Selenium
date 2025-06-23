Feature: Lectura de Excel

  Background: Precondicion
    Given Leo la lista de monstruos de Excel

  @regression @smoke
  Scenario: Verificar el primer elemento
    When Obtengo el primer elemento
    Then Verifico que el nombre sea "TOLOSA" y su edad sea 5

  @regression
  Scenario: Verificar el ultimo elemento
    When Obtengo el ultimo elemento
    Then Verifico que sea de genero "MACHO" y su tipo sea "PLANTA"

  @regression @smoke
  Scenario: Verificar la longitud de la lista
    When Obtengo la longitud de la lista
    Then Verifico que la longitud de la lista sea 14

  @regression
  Scenario Outline: Verificar 4 primeros elementos
    When Obtengo el elemento con index <index>
    Then Verifico que tenga el nombre <nombre>, edad <edad> y peso <peso>

    Examples:
      | index | nombre      | edad | peso |
      | 0     | "TOLOSA"    | 5    | 1.97 |
      | 1     | "COROMINAS" | 1    | 2.31 |
      | 2     | "ARNAIZ"    | 5    | 2.27 |
      | 3     | "CABEZAS"   | 2    | 2.05 |