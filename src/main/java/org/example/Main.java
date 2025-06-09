package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        final var nombre1 = System.getProperty("nombre1");
        final var nombre2 = System.getProperty("nombre2");

        final var multilinea = """
                nombre1: %s
                nombre2: %s
                """;

        System.out.printf(multilinea, convertirMayuscula(nombre1), convertirMayuscula(nombre2));
    }

    private static String convertirMayuscula(String nombre){
        return nombre.toUpperCase();
    }
}