import java.util.Date;

public class Tarjeta {
    private int num;
    private int codigoSeguridad;
    private String infoExtra;
    private String domicilio;
    private Date fechaCaducidad;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getCodigoSeguridad() {
        return codigoSeguridad;
    }

    public void setCodigoSeguridad(int codigoSeguridad) {
        this.codigoSeguridad = codigoSeguridad;
    }

    public String getInfoExtra() {
        return infoExtra;
    }

    public void setInfoExtra(String infoExtra) {
        this.infoExtra = infoExtra;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public Date getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(Date fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public Tarjeta(int num, int codigoSeguridad, String infoExtra, String domicilio, Date fechaCaducidad) {
        this.num = num;
        this.codigoSeguridad = codigoSeguridad;
        this.infoExtra = infoExtra;
        this.domicilio = domicilio;
        this.fechaCaducidad = fechaCaducidad;
    }
}
