package AplicacionPropia.farmacia;

import java.util.ArrayList;
import java.util.List;

public class Venta {
    private int id;
    private double fechaHora;
    private double importe;
    private Cliente cliente;
    private List<DetalleDeVenta> ventas = new ArrayList<>();

    // constructor
    public Venta(int id, double fechaHora, double importe, Cliente cliente) {
        this.id = id;
        this.fechaHora = fechaHora;
        this.importe = importe;
        this.cliente = cliente;
    }
    // getters y setters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(double fechaHora) {
        this.fechaHora = fechaHora;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void addVentas(DetalleDeVenta ventas){
        if (ventas.getCantidad() > 0)
            this.ventas.add(ventas);
    }

    public void setVentas(List<DetalleDeVenta> ventas) {
        this.ventas = ventas;
    }

    @Override
    public String toString() {
        return "Venta{" +
                "id=" + id +
                ", fechaHora=" + fechaHora +
                ", importe=" + importe +
                ", cliente=" + cliente +
                ", ventas=" + ventas +
                '}';
    }
}
