package hospital;

import java.util.ArrayList;
import java.util.List;

public class Paciente {
    private String nombre;
    private String dni;
    private Habitacion habitacion;
    private List<Intervencion> intervenciones = new ArrayList<>();

    public Paciente(String nombre, String dni, Habitacion habitacion) {
        this.nombre = nombre;
        this.dni = dni;
        this.habitacion = habitacion;
        this.habitacion.getPacientes().add(this);
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

    public List<Intervencion> getIntervenciones() {
        return intervenciones;
    }

    public void setIntervenciones(List<Intervencion> intervenciones) {
        this.intervenciones = intervenciones;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public void addIntervenciones(Intervencion intervenciones){
        this.intervenciones.add(intervenciones);
    }

    @Override
    public String toString(){
        return nombre + dni;
    }
}
