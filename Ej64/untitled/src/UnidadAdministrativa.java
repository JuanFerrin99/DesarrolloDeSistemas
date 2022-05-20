import java.util.ArrayList;

public class UnidadAdministrativa extends Base{
    private ArrayList<Base> basesSubordinadas;

    public UnidadAdministrativa(ArrayList<Base> basesSubordinadas) {
        this.basesSubordinadas = basesSubordinadas;
    }

    public UnidadAdministrativa(String nombre, ArrayList<Base> basesSubordinadas) {
        super(nombre);
        this.basesSubordinadas = basesSubordinadas;
    }

    public ArrayList<Base> getBasesSubordinadas() {
        return basesSubordinadas;
    }

    public void setBasesSubordinadas(ArrayList<Base> basesSubordinadas) {
        this.basesSubordinadas = basesSubordinadas;
    }
}
