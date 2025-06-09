package ejercicio2;

public class Trabajador {
    private final String nombre;
    private final String apellido;
    private final int edad;
    private final String conyuge;
    private final EstadoCivil estadoCivil;

    //Constructor para trabajadores que no estén casados
    public Trabajador(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.conyuge = null;
        estadoCivil = obtenerEstadoCivil();
    }

    //Este constructor se hace para los trabajadores que sí estén casados
    public Trabajador(String nombre, String apellido, int edad, String conyuge) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.conyuge = conyuge;
        estadoCivil = obtenerEstadoCivil();
    }

    private EstadoCivil obtenerEstadoCivil() {
        if (conyuge == null) {
            return EstadoCivil.SOLTERO;
        } else {
            return EstadoCivil.CASADO;
        }
    }

    public String getApellido() {
        return apellido;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public String getNombre() {
        return nombre;
    }

    public enum EstadoCivil {
        SOLTERO,
        CASADO
    }
}
