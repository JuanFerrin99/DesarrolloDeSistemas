import java.util.ArrayList;

public class Cliente {
    private int id;
    private String nombre;
    private String direccionEnvio;
    private String direccionCobro;
    private String email;
    private boolean preferencial;
    private ArrayList<Carrito> carritos;
    private Tarjeta tarjeta;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    public String getDireccionCobro() {
        return direccionCobro;
    }

    public void setDireccionCobro(String direccionCobro) {
        this.direccionCobro = direccionCobro;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isPreferencial() {
        return preferencial;
    }

    public void setPreferencial(boolean preferencial) {
        this.preferencial = preferencial;
    }

    public ArrayList<Carrito> getCarritos() {
        return carritos;
    }

    public void setCarritos(ArrayList<Carrito> carritos) {
        this.carritos = carritos;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    public Cliente(int id, String nombre, String direccionEnvio, String direccionCobro, String email, boolean preferencial, ArrayList<Carrito> carritos, Tarjeta tarjeta) {
        this.id = id;
        this.nombre = nombre;
        this.direccionEnvio = direccionEnvio;
        this.direccionCobro = direccionCobro;
        this.email = email;
        this.preferencial = preferencial;
        this.carritos = carritos;
        this.tarjeta = tarjeta;
    }
}
