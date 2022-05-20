public class Personal {
    private int dni;
    private String nombre;
    private String apellido;
    private String titulo;
    private String turno;
    private String cargo;

    public Personal(int dni, String nombre, String apellido, String titulo, String turno, String cargo) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.titulo = titulo;
        this.turno = turno;
        this.cargo = cargo;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
