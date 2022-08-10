import java.util.ArrayList;

public class Materia {
    String nombre;
    String duracion;
    ArrayList<String> correlativas;
    boolean tieneFinal;

    public Materia(String nombre, String duracion, ArrayList<String> correlativas, boolean tieneFinal) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.correlativas = correlativas;
        this.tieneFinal = tieneFinal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public ArrayList<String> getCorrelativas() {
        return correlativas;
    }

    public void setCorrelativas(ArrayList<String> correlativas) {
        this.correlativas = correlativas;
    }

    public boolean isTieneFinal() {
        return tieneFinal;
    }

    public void setTieneFinal(boolean tieneFinal) {
        this.tieneFinal = tieneFinal;
    }
}
