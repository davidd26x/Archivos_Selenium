package ejercicio2;

public class Main {
    public static void main(String[] args) {
        final var videojuego1 = new Videojuego("BLUE PROTOCOL", 2011, 58.99, 45,
                Videojuego.Genero.TERROR, Videojuego.Empresa.XBOX);

        final var videojuego2 = new Videojuego("VALHEIM", 2015, 49.99, 15,
                Videojuego.Genero.ACCION, Videojuego.Empresa.PLAY_STATION);

        final var videojuego3 = new Videojuego("MARIO BROS", 1998, 69.99, 5,
                Videojuego.Genero.COMEDIA, Videojuego.Empresa.NINTENDO);

        System.out.printf("Nombre: %s, Género: %s, Empresa: %s%n", videojuego1.getNombre(), videojuego1.getGenero(), videojuego1.getEmpresa());

        System.out.printf("Nombre: %s, Género: %s, Empresa: %s%n", videojuego2.getNombre(), videojuego2.getGenero(), videojuego2.getEmpresa());

        System.out.printf("Nombre: %s, Género: %s, Empresa: %s%n", videojuego3.getNombre(), videojuego3.getGenero(), videojuego3.getEmpresa());
    }
}
