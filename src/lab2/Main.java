package lab2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> listaStudenti = new ArrayList<>();

        listaStudenti.add(new Student(120, "Alis", "Popa", "TI21/2"));
        listaStudenti.add(new Student(101, "Andrei", "Ionescu", "TI21/1"));
        listaStudenti.add(new Student(105, "Elena", "Vasile", "TI21/2"));

        System.out.println(" Lista de studenti (afișată cu for-each) ");
        for (Student s : listaStudenti) {
            System.out.println(s);
        }

        Student cautat1 = new Student(120, "Alis", "Popa", "TI21/2");
        System.out.println("\nb) Studentul Alis este prezent? " + existaStudent(listaStudenti, cautat1));

        Student cautat2 = new Student(112, "Maria", "Popa", "TI21/1");
        System.out.println("c) Studentul Maria este prezent? " + existaStudent(listaStudenti, cautat2));
    }

    public static boolean existaStudent(List<Student> lista, Student studentCautat) {
        for (Student s : lista) {

            if (s.prenume.equals(studentCautat.prenume) &&
                    s.nume.equals(studentCautat.nume) &&
                    s.formatieDeStudiu.equals(studentCautat.formatieDeStudiu)) {
                return true;
            }
        }
        return false;
    }
}