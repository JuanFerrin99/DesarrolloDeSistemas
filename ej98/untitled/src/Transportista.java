import java.util.ArrayList;

public class Transportista {
    private String nombre;
    private ArrayList<Envio> enviosActivos;
    private float tarifaEstandar;
    private float tarifaLargadistancia;

    public float calcularPrecioEstandar(float peso){
        return tarifaEstandar * peso;
    }
    public float calcularPrecioLargaDistancia(float peso){
        return tarifaEstandar * peso;
    }
    public float calcularPrecioProveedor(float peso){
        return peso;
    }

    public Transportista(String nombre, ArrayList<Envio> enviosActivos, float tarifaEstandar, float tarifaLargadistancia) {
        this.nombre = nombre;
        this.enviosActivos = enviosActivos;
        this.tarifaEstandar = tarifaEstandar;
        this.tarifaLargadistancia = tarifaLargadistancia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Envio> getEnviosActivos() {
        return enviosActivos;
    }

    public void setEnviosActivos(ArrayList<Envio> enviosActivos) {
        this.enviosActivos = enviosActivos;
    }
}
