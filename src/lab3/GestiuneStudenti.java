package lab3;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class GestiuneStudenti {
    public static void main(String[] args) throws IOException {
        Path pathIn = Paths.get("studenti_in.txt");
        List<String> linii = Files.readAllLines(pathIn);
        List<Student> listaStudenti = new ArrayList<>();

        for (String linie : linii) {
            String[] bucati = linie.split(",");
            if (bucati.length == 4) {
                listaStudenti.add(new Student(
                        Integer.parseInt(bucati[0]),
                        bucati[1],
                        bucati[2],
                        bucati[3]
                ));
            }
        }

        listaStudenti.sort(
                Comparator.comparing(Student::getFormatieDeStudiu)
                        .thenComparing(Student::getNume)
        );

        List<String> deSalvat = new ArrayList<>();
        for (Student s : listaStudenti) {
            deSalvat.add(s.toString());
        }

        Files.write(Paths.get("studenti_out_sorted.txt"), deSalvat);

        System.out.println("Procesare finalizată. Verifică studenti_out_sorted.txt");
    }
}