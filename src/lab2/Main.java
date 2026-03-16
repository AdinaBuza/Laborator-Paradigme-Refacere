package lab2;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Student> setStudenti = new HashSet<>();

        setStudenti.add(new Student(120, "Alis", "Popa", "TI21/2"));
        setStudenti.add(new Student(101, "Andrei", "Ionescu", "TI21/1"));
        setStudenti.add(new Student(105, "Elena", "Vasile", "TI21/2"));

        System.out.println("Lista de studenti (Set) ");
        for (Student s : setStudenti) {
            System.out.println(s);
        }

        Student cautat1 = new Student(120, "Alis", "Popa", "TI21/2");
        Student cautat2 = new Student(112, "Maria", "Popa", "TI21/1");

        System.out.println("\nb) Studentul Alis este prezent? " + setStudenti.contains(cautat1));
        System.out.println("c) Studentul Maria este prezent? " + setStudenti.contains(cautat2));
    }
}