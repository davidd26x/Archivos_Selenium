import java.util.Scanner;

public class Ejercicio2 {
    //Se copia el mismo ejercicio pero se agrega un valor más al final
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        final var nombre = ScannerManager.leerString(scanner, "Ingrese su nombre: ");

        final var edad = ScannerManager.leerInt(scanner, "Ingrese su edad: ");

        final var estatura = ScannerManager.leerDouble(scanner, "Ingrese su estatura (con decimales): ");

        scanner.close();

        imprimirResultado(nombre, edad, estatura);
    }

    //Agrego nombre
    static void imprimirResultado(String nombre, int edad, double estatura) {
        System.out.printf("Mi nombre es %s, tengo %d años y la estatura es de %.2fcm", nombre, edad, estatura);
    }
}
