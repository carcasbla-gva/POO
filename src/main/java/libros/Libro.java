package libros;

import javax.swing.plaf.PanelUI;
import java.util.ArrayList;
import java.util.List;

public class Libro {
    String titulo;
    Autor autor;
    int paginas;
    List<Tema> temas = new ArrayList<>();

    public Libro(String titulo, Autor autor, int paginas, List<Tema> temas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.temas = temas;
    }

    public Libro(String titulo, Autor autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public List<Tema> getTemas() {
        return temas;
    }

    public void setTemas(List<Tema> temas) {
        this.temas = temas;
    }

    public void addTema(Tema tema){
        this.temas.add(tema);
    }
    @Override
    public String toString(){
        return this.titulo + " - " + this.paginas;
    }

}
