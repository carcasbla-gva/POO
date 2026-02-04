package AplicacionPropia.farmacia;

import java.util.ArrayList;
import java.util.List;

public class Receta {
    private int id;
    private String codigo;
    private String preinscripcion;
    private String caducidad;
    private List<Medicamento> medicamentos = new ArrayList<Medicamento>();

    // constructor

    public Receta(int id, String codigo, String preinscripcion, String caducidad) {
        this.id = id;
        this.codigo = codigo;
        this.preinscripcion = preinscripcion;
        this.caducidad = caducidad;
    }
    // getters y setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getPreinscripcion() {
        return preinscripcion;
    }

    public void setPreinscripcion(String preinscripcion) {
        this.preinscripcion = preinscripcion;
    }

    public String getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(String caducidad) {
        this.caducidad = caducidad;
    }

    public List<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(List<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }
    public void addMedicamentos(Medicamento medicamentos){
        this.medicamentos.add(medicamentos);
    }

    @Override
    public String toString() {
        return "Receta{" +
                "id=" + id +
                ", codigo='" + codigo + '\'' +
                ", preinscripcion='" + preinscripcion + '\'' +
                ", caducidad='" + caducidad + '\'' +
                '}';
    }
}
