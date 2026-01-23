class Cuenta{
    String nombre;
    double cantidad;

    public Cuenta(String nombre) {
        this.nombre = nombre;
    }

    public Cuenta(String nombre, double cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public void ingresar(int cantidad){
        if (cantidad > 0)
            this.cantidad += cantidad;
    }

    public void retirar(int cantidad){
        if (this.cantidad >= cantidad)
            this.cantidad -= cantidad;
    }

    @Override
    public String toString(){
        return this.nombre + " - " + this.nombre;
    }

}
public class MainCuenta {
    public static void main(String[] args) {
        Cuenta Jordi = new Cuenta("Jordi", 300);
        Jordi.ingresar(200);
        Jordi.retirar(100);
        System.out.println(Jordi);
        Cuenta Victor = new Cuenta("Victor");
        Victor.ingresar(300);
        Victor.retirar(100);
    }
}
