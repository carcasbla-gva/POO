package AplicacionPropia.farmacia;

public class Parafarmacia extends Producto{
    private String categoria;
    private int mililitros;
    private boolean hipoalergico;

    //herencia
    public Parafarmacia(int id,String nombre, String fabricante, double precio, int stock ) {
        super(id,nombre, fabricante, precio, stock,);
    }

    //constructor
    public Parafarmacia(String nombre, String categoria, int mililitros, boolean hipoalergico) {
        super(nombre);
        this.categoria = categoria;
        this.mililitros = mililitros;
        this.hipoalergico = hipoalergico;
    }
    // getters y setters

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getMililitros() {
        return mililitros;
    }

    public void setMililitros(int mililitros) {
        this.mililitros = mililitros;
    }

    public boolean isHipoalergico() {
        return hipoalergico;
    }

    public void setHipoalergico(boolean hipoalergico) {
        this.hipoalergico = hipoalergico;
    }

    @Override
    public String toString() {
        return "Parafarmacia{" +
                "categoria='" + categoria + '\'' +
                ", mililitros=" + mililitros +
                ", hipoalergico=" + hipoalergico +
                '}';
    }
}
