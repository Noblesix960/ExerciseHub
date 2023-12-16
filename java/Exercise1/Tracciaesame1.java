package Exercise1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;

// Traccia 16 Ottobre 2023

public class Tracciaesame1 {

    public static void main(String[] args) throws FileNotFoundException {
        // Inizializzo i due oggetti Veicolo da aggiungere nella ArrayList di veicoli
        Veicolo punto = new Auto("DG036DY", "Fiat", "Punto");
        Veicolo passat = new Veicolo("EG067TY", "Volkswagen");

        ArrayList<Veicolo> listaVeicoli = new ArrayList<>();

        // Aggiungo i veicoli alla lista
        listaVeicoli.add(punto);
        listaVeicoli.add(passat);

        Garage mioGarage = new Garage();
        mioGarage.stampaVeicoli(listaVeicoli);

        ArrayList<Auto> listaAuto = new ArrayList<>();

        // Creo una stringa dove metto il percorso del file
        String file = "TracciaEsame1/veicoli.csv";
        // Mi creo un reader per leggere man mano le righe nel file
        BufferedReader reader = null;
        // Inizializzo una variabile per lo storage della riga corrente
        String currentLine = "";
        int count = 0, firstline = 0;

        System.out.println("Lista Auto: ");

        try {
            // Istanzio reader per poter leggere le righe del file
            reader = new BufferedReader(new FileReader(file));

            // Faccio while dove scorro tutto il file leggendo riga per riga
            while ((currentLine = reader.readLine()) != null) {
                Auto auto = new Auto();
                // Inizializzo un array di stringhe dove dopo la prima riga conterrà dei valori
                // da inserire negli attributi dell'oggetto auto
                String[] row = currentLine.split(",");

                // In base alla posizione capisco a quale attributo mi riferisco
                for (String string : row) {
                    if (firstline == 1) {

                        switch (count) {
                            case 0:
                                auto.setTarga(string);
                                count++;
                                break;

                            case 1:
                                auto.setMarca(string);
                                count++;
                                break;

                            case 2:
                                auto.setModello(string);
                                count = 0;
                                break;
                        }
                    }
                }
                // Controllo di aver già superato la prima riga
                if (firstline == 1) {
                    // Aggiungo la nuova auto alla lista di auto
                    listaAuto.add(auto);
                }
                // Dopo aver eseguito il ciclo (for) per la prima volta vuol dire che ho
                // superato la prima riga
                firstline = 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // Stampo la lista di auto dopo aver eseguito un override al metodo .toString
        // della classe Auto
        for (Auto auto : listaAuto) {
            System.out.print(auto.toString());
        }

        // Dichiaro due oggetti di tipo Auto da mettere all'interno dell'ArrayList<Auto>
        // da sortare
        Auto panda = new Auto("EM000MP", "Fiat", "Panda");
        Auto cinquecento = new Auto("WE345PO", "Fiat", "Cinquecento");

        // Popolamento dell'ArrayList
        listaAuto.add(panda);
        listaAuto.add(cinquecento);

        ordinaAuto(listaAuto);

        System.out.println("\nLista Auto 2 (Ordinata): ");
        for (Auto auto : listaAuto) {
            System.out.print(auto.toString());
        }
    }

    // TODO: Da commentare bene e capire meglio
    public static void ordinaAuto(ArrayList<Auto> listaAuto) {
        listaAuto.sort(new Comparator<Auto>() {
            public int compare(Auto a1, Auto a2) {
                return a1.getModello().compareTo(a2.getModello());
            }
        });
    }
}
