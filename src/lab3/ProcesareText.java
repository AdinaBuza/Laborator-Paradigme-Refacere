package lab3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ProcesareText {

    public List<String> citesteLinii(String numeFisier) throws IOException {
        String continut = Files.readString(Paths.get(numeFisier));
        String[] liniiArray = continut.split("\\r?\\n");
        return new ArrayList<>(List.of(liniiArray));
    }
    public List<String> adaugaRandExtra(List<String> linii) {
        List<String> rezultat = new ArrayList<>();
        for (String linie : linii) {
            rezultat.add(linie + "\n");
        }


        return rezultat;
    }

    public List<String> adaugaRandDupaPunct(List<String> linii) {
        List<String> rezultat = new ArrayList<>();
        for (String linie : linii) {
            rezultat.add(linie.replace(".", ".\n"));
        }

        return rezultat;
    }

    public void salveazaInFisier(String numeFisier, List<String> date) throws IOException {
        Files.write(Paths.get(numeFisier), date);
    }
}