package zadania.typyGeneryczne;

import java.util.ArrayList;
import java.util.List;

public class TypyGeneryczneMain {

    public static void main(String[] args) {
        Water<String> wodaNapis = new Water<>();
        wodaNapis.setValue("Woda mineralna");
        System.out.println(wodaNapis);

        Water<Integer> wodaLiczba = new Water<>();
        wodaLiczba.setValue(13);
        System.out.println(wodaLiczba);

        Water<List<String>> wodaLista = new Water<>();
        wodaLista.setValue(new ArrayList<>());

        Coffiee<String, Integer> coffie = new Coffiee<>();
        coffie.setValue("Kawa");
        coffie.setElement(50);
        System.out.println(coffie);

        Coffiee<String, Water<String>> coffie2 = new Coffiee<>();
        coffie2.setValue("Kawa 2");
        coffie2.setElement(wodaNapis);
        System.out.println(coffie2);


        Kundel kundel = new Kundel();
        kundel.setWartosc("Rasa psa kundel");
        System.out.println(kundel);

        York<Integer> york = new York<>();
        york.setWartosc(100);
        System.out.println(york);
    }
}
