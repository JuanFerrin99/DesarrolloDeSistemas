import java.util.ArrayList;
import java.util.HashMap;

public class infoAlumnoCurso {
    String idCurso;
    ArrayList<Falta> asistencia;
    HashMap<Integer,Float> notas;
    boolean estado;

    public infoAlumnoCurso(String idCurso, ArrayList<Falta> asistencia, HashMap<Integer, Float> notas, boolean estado) {
        this.idCurso = idCurso;
        this.asistencia = asistencia;
        this.notas = notas;
        this.estado = estado;
    }

    public String getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(String idCurso) {
        this.idCurso = idCurso;
    }

    public ArrayList<Falta> getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(ArrayList<Falta> asistencia) {
        this.asistencia = asistencia;
    }

    public HashMap<Integer, Float> getNotas() {
        return notas;
    }

    public void setNotas(HashMap<Integer, Float> notas) {
        this.notas = notas;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
