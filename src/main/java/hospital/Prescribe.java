package hospital;

import java.util.ArrayList;
import java.util.List;

public class Prescribe {
    private Medicamento medicamento;
    private Intervencion intervencion;
    private String dosis;

    public Prescribe(Medicamento medicamento, Intervencion intervencion, String dosis) {
        this.medicamento = medicamento;
        this.medicamento.getPrescripciones().add(this);
        this.intervencion = intervencion;
        this.intervencion.getPrescripciones().add(this);
        this.dosis = dosis;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    public Intervencion getIntervencion() {
        return intervencion;
    }

    public void setIntervencion(Intervencion intervencion) {
        this.intervencion = intervencion;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }


    @Override
    public String toString(){
        return dosis;
    }
}
