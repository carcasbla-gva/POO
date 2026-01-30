package animales;

public class Entrenador {

    public void entrenar(Jugar animalQueSabeJugar) {
        animalQueSabeJugar.saltarPorUnAro();
    }
    public void dejarEntrar (Animal animal){
        if (animal instanceof Jugar){
            System.out.println("Pasa y te entreno");
        }else{
            throw new IllegalArgumentException(animal.getClass().getName() + " no implementa la interfaz Jugar");

        }
    }
}
