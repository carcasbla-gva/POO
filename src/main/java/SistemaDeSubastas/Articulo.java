package SistemaDeSubastas;

public class Articulo {
    private String nombre;
    private String fecha;
    private Lote lote;

    public Articulo(String nombre, String fecha, Lote lote) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.lote = lote;
       this.lote.getArticulos().add(this);
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

    public Lote getLote() {
        return lote;
    }

    public void setLote(Lote lote) {
        this.lote = lote;
    }



    @Override
    public String toString() {
        return "Articulo{" +
                "nombre='" + nombre + '\'' +
                ", fecha='" + fecha + '\'' +
                '}';
    }
}
