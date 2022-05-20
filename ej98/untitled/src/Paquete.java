public class Paquete {
    private String cliente;
    private float peso;
    private String contenido;

    public Paquete(String cliente, float peso, String contenido) {
        this.cliente = cliente;
        this.peso = peso;
        this.contenido = contenido;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}
