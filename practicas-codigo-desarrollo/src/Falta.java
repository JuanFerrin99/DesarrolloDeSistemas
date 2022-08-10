import java.util.Date;

public class Falta {
    Date fecha;
    String tipo;
    String motivo;
    boolean justificado;

    public Falta(Date fecha, String tipo, String motivo, boolean justificado) {
        this.fecha = fecha;
        this.tipo = tipo;
        this.motivo = motivo;
        this.justificado = justificado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public boolean isJustificado() {
        return justificado;
    }

    public void setJustificado(boolean justificado) {
        this.justificado = justificado;
    }
}
