package lab3;

import java.util.Objects;

public class Student {
    Integer numarMatricol;
    String prenume;
    String nume;
    String formatieDeStudiu;

    public Student(Integer numarMatricol, String prenume, String nume, String formatieDeStudiu) {
        this.numarMatricol = numarMatricol;
        this.prenume = prenume;
        this.nume = nume;
        this.formatieDeStudiu = formatieDeStudiu;
    }

    // Getter pentru nume (necesar pentru sortare)
    public String getNume() {
        return nume;
    }

    @Override
    public String toString() {
        return numarMatricol + "," + prenume + "," + nume + "," + formatieDeStudiu;
    }
}