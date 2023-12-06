package TracciaEsame16_10_2023;

import java.util.ArrayList;

public class Garage {

    public void stampaVeicoli(ArrayList<Veicolo> listaVeicoli) {

        // Creato un oggetto di tipo Auto per il confronto
        Auto obj = new Auto();

        for (Veicolo veicolo : listaVeicoli) {

            // Controllo la classe dell'oggetto veicolo e la confronto con la classe di obj
            if (veicolo.getClass().equals(obj.getClass())) {

                // Se entrambe sono uguali allora eseguo il downcasting eplicito
                obj = (Auto) veicolo;

                // e stampo l'attributo in più presente nella classe Auto
                System.out.println(veicolo.getMarca());
                System.out.println(obj.getModello());
                System.out.println(veicolo.getTarga());
                System.out.println();
            } else {

                // Altrimenti stampo normalmente gli attributi della classe Veicolo
                System.out.println(veicolo.getMarca());
                System.out.println(veicolo.getTarga());
                System.out.println();
            }
        }
    }
}
