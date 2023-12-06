package Exercise1;

import java.util.ArrayList;
import java.util.Comparator;

// Traccia 16 Ottobre 2023

public class Tracciaesame1 {
    public static void main(String[] args) {
        
        // Inizializzo i due oggetti Veicolo da aggiungere nella ArrayList di veicoli
        Veicolo punto = new Auto("DG036DY", "Fiat", "Punto");
        Veicolo passat = new Veicolo("EG067TY", "Wolkswagen");

        ArrayList<Veicolo> listaVeicoli = new ArrayList<Veicolo>();

        // Aggiungo i veicoli alla lista
        listaVeicoli.add(punto);
        listaVeicoli.add(passat);


        Garage mioGarage = new Garage();
        mioGarage.stampaVeicoli(listaVeicoli);

        // Dichiaro due oggetti di tipo Auto da mettere all'interno dell'ArrayList<Auto> da sortare
        Auto panda = new Auto("EM000MP", "Fiat", "Panda");
        Auto cinquecento = new Auto("WE345PO", "Fiat", "Cinquecento");

        // Dichiarazione e popolamento dell'ArrayList
        ArrayList<Auto> listaAuto = new ArrayList<Auto>();
        listaAuto.add((Auto)punto);
        listaAuto.add(panda);
        listaAuto.add(cinquecento);

        ordinaAuto(listaAuto);

        System.out.println(listaAuto);
    }

    // TODO: Da commentare bene e capire meglio
    public static void ordinaAuto(ArrayList<Auto> listaAuto){
        listaAuto.sort(new Comparator<Auto>(){
            public int compare(Auto a1, Auto a2){
                return a1.getModello().compareTo(a2.getModello());
            }
        });
    }
}
