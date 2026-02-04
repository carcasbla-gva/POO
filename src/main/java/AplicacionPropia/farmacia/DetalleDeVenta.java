package AplicacionPropia.farmacia;

public class DetalleDeVenta {
    private int id;
    private int cantidad;
    private Producto producto;
    private Venta venta;

    // constructor
    public DetalleDeVenta(int id, int cantidad, Producto producto, Venta venta) {
        this.id = id;
        this.cantidad = cantidad;
        this.producto = producto;
        this.venta = venta;
        this.producto.addVentas(this);
        this.venta.addVentas(this);
    }
    // getters y setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    @Override
    public String toString() {
        return "DetalleDeVenta{" +
                "id=" + id +
                ", cantidad=" + cantidad +
                ", producto=" + producto +
                ", venta=" + venta +
                '}';
    }
}
