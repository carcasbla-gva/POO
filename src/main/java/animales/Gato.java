package animales;

final public class Gato extends Mamifero implements Jugar {
    Gato(String nombre){
        super(nombre);
    }
    public void perseguirUnOvillo(){
        System.out.println("Presequir un Ovillo");
    }
    @Override
    public void comunicarse()
    {
        super.comunicarse();
        System.out.println("Miau");
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
