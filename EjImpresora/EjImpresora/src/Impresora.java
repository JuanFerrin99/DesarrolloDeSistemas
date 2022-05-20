import java.util.ArrayList;

public class Impresora {
    private static Impresora instance;
    private String nombre;
    private ArrayList<Impresion> colaImpresion;
    private ArrayList<Dispositivo> dispositivosConectados;

    private Impresora(String nombre, ArrayList<Impresion> colaImpresion, ArrayList<Dispositivo> dispositivosConectados) {
        this.nombre = nombre;
        this.colaImpresion = colaImpresion;
        this.dispositivosConectados = dispositivosConectados;
    }

    public static Impresora getInstance(String nombre, ArrayList<Impresion> colaImpresion, ArrayList<Dispositivo> dispositivosConectados) {
        if (instance == null){
            instance = new Impresora(nombre, colaImpresion, dispositivosConectados);
        }
        return instance;
    }

    public static Impresora getInstance() {
        return instance;
    }

    public static void setInstance(Impresora instance) {
        Impresora.instance = instance;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Impresion> getColaImpresion() {
        return colaImpresion;
    }

    public void setColaImpresion(ArrayList<Impresion> colaImpresion) {
        this.colaImpresion = colaImpresion;
    }

    public ArrayList<Dispositivo> getDispositivosConectados() {
        return dispositivosConectados;
    }

    public void setDispositivosConectados(ArrayList<Dispositivo> dispositivosConectados) {
        this.dispositivosConectados = dispositivosConectados;
    }
}
