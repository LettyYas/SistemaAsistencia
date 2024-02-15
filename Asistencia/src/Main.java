// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Universidad universidad = new Universidad("Universidad de los Andes");
        Estudiante estudiante = new Estudiante("Juan", "Perez");
        Profesor profesor = new Profesor("Carlos", "Gonzalez");
        Asignatura asignatura = new Asignatura("Matematicas", estudiante);
        Curso curso = new Curso("Calculo", profesor, asignatura);
        Asistencia asistencia = new Asistencia("2020-10-10");
        System.out.println("Universidad: " + universidad.getNombre());
        System.out.println("Estudiante: " + estudiante.getNombre() + " " + estudiante.getApellido());
        System.out.println("Profesor: " + profesor.getNombre() + " " + profesor.getApellido());
        System.out.println("Asignatura: " + asignatura.getNombre());
        System.out.println("Curso: " + curso.getNombre());
        System.out.println("Asistencia: " + asistencia.getFecha());
    }