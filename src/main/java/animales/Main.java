package animales;

public class Main {
    public static void main(String[] args) {
        Perro p = new Perro("Toby");
        p.comunicarse();
        p.moverse();
        Gato g = new Gato("Tommy");
        g.comunicarse();
        g.moverse();
        Tiburon t = new Tiburon("Jordi");
    }
}
