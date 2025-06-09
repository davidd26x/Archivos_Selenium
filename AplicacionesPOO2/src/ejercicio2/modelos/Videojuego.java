package ejercicio2.modelos;

public class Videojuego {
    private final String nombre;
    private final int epoca;
    private final double precio;
    private final int duracion;
    private final Genero genero;
    private final Empresa empresa;

    public Videojuego(String nombre, int epoca, double precio, int duracion,
                      Genero genero, Empresa empresa) {
        this.nombre = nombre;
        this.epoca = epoca;
        this.precio = precio;
        this.duracion = duracion;
        this.genero = genero;
        this.empresa = empresa;
    }

    public String getNombre() {
        return nombre;
    }

    public Genero getGenero() {
        return genero;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public enum Genero {
        TERROR,
        COMEDIA,
        ACCION
    }

    public enum Empresa {
        XBOX,
        NINTENDO,
        PLAY_STATION
    }
}
