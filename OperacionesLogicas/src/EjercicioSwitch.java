import java.util.Scanner;

public class EjercicioSwitch {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var a = ScannerManager.leerInt(scanner, "Ingrese el primer número ");
        final var b = ScannerManager.leerInt(scanner, "Ingrese el segundo número ");

        char opcion;
        do {
            mostrarMenu();
            opcion = ScannerManager.leerChar(scanner, "Ingrese la opción ");
            if (opcion != 'F' && opcion != 'f') {
                ejecutarOpcion(a, b, opcion);
            }

        } while (opcion != 'F' && opcion != 'f');


        scanner.close();


    }

    static void ejecutarOpcion(int a, int b, char opcion) {
        final var resultado = switch (opcion) {
            case 'A', 'a' -> calcularSuma(a, b);
            case 'B', 'b' -> calcularResta(a, b);
            case 'C', 'c' -> calcularMultiplicacion(a, b);
            case 'D', 'd' -> calcularDivision(a, b);
            case 'E', 'e' -> calcularResto(a, b);

            default -> -1;
        };

        if (resultado != -1) {
            System.out.printf("El resultado entre los números %d y %d es %d%n", a, b, resultado);
        } else {
            System.out.println("Opción incorrecta");
        }
    }

    static void mostrarMenu() {
        System.out.println("A/a: Sumar");
        System.out.println("B/b: Restar");
        System.out.println("C/c: Multiplicar");
        System.out.println("D/d: Dividir");
        System.out.println("E/e: Resto");
        System.out.println("F/f: Salir");
    }

    static int calcularSuma(int a, int b) {
        return a + b;
    }

    static int calcularResta(int a, int b) {
        return a - b;
    }

    static int calcularMultiplicacion(int a, int b) {
        return a * b;
    }

    static int calcularDivision(int a, int b) {
        return a / b;
    }

    static int calcularResto(int a, int b) {
        return a % b;
    }
}
