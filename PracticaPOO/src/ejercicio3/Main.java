package ejercicio3;

public class Main {
    public static void main(String[] args) {
        final var colorRojo = new Color("ROJO", "#E74C3C");
        final var colorAzul = new Color("AZUL", "#3498DB");
        final var colorAmarillo = new Color("AMARILLO", "#F7DC6F");

        final var persona1 = new Persona("OMAR", "VARGAS", 44,
                95.123, true, colorAzul, Persona.Profesion.INGENIERO);

        final var persona2 = new Persona("SELENA", "RODRIGUEZ", 18,
                50.752, true, colorRojo, Persona.Profesion.DENTISTA);

        final var persona3 = new Persona("EMELINA", "GUTIERREZ", 18,
                45.890, false, colorAmarillo, Persona.Profesion.ABOGADO);

        System.out.printf("Persona1: %s%n", persona1);
        System.out.printf("Persona2: %s%n", persona2);
        System.out.printf("Persona3: %s%n", persona3);
    }
}
