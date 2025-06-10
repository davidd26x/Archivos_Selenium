package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        final var mavenHomePath = System.getenv("MAVEN_HOME");
        System.out.printf("Maven home path: %s%n", mavenHomePath);
    }
}