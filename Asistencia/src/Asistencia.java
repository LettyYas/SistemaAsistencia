import java.util.ArrayList;

public class Asistencia {
    private String fecha;
    private ArrayList<Curso> cursoList;

    public Asistencia(String fecha) {
        this.fecha = fecha;
    }
    public String getFecha() {
        return fecha;
    }
}
