package lab2;

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

    @Override
    public String toString() {
        return "lab2.Student{" + "numarMatricol=" + numarMatricol + ", prenume='" + prenume + '\'' +
                ", nume='" + nume + '\'' + ", formatieDeStudiu='" + formatieDeStudiu + '\'' + '}';
    }
}