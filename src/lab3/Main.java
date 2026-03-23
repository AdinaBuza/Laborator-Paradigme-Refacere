package lab3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProcesareText procesor = new ProcesareText();


        try{

            List<String> liniiInitiale = procesor.citesteLinii("in.txt");

            List<String> rezultatA = procesor.adaugaRandExtra(liniiInitiale);
            System.out.println("Subpunctul A procesat ");

            List<String> rezultatB = procesor.adaugaRandDupaPunct(liniiInitiale);
            System.out.println("Subpunctul B procesat ");

            List<String> finalDeSalvat = new ArrayList<>();
            finalDeSalvat.add("REZULTAT A ");
            finalDeSalvat.addAll(rezultatA);
            finalDeSalvat.add("\n REZULTAT B ");
            finalDeSalvat.addAll(rezultatB);

            procesor.salveazaInFisier("out.txt", finalDeSalvat);

            System.out.println("\nSucces! Fișierul out.txt a fost generat.");

        } catch (IOException e) {
            System.out.println("Eroare la citirea sau scrierea fișierelor: " + e.getMessage());
        }
    }
}