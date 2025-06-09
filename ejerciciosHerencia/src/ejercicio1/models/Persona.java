package ejercicio1.models;

public class Persona {
    protected final String nombre;
    protected final String apellido;
    protected final int edad;
    protected final boolean casado;

    public Persona(String nombre, String apellido, int edad, boolean casado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.casado = casado;
    }


}
