package tracciaOnePiece;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**
 * OnePiece
 */
public class OnePiece {

    public static void main(String[] args) throws IOException {
        // Salvo il percorso del file come Stringa
        String filePathName = "tracciaOnePiece/onepiece.csv";
        // Definisco un reader che utilizzerò per leggere il file
        BufferedReader reader = null;
        // Ed una stringa line per lo storage delle righe che leggo da file
        String line = "";

        // Con "firstLine" creo una flag per capire se mi trovo alla prima riga o meno
        boolean firstLine = true;
        // Utilizzo queste due variabili per contare tutte le righe del file ed
        // escludere le ultime due
        int lineCount = 0;
        int totalLines = countTotalLines(filePathName);
        // Inizializzo un ArrayList dove inserire tutti oggetti di classe Pirata ottenuti dal file
        ArrayList<Pirata> listaPirati = new ArrayList<Pirata>();

        try {

            reader = new BufferedReader(new FileReader(filePathName));
            while ((line = reader.readLine()) != null) {

                lineCount++;
                if (lineCount < totalLines - 1) {
                    if (!firstLine) {
                        String[] currentLine = line.split(",");
                        String nomeOriginale = currentLine[0];
                        String soprannome = currentLine[1];
                        String ruolo = currentLine[2];
                        String sesso = currentLine[3];
                        int eta;
                        if (currentLine[4].equalsIgnoreCase("Unknown")) {
                            eta = -1;
                        } else {
                            eta = Integer.parseInt(currentLine[4]);
                        }
                        String altezza = currentLine[5];
                        long taglia = parseTaglia(currentLine[6]);

                        Pirata pirata = new Pirata(nomeOriginale, soprannome, ruolo, sesso, eta, altezza, taglia);
                        listaPirati.add(pirata);
                    }
                    firstLine = false;
                }
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

        // Stampo a video una tabella dei personaggi
        for (Pirata pirata : listaPirati) {
            System.out.println(pirata);
        }

        // Stampo su file solo i personaggi maschi (male)
        FileWriter writer = new FileWriter("tracciaOnePiece/male_op.csv");

        for (Pirata pirata : listaPirati) {
            if (pirata.getSesso().equals("Male")) {
                writer.write(pirata.toString());
                writer.write('\n');
            }
        }
        writer.close();
        // Stampo su file tutti i personaggi ordinati per taglia descrescente
        Collections.sort(listaPirati);
        writer = new FileWriter("tracciaOnePiece/big_bounty.txt");
        for (Pirata pirata : listaPirati) {
            writer.write(pirata.toString());
            writer.write("\n");
        }
        writer.close();
    }

    private static long parseTaglia(String taglia) {
        // Rimuovi spazi, punti e "Berries", quindi converte la stringa in long
        try {
            return Long.parseLong(taglia.replaceAll("[\\s.Berries]+", ""));
        } catch (NumberFormatException e) {
            // Se la conversione fallisce, restituisci un valore di default (ad es.
            // Long.MIN_VALUE)
            return Long.MIN_VALUE;
        }
    }

    private static int countTotalLines(String filePathName) throws IOException {

        int lines = 0;
        try {

            BufferedReader counter = new BufferedReader(new FileReader(filePathName));
            while (counter.readLine() != null) {

                lines++;
            }
            counter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return lines;
    }
}