package bancos;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    String n_ent;
    List<Sucursal> sucursales = new ArrayList<>();

    public Banco(String n_ent, List<Sucursal> sucursales) {
        this.n_ent = n_ent;
        this.sucursales = sucursales;
    }

    public String getN_ent() {
        return n_ent;
    }

    public void setN_ent(String n_ent) {
        this.n_ent = n_ent;
    }

    public List<Sucursal> getSucursales() {
        return sucursales;
    }

    public void setSucursales(List<Sucursal> sucursales) {
        this.sucursales = sucursales;
    }

    public void addSucursal(Sucursal sucursal){
        this.sucursales.add(sucursal);
    }

}
