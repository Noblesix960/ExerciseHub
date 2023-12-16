package Exercise1;

public class Veicolo {
    // Dichiaro gli attributi della classe Veicolo
    private String targa;
    private String marca;

    // Definisco il costruttore
    public Veicolo(String targa, String marca) {
        this.targa = targa;
        this.marca = marca;
    }

    // Definisco i metodi Get
    public String getTarga() {
        return targa;
    }

    public String getMarca() {
        return marca;
    }

    // Definisco i metodi Set
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

}
