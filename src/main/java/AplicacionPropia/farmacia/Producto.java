package AplicacionPropia.farmacia;

import java.util.ArrayList;
import java.util.List;

abstract public class Producto {
    private int id;
    private String nombre;
    private String fabricante;
    private double precio;
    private int stock;
    private Laboratorio laboratorio;
    private List<DetalleDeVenta> ventas = new ArrayList<>();

    // constructor
    public Producto(String nombre) {
        this.nombre = nombre;
    }
    public Producto(int id, String nombre, String fabricante, double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.fabricante = fabricante;
        this.precio = precio;
        this.stock = stock;
    }

    // getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Laboratorio getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(Laboratorio laboratorio) {
        this.laboratorio = laboratorio;
    }

    public void addVentas(DetalleDeVenta ventas){
        this.ventas.add(ventas);
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                ", laboratorio=" + laboratorio +
                '}';
    }
}
