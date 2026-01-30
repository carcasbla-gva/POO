package animales;

final public class Perro extends Mamifero {
    Perro(String nombre){
        super(nombre);
    }
    public void traerZapatillas(){
        System.out.println("Toma amo tus zapatillas");
    }
    @Override
    public void comunicarse(){
        System.out.println("Guau");
    }
    public void moverse(){
        System.out.println("Me muevo a 4 patas");
    }
}
