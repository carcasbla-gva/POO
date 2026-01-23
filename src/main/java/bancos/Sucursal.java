package bancos;

import java.util.ArrayList;
import java.util.List;

public class Sucursal {
    String n_suc;
    Banco n_ent;
    List<CuentaCorriente> cuentas = new ArrayList<>();

    public Sucursal(String n_suc, Banco n_ent) {
        this.n_suc = n_suc;
        this.n_ent = n_ent;
    }
    public void addCuenta(CuentaCorriente cuenta){
        this.cuentas.add(cuenta);
    }

}
