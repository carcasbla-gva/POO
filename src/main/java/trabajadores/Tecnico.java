package trabajadores;

final public class Tecnico extends Operario {
    Tecnico(String nombre){
        super(nombre);
    }
    @Override
    public String toString(){
        super.toString();
        return "Tecnico";
    }

}
