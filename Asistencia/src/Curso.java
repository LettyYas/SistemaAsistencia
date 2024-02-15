import java.util.ArrayList;

public class Curso {
    private String paralelo;
    private String horario;
    private String ciclo;
    private String periodo;
    Estudiante estudiante;
    private ArrayList<Profesor> profesorList;
    Asistencia asistencia;

    public Curso(String paralelo, String horario, String ciclo, String periodo, Estudiante estudiante, ArrayList<Profesor> profesorList, Asistencia asistencia){
        this.paralelo = paralelo;
        this.horario = horario;
        this.ciclo = ciclo;
        this.periodo = periodo;
        this.estudiante = estudiante;
        this.profesorList = profesorList;
        this.asistencia = asistencia;
    }

    public Curso(String calculo, Profesor profesor, Asignatura asignatura) {
    }

    public String getParalelo() {
        return paralelo;
    }
    public String getHorario() {
        return horario;
    }
    public String getCiclo() {
        return ciclo;
    }
    public String getPeriodo() {
        return periodo;
    }
    public Estudiante getEstudiante() {
        return estudiante;
    }
    public ArrayList<Profesor> getProfesorList() {
        return profesorList;
    }
    public Asistencia getAsistencia() {
        return asistencia;
    }

    public String getNombre() { return null;
    }
}
