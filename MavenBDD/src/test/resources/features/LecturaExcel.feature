Feature: Lectura de Excel

  Background: Precondicion
    Given Leo la lista de monstruos de Excel


  Scenario: Verificar el primer elemento

    When Obtengo el primer elemento
    Then Verifico que el nombre sea "TOLOSA" y su edad sea 5

  Scenario: Verificar el ultimo elemento
    When Obtengo el ultimo elemento
    Then Verifico que sea de genero "MACHO" y su tipo sea "PLANTA"

  Scenario: Verificar la longitud de la lista
    When Obtengo la longitud de la lista
    Then Verifico que la longitud de la lista sea 14