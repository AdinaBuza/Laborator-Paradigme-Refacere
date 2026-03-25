import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> varste = new HashMap<>();
        varste.put("Ioan", 21);
        varste.put("Maria", 22);
        varste.put("Victor", 20);
        varste.put("Simina", 20);
        varste.put("Marius", 21);
        varste.put("Mihai", 21);
        varste.put("Daniela", 23);

        Map<String, String> adrese = Map.of(
                "Ioan", "Sibiu",
                "Maria", "Bucuresti",
                "Victor", "Cluj",
                "Simina", "Alba-Iulia",
                "Marius", "Medias",
                "Mihai", "Cisnadie",
                "Daniela", "Sibiu"
        );

        varste.put("Vlad", 19);
        varste.put("Iulia", 19);

        HashMap<String, Tanar> tineri = new HashMap<>();

        for (Map.Entry<String, Integer> entry : varste.entrySet()) {
            String nume = entry.getKey();
            Integer varsta = entry.getValue();
            String adresa = adrese.get(nume);

            tineri.put(nume, new Tanar(nume, varsta, adresa));
        }

        System.out.println(" Lista Tineri  ");
        tineri.values().stream().forEach(t -> System.out.println(t));

        System.out.println("\n Detalii complete  ");
        for (Map.Entry<String, Tanar> entryObj : tineri.entrySet()) {
            System.out.println("Cheie: " + entryObj.getKey() + " -> " + entryObj.getValue());
        }
    }
}