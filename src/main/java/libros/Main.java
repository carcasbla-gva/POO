package libros;

public class Main {
    public static void main(String[] args) {
        Tema t = new Tema("Caballerías");
        Autor a = new Autor("Cervantes", 2007);
        Libro l = new Libro("El Quijote", a, 618);
        l.addTema(t);
    }
}
