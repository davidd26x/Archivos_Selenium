package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        final var numero1 = Integer.parseInt(System.getProperty("numero1"));
        final var numero2 = Integer.parseInt(System.getProperty("numero2"));

        final var suma = calcularSuma(numero1, numero2);

        System.out.printf("La suma es: %d%n", suma);
    }

    private static int calcularSuma(int a, int b){
        return a + b;
    }
}