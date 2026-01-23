package hospital;

import java.util.ArrayList;
import java.util.List;

public class Medico {
    private String nombre;
    private String dni;
    private List<Departamento> departamentos = new ArrayList<>();
    private List<Intervencion> intervenciones = new ArrayList<>();

    public Medico(String nombre, String dni, Departamento cardiologia) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(List<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    public List<Intervencion> getIntervenciones() {
        return intervenciones;
    }

    public void setIntervenciones(List<Intervencion> intervenciones) {
        this.intervenciones = intervenciones;
    }

    public void addDepartamentos(Departamento departamentos){
        this.departamentos.add(departamentos);
    }

    public void addIntervenciones(Intervencion intervenciones){
        this.intervenciones.add(intervenciones);
    }

    @Override
    public String toString(){
        return nombre;
    }
}
