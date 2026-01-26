package SistemaDeSubastas;

import java.util.ArrayList;
import java.util.List;

public class Subasta {
    private String nombre;
    private String fecha;
    private List<Puja> pujas = new ArrayList<>();
    private Lote lote;

    public Subasta(String nombre, String fecha, Lote lote) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.lote = lote;
        this.lote.getSubastas().add(this);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public List<Puja> getPujas() {
        return pujas;
    }

    public void setPujas(List<Puja> pujas) {
        this.pujas = pujas;
    }

    public void addPujas(Puja pujas){
        this.pujas.add(pujas);
    }

    @Override
    public String toString() {
        return "Subasta{" +
                "nombre='" + nombre + '\'' +
                ", fecha='" + fecha + '\'' +
                '}';
    }
}
