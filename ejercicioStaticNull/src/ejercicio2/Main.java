package ejercicio2;

public class Main {
    public static void main(String[] args) {
        final var trabajador1 = new Trabajador("ROSA", "PALACIOS", 20);
        final var trabajador2 = new Trabajador("CARLOS", "FREITAS", 52, "BULMA CHAVEZ");

        System.out.printf("Nombre completo: %s %s, Estado Civil: %s%n",
                trabajador1.getNombre(), trabajador1.getApellido(), trabajador1.getEstadoCivil());

        System.out.printf("Nombre completo: %s %s, Estado Civil: %s%n",
                trabajador2.getNombre(), trabajador2.getApellido(), trabajador2.getEstadoCivil());
    }
}
