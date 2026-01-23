package hospital;

import java.util.ArrayList;
import java.util.List;

public class Habitacion {
    private String num_hab;
    private List<Paciente> pacientes = new ArrayList<>();

    public Habitacion(String num_hab) {
        this.num_hab = num_hab;
    }

    public String getNum_hab() {
        return num_hab;
    }

    public void setNum_hab(String num_hab) {
        this.num_hab = num_hab;
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public void addPacientes(Paciente pacientes){
        this.pacientes.add(pacientes);
    }

    @Override
    public String toString(){
        return num_hab;
    }
}
