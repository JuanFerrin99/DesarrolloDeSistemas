import java.util.ArrayList;

public class BaseNormal extends Base{
    private ArrayList<Ambulancia> ambulancias;
    private ArrayList<Personal> personal;
    private float timepoAsistencia;

    public BaseNormal(ArrayList<Ambulancia> ambulancias, ArrayList<Personal> personal, float timepoAsistencia) {
        this.ambulancias = ambulancias;
        this.personal = personal;
        this.timepoAsistencia = timepoAsistencia;
    }

    public BaseNormal(String nombre, ArrayList<Ambulancia> ambulancias, ArrayList<Personal> personal, float timepoAsistencia) {
        super(nombre);
        this.ambulancias = ambulancias;
        this.personal = personal;
        this.timepoAsistencia = timepoAsistencia;
    }

    public ArrayList<Ambulancia> getAmbulancias() {
        return ambulancias;
    }

    public void setAmbulancias(ArrayList<Ambulancia> ambulancias) {
        this.ambulancias = ambulancias;
    }

    public ArrayList<Personal> getPersonal() {
        return personal;
    }

    public void setPersonal(ArrayList<Personal> personal) {
        this.personal = personal;
    }

    public float getTimepoAsistencia() {
        return timepoAsistencia;
    }

    public void setTimepoAsistencia(float timepoAsistencia) {
        this.timepoAsistencia = timepoAsistencia;
    }
}
