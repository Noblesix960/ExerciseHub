package TracceEsame;

public class Veicolo {
    // Dichiaro gli attributi della classe Veicolo
    private String targa;
    private String marca;

    // Definisco il costruttore
    public Veicolo(String targa, String marca) {
        this.targa = targa;
        this.marca = marca;
    }

    // Creo i metodi Get
    public String getTarga() {
        return targa;
    }

    public String getMarca() {
        return marca;
    }

}
