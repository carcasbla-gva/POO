package hospital;

import java.util.ArrayList;
import java.util.List;

public class Intervencion {
    private String nombre;
    private Medico medico;
    private Paciente paciente;
    private List<Prescribe> prescripciones = new ArrayList<>();

    public Intervencion(String nombre, Medico medico, Paciente paciente) {
        this.nombre = nombre;
        this.medico = medico;
        this.medico.getIntervenciones().add(this);
        this.paciente = paciente;
        this.paciente.getIntervenciones().add(this);
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

    public List<Prescribe> getPrescripciones() {
        return prescripciones;
    }

    public void setPrescripciones(List<Prescribe> prescripciones) {
        this.prescripciones = prescripciones;
    }

    @Override
    public String toString(){
        return nombre;
    }
}
