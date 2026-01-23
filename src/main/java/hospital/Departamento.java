package hospital;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nombre;
    private Hospital hospital;
    private List<Medico> medicos = new ArrayList<>();

    public Departamento(String nombre, Hospital hospital) {
        this.nombre = nombre;
        this.hospital = hospital;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public void addMedicos(Medico medicos){
        this.medicos.add(medicos);
        medicos.getDepartamentos().add(this);
    }

    @Override
    public String toString(){
        return nombre;
    }
}
