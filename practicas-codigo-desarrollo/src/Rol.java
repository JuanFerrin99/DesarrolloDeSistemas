import java.util.ArrayList;

public class Rol {
    String nombre;
    ArrayList<String> permisos;

    public Rol(String nombre, ArrayList<String> permisos) {
        this.nombre = nombre;
        this.permisos = permisos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getPermisos() {
        return permisos;
    }

    public void setPermisos(ArrayList<String> permisos) {
        this.permisos = permisos;
    }
}
