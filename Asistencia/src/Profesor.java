import java.util.ArrayList;

public class Profesor extends Persona{
    private ArrayList<Asignatura> asignaturaList;
    private ArrayList<Curso> cursoList;
public Profesor(String nombre, String apellido) {
        super(nombre, apellido);
    }
    public ArrayList<Asignatura> getAsignaturaList() {
        return asignaturaList;
    }
    public ArrayList<Curso> getCursoList() {
        return cursoList;
    }
}
