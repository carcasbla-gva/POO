package hospital;

import java.util.ArrayList;
import java.util.List;

public class Medicamento {
    private String nombre;
    private List<Prescribe> prescripciones = new ArrayList<>();
    public Medicamento(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Prescribe> getPrescripciones() {
        return prescripciones;
    }

    @Override
    public String toString(){
        return nombre;
    }
}
