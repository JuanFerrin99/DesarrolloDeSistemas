import java.util.ArrayList;

public class Profesor {
    ArrayList<Curso> cursos;
    ArrayList<Falta> inAsistencia;

    public Profesor(ArrayList<Curso> cursos, ArrayList<Falta> inAsistencia) {
        this.cursos = cursos;
        this.inAsistencia = inAsistencia;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

    public ArrayList<Falta> getInAsistencia() {
        return inAsistencia;
    }

    public void setInAsistencia(ArrayList<Falta> inAsistencia) {
        this.inAsistencia = inAsistencia;
    }
}
