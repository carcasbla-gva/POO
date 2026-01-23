package universidad;

import java.util.ArrayList;
import java.util.List;

public class Departamentos {
    private String nom_dep;
    private AreaDeConocimiento area;
    List<Profesor> profesores = new ArrayList<>();
    List<Catedra> catedras = new ArrayList<>();

    public Departamentos(String nom_dep, AreaDeConocimiento area, List profesores, List catedras) {
        this.nom_dep = nom_dep;
        this.area = area;
        this.profesores = profesores;
        this.catedras = catedras;
    }

    public String getNom_dep() {
        return nom_dep;
    }

    public void setNom_dep(String nom_dep) {
        this.nom_dep = nom_dep;
    }

    public AreaDeConocimiento getArea() {
        return area;
    }

    public void setArea(AreaDeConocimiento area) {
        this.area = area;
    }

    public void addProfesores(Profesor profesores){
        this.profesores.add(profesores);
    }

    public void addCatedras(Catedra catedras){
        this.catedras.add(catedras);
    }

    @Override
    public String toString(){
        return this.nom_dep;
    }

}
