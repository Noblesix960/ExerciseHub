package TracciaEsame16_10_2023;

// Deve implementare interfaccia Comparable di tipo Auto 
public class Auto extends Veicolo implements Comparable<Auto> {

    // Aggiungo un attributo "modello"
    private String modello;

    // In questo costruttore è necessario specificare i paramtetri anche per il
    // costruttore della sua superclasse
    public Auto(String targa, String marca, String modello) {
        super(targa, marca);
        this.modello = modello;

    }

    // Costruttore senza parametri
    public Auto() {
        super("", "");
        modello = "";
    }

    // Metodo getModello per prendere il modello dell'istanza dell'oggetto
    public String getModello() {
        return modello;
    }

    // Metodo setModello per impostare il modello dell'istanza dell'oggetto
    public void setModello(String modello) {
        this.modello = modello;
    }

    // Dall'interfaccia Comparable ridefiniamo compareTo(Auto obj)
    // [lo definiamo per il tipo Auto]
    @Override
    public int compareTo(Auto auto) {

        // Ritorna un intero negativo se modello viene prima in ordine alfabetico di
        // auto.modello
        // Ritorna zero se modello e auto.modello sono uguali
        // Ritorna un intero positivo se modello viene dopo in ordine alfabetico di
        // auto.modello
        return modello.compareTo(auto.modello);
        // Non è ricorsione ma il metodo compareTo è un metodo specifico per le stringhe
    }

    @Override
    public String toString() {
        return "[Modello]: " + modello + "[Marca]: " + this.getMarca() + "[Targa]: " + this.getTarga() + "\n";
    }

}
