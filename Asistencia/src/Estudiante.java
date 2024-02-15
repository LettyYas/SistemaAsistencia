import java.util.ArrayList;

public class Estudiante extends Persona {
    ArrayList<Asignatura> asignaturaList;
    ArrayList<Curso> cursoList;

    public Estudiante(String nombre, String apellido) {
        super(nombre, apellido);
    }

}
