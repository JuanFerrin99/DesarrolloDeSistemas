import java.util.ArrayList;

public class Secretario {
    ArrayList<Falta> inAsistencia;

    public Secretario(ArrayList<Falta> inAsistencia) {
        this.inAsistencia = inAsistencia;
    }

    public ArrayList<Falta> getInAsistencia() {
        return inAsistencia;
    }

    public void setInAsistencia(ArrayList<Falta> inAsistencia) {
        this.inAsistencia = inAsistencia;
    }
}
