import java.util.ArrayList;

public class Curso {
    String idCurso;
    Materia materia;
    Profesor profesor;
    String periodo;
    ArrayList<Integer> alumnos;
    ArrayList<Evaluacion> evaluaciones;

    public Curso(String idCurso, Materia materia, Profesor profesor, String periodo, ArrayList<Integer> alumnos, ArrayList<Evaluacion> evaluaciones) {
        this.idCurso = idCurso;
        this.materia = materia;
        this.profesor = profesor;
        this.periodo = periodo;
        this.alumnos = alumnos;
        this.evaluaciones = evaluaciones;
    }

    public String getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(String idCurso) {
        this.idCurso = idCurso;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public ArrayList<Integer> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Integer> alumnos) {
        this.alumnos = alumnos;
    }

    public ArrayList<Evaluacion> getEvaluaciones() {
        return evaluaciones;
    }

    public void setEvaluaciones(ArrayList<Evaluacion> evaluaciones) {
        this.evaluaciones = evaluaciones;
    }
}
