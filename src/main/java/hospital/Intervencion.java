package hospital;

import java.util.ArrayList;
import java.util.List;

public class Intervencion {
    private String nombre;
    private Medico medico;
    private Paciente paciente;
    private List<Medicamento> medicamentos = new ArrayList<>();

    public Intervencion(String nombre, Medico medico, Paciente paciente) {
        this.nombre = nombre;
        this.medico = medico;
        this.paciente = paciente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
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
    public String toString(){
        return nombre;
    }
}
