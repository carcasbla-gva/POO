package universidad;

import java.util.ArrayList;
import java.util.List;

public class Facultad {
    String nom_facultad;
    List<Catedra> catedras = new ArrayList<>();

    public Facultad(String nom_facultad, List catedras) {
        this.nom_facultad = nom_facultad;
        this.catedras = catedras;
    }

    public String getNom_facultad() {
        return nom_facultad;
    }

    public void setNom_facultad(String nom_facultad) {
        this.nom_facultad = nom_facultad;
    }

    public void addCatedras(Catedra catedras){
        this.catedras.add(catedras);
    }
}
