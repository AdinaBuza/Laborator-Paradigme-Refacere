package lab3;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class GestiuneStudenti {
    public static void main(String[] args) throws IOException {
        // 1. CITIREA
        Path pathIn = Paths.get("studenti_in.txt");
        List<String> linii = Files.readAllLines(pathIn);
        List<Student> listaStudenti = new ArrayList<>();

        for (String linie : linii) {
            String[] bucati = linie.split(",");
            if (bucati.length == 4) {
                Student s = new Student(Integer.parseInt(bucati[0]), bucati[1], bucati[2], bucati[3]);
                listaStudenti.add(s);
            }
        }

        System.out.println(" Studenți citiți din fișier ");
        listaStudenti.forEach(System.out::println);

        listaStudenti.sort(Comparator.comparing(Student::getNume));

        List<String> deSalvat = new ArrayList<>();
        for (Student s : listaStudenti) {
            deSalvat.add(s.toString());
        }

        Files.write(Paths.get("studenti_out.txt"), deSalvat);
        System.out.println("\nSucces! Studenții sortați au fost salvați în studenti_out.txt.");
    }
}