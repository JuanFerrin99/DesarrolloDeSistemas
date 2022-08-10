import java.util.HashMap;

public class Carrera {
    String nombre;
    int duracion;
    HashMap<String,Integer> materias;
    String tipo;

    public Carrera(String nombre, int duracion, HashMap<String, Integer> materias, String tipo) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.materias = materias;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public HashMap<String, Integer> getMaterias() {
        return materias;
    }

    public void setMaterias(HashMap<String, Integer> materias) {
        this.materias = materias;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
