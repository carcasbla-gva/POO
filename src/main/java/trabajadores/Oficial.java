package trabajadores;

final public class Oficial extends Operario {
    Oficial(String nombre){
        super(nombre);
    }
    @Override
    public String toString(){
        super.toString();
        return "Oficial";
    }
}
