package animales;

final public class Tiburon extends Pez implements Jugar{
    public Tiburon(String nombre){
        super(nombre);
    }
    @Override
    public void comunicarse()
    {
        System.out.println("Arqueo el cuerpo para comunicarme");
    }

    @Override
    public void respirar()
    {
        System.out.println("Respiro con branquias");
    }

    @Override
    public void moverse(){
        System.out.println("Me muevo nadando");
    }
    @Override
    public void saltarPorUnAro(){
        System.out.println("Sé saltar por aro");
    }


    @Override
    public void perseguirUnObjeto(){
        System.out.println("Sé perseguir una objeto");
    }

}

