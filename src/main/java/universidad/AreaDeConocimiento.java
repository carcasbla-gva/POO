package universidad;

import libros.Libro;

import java.util.ArrayList;
import java.util.List;

public class AreaDeConocimiento {
    private String nombre;
    private List<Departamentos> departamentos = new ArrayList<>();

    public AreaDeConocimiento(String nombre, List<Departamentos> departamentos) {
        this.nombre = nombre;
        this.departamentos = departamentos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addDepartamentos(Departamentos departamentos){
        this.departamentos.add(departamentos);
    }

    @Override
    public String toString(){
        return this.nombre;
    }
}
