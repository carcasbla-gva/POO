package AplicacionPropia.farmacia;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String dni;
    private String nombre;
    private String sip;
    private String telefono;
    private String email;
    private List<Venta> ventas = new ArrayList<>();

    // constructor

    public Cliente(String dni, String nombre, String sip, String telefono, String email) {
        this.dni = dni;
        this.nombre = nombre;
        this.sip = sip;
        this.telefono = telefono;
        this.email = email;
    }
    // getters y setters


    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSip() {
        return sip;
    }

    public void setSip(String sip) {
        this.sip = sip;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void addVentas(Venta ventas){
        this.ventas.add(ventas);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", sip='" + sip + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", ventas=" + ventas +
                '}';
    }
}
