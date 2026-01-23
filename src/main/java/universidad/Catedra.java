package universidad;

public class Catedra {
    private String nom_catedra;
    private Departamentos departamentos;
    private Facultad facultad;

    public Catedra(String nom_catedra) {
        this.nom_catedra = nom_catedra;
    }

    public String getNom_catedra() {
        return nom_catedra;
    }

    public void setNom_catedra(String nom_catedra) {
        this.nom_catedra = nom_catedra;
    }
}
