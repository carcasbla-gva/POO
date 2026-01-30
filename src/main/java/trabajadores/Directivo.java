package trabajadores;

final public class Directivo extends Empleado {
    Directivo(String nombre){
        super(nombre);
    }
    @Override
    public String toString(){
        super.toString();
        return "Directivo";
    }
}
