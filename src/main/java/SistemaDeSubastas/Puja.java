package SistemaDeSubastas;

import java.util.ArrayList;
import java.util.List;

public class Puja {
    private String fecha;
    private double precio;
    private Pujador pujador;
    private List<Subasta> subastas = new ArrayList<>();

    public Puja(String fecha, double precio, Pujador pujador) {
        this.fecha = fecha;
        this.precio = precio;
        this.pujador = pujador;
        this.pujador.getPujas().add(this);
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Pujador getPujador() {
        return pujador;
    }

    public void setPujador(Pujador pujador) {
        this.pujador = pujador;
    }

    public List<Subasta> getSubastas() {
        return subastas;
    }

    public void setSubastas(List<Subasta> subastas) {
        this.subastas = subastas;
    }

    public void addSubastas(Subasta subastas){
        this.subastas.add(subastas);
    }


    @Override
    public String toString() {
        return "Puja{" +
                "fecha='" + fecha + '\'' +
                ", precio=" + precio +
                '}';
    }
}
