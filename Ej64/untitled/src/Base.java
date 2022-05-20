public class Base {
    String nombre;

    public Base( ) {
        this.nombre = "";
    }

    public Base(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
