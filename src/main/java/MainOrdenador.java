class Ordenador {
    private String memoria;
    private String Procesador;
    private String marca;
    private String placaBase;
    private String tarjetaGrafica;
    private String puertos;
    private String fuenteDeAliemnatcion;
    private String discoDuro;

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public String getProcesador() {
        return Procesador;
    }

    public void setProcesador(String procesador) {
        Procesador = procesador;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlacaBase() {
        return placaBase;
    }

    public void setPlacaBase(String placaBase) {
        this.placaBase = placaBase;
    }

    public String getTarjetaGrafica() {
        return tarjetaGrafica;
    }

    public void setTarjetaGrafica(String tarjetaGrafica) {
        this.tarjetaGrafica = tarjetaGrafica;
    }

    public String getPuertos() {
        return puertos;
    }

    public void setPuertos(String puertos) {
        this.puertos = puertos;
    }

    public String getFuenteDeAliemnatcion() {
        return fuenteDeAliemnatcion;
    }

    public void setFuenteDeAliemnatcion(String fuenteDeAliemnatcion) {
        this.fuenteDeAliemnatcion = fuenteDeAliemnatcion;
    }

    public String getDiscoDuro() {
        return discoDuro;
    }

    public void setDiscoDuro(String discoDuro) {
        this.discoDuro = discoDuro;
    }

    public Ordenador(String memoria, String procesador, String marca, String placaBase, String tarjetaGrafica, String puertos, String fuenteDeAliemnatcion, String discoDuro) {
        this.memoria = memoria;
        Procesador = procesador;
        this.marca = marca;
        this.placaBase = placaBase;
        this.tarjetaGrafica = tarjetaGrafica;
        this.puertos = puertos;
        this.fuenteDeAliemnatcion = fuenteDeAliemnatcion;
        this.discoDuro = discoDuro;
    }

    public class MainOrdenador {
        public static void main(String[] args) {

        }
    }
}


