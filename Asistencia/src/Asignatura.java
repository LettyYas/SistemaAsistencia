public class Asignatura {
    private String nombre;
    Estudiante estudiante;
    Profesor professor;
    public Asignatura(String nombre, Estudiante estudiante) {
        this.nombre = nombre;
        this.estudiante = estudiante;
    }
    public String getNombre() {
        return nombre;
    }
    public Estudiante getEstudiante() {
        return estudiante;
    }
}