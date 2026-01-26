package SistemaDeSubastas;

import java.util.ArrayList;
import java.util.List;

public class Pujador {
    private String nombre;
    private String dni;
    private List<Puja> pujas = new ArrayList<>();

    public Pujador(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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
        return "Pujador{" +
                "nombre='" + nombre + '\'' +
                ", dni='" + dni + '\'' +
                '}';
    }
}
