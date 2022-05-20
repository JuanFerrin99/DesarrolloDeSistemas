public class Envio {
    private Transportista transportista;
    private Paquete paquete;
    private boolean entregado;
    private float costeEnvio;
    private String destino;
    private String origen;
    private boolean largaDistancia;

    private void calcularCostoPorKilo() {
        this.costeEnvio = this.transportista.calcularPrecioEstandar(this.paquete.getPeso());
    }

    private void calcularCostoPorLargaDistancia() {
        this.costeEnvio = this.transportista.calcularPrecioLargaDistancia(this.paquete.getPeso());
    }

    private void calcularCostoProveedor() {
        this.costeEnvio = this.transportista.calcularPrecioProveedor(this.paquete.getPeso());
    }

    private void enviarPaquete() {
    }

    public Envio(Transportista transportista, Paquete paquete, boolean entregado, float costeEnvio, String destino, String origen, boolean largaDistancia) {
        this.transportista = transportista;
        this.paquete = paquete;
        this.entregado = entregado;
        this.costeEnvio = costeEnvio;
        this.destino = destino;
        this.origen = origen;
        this.largaDistancia=largaDistancia;
    }

    public boolean isLargaDistancia() {
        return largaDistancia;
    }

    public void setLargaDistancia(boolean largaDistancia) {
        this.largaDistancia = largaDistancia;
    }

    public String getTransportistaNombre() {
        return transportistaNombre;
    }

    public void setTransportistaNombre(String transportistaNombre) {
        this.transportistaNombre = transportistaNombre;
    }

    public Paquete getPaquete() {
        return paquete;
    }

    public void setPaquete(Paquete paquete) {
        this.paquete = paquete;
    }

    public boolean isEntregado() {
        return entregado;
    }

    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }

    public float getCosteEnvio() {
        return costeEnvio;
    }

    public void setCosteEnvio(float costeEnvio) {
        this.costeEnvio = costeEnvio;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }
}
