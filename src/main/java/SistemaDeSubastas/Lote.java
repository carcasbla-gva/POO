package SistemaDeSubastas;

import java.util.ArrayList;
import java.util.List;

public class Lote {
    private String numero;
    private String precioDeSalida;
    private List<Subasta> subastas = new ArrayList<>();
    private List<Articulo> articulos = new ArrayList<>();

    public Lote(String numero, String precioDeSalida) {
        this.numero = numero;
        this.precioDeSalida = precioDeSalida;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getPrecioDeSalida() {
        return precioDeSalida;
    }

    public void setPrecioDeSalida(String precioDeSalida) {
        this.precioDeSalida = precioDeSalida;
    }

    public List<Subasta> getSubastas() {
        return subastas;
    }

    public void setSubastas(List<Subasta> subastas) {
        this.subastas = subastas;
    }

    public List<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(List<Articulo> articulos) {
        this.articulos = articulos;
    }

    public void addSubastas(Subasta subastas){
        this.subastas.add(subastas);
    }

    public void addArticulos(Articulo articulos){
        this.articulos.add(articulos);
    }

    @Override
    public String toString() {
        return "Lote{" +
                "numero='" + numero + '\'' +
                ", precioDeSalida='" + precioDeSalida + '\'' +
                '}';
    }
}
