import java.util.ArrayList;

public class Alumno {
    String paisNacimiento;
    String localidadNacimiento;
    ArrayList<infoAlumnoCurso> datosCursos;
    Carrera carrera;
    Materia materiasAprobadas;

    public Alumno(String paisNacimiento, String localidadNacimiento, ArrayList<infoAlumnoCurso> datosCursos, Carrera carrera, Materia materiasAprobadas) {
        this.paisNacimiento = paisNacimiento;
        this.localidadNacimiento = localidadNacimiento;
        this.datosCursos = datosCursos;
        this.carrera = carrera;
        this.materiasAprobadas = materiasAprobadas;
    }

    public String getPaisNacimiento() {
        return paisNacimiento;
    }

    public void setPaisNacimiento(String paisNacimiento) {
        this.paisNacimiento = paisNacimiento;
    }

    public String getLocalidadNacimiento() {
        return localidadNacimiento;
    }

    public void setLocalidadNacimiento(String localidadNacimiento) {
        this.localidadNacimiento = localidadNacimiento;
    }

    public ArrayList<infoAlumnoCurso> getDatosCursos() {
        return datosCursos;
    }

    public void setDatosCursos(ArrayList<infoAlumnoCurso> datosCursos) {
        this.datosCursos = datosCursos;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public Materia getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void setMateriasAprobadas(Materia materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }
}
