package AplicacionPropia.farmacia;

public class Medicamento extends Producto{
    private String principioActivo;
    private String composicion;
    private boolean requiereReceta = true;
    private String prestacion;
    private Receta receta;

    // herencia
    public Medicamento(int id, String nombre, String fabricante, double precio, int stock ) {
        super(id,nombre, fabricante, precio, stock,);
    }
    // constructor
    public Medicamento(String nombre, String principioActivo, String composicion, boolean requiereReceta, String prestacion, Receta receta) {
        super(nombre);
        this.principioActivo = principioActivo;
        this.composicion = composicion;
        this.requiereReceta = requiereReceta;
        this.prestacion = prestacion;
        this.receta = receta;
        this.receta.addMedicamentos(this);
    }
    // getters y setters

    public String getPrincipioActivo() {
        return principioActivo;
    }

    public void setPrincipioActivo(String principioActivo) {
        this.principioActivo = principioActivo;
    }

    public String getComposicion() {
        return composicion;
    }

    public void setComposicion(String composicion) {
        this.composicion = composicion;
    }

    public boolean isRequiereReceta() {
        return requiereReceta;
    }

    public void setRequiereReceta(boolean requiereReceta) {
        this.requiereReceta = requiereReceta;
    }

    public String getPrestacion() {
        return prestacion;
    }

    public void setPrestacion(String prestacion) {
        this.prestacion = prestacion;
    }

    @Override
    public String toString() {
        return "Medicamento{" +
                "principioActivo='" + principioActivo + '\'' +
                ", composicion='" + composicion + '\'' +
                ", requiereReceta=" + requiereReceta +
                ", prestacion='" + prestacion + '\'' +
                '}';
    }
}
