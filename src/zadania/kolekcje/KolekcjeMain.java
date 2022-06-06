package zadania.kolekcje;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class KolekcjeMain {

    public static void main(String[] args) {
        Set<String> zbior = new TreeSet<>();
        zbior.add("Ala");
        if(zbior.contains("Kasia")){
            System.out.println("Kasia nie ma");
        }
        zbior.add("Kasia");
        if(zbior.contains("Kasia")){
            System.out.println("Kasia jest na wakacjach");
        }
        zbior.add("Monika");
        zbior.add("Marta");
        zbior.add("Kasia");
        zbior.addAll(Arrays.asList("Jacek", "Placek"));

        for (String element : zbior) {
            System.out.println(element);
        }


    }
}