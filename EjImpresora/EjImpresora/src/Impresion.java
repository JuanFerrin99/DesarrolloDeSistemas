public class Impresion {
    String contenido;
    int dispositivoId;

    public Impresion(String contenido, int dispositivoId) {
        this.contenido = contenido;
        this.dispositivoId = dispositivoId;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public int getDispositivoId() {
        return dispositivoId;
    }

    public void setDispositivoId(int dispositivoId) {
        this.dispositivoId = dispositivoId;
    }
}
