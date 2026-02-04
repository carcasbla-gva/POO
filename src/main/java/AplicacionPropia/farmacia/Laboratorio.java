package AplicacionPropia.farmacia;

import java.util.ArrayList;
import java.util.List;

public class Laboratorio {
    private int cif;
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;
    private List<Producto> productos = new ArrayList<>();

    // constructor
    public Laboratorio(int cif, String nombre, String direccion, String telefono, String email) {
        this.cif = cif;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    // getters y setters
    public int getCif() {
        return cif;
    }

    public void setCif(int cif) {
        this.cif = cif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public void addProductos(Producto productos){
        this.productos.add(productos);
    }

    @Override
    public String toString() {
        return "Laboratorio{" +
                "cif=" + cif +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
