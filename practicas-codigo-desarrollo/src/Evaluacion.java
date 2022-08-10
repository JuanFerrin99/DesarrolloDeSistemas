import java.util.ArrayList;
import java.util.Date;

public class Evaluacion {
    int id;
    String tipo;
    ArrayList<Date> fechas;
    int periodoInscripcion;
    ArrayList<Integer> alumnosInscriptos;
    boolean terminado;

    public Evaluacion(int id, String tipo, ArrayList<Date> fechas, int periodoInscripcion, ArrayList<Integer> alumnosInscriptos, boolean terminado) {
        this.id = id;
        this.tipo = tipo;
        this.fechas = fechas;
        this.periodoInscripcion = periodoInscripcion;
        this.alumnosInscriptos = alumnosInscriptos;
        this.terminado = terminado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Date> getFechas() {
        return fechas;
    }

    public void setFechas(ArrayList<Date> fechas) {
        this.fechas = fechas;
    }

    public int getPeriodoInscripcion() {
        return periodoInscripcion;
    }

    public void setPeriodoInscripcion(int periodoInscripcion) {
        this.periodoInscripcion = periodoInscripcion;
    }

    public ArrayList<Integer> getAlumnosInscriptos() {
        return alumnosInscriptos;
    }

    public void setAlumnosInscriptos(ArrayList<Integer> alumnosInscriptos) {
        this.alumnosInscriptos = alumnosInscriptos;
    }

    public boolean isTerminado() {
        return terminado;
    }

    public void setTerminado(boolean terminado) {
        this.terminado = terminado;
    }
}
