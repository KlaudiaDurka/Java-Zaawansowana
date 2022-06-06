package zadania.wzorceKonstrukcyjne;

import java.util.ArrayList;
import java.util.List;

public class CopyMain {

    public static void main(String[] args) throws CloneNotSupportedException {
        Pomieszczenie pomieszczenie1 = new Pomieszczenie("kuchnia");
        Pomieszczenie pomieszczenie2 = new Pomieszczenie("pokoj");

        Dom dom = new Dom("Warszawa", 2, new ArrayList<>(List.of(pomieszczenie1, pomieszczenie2)));

        Dom dom2 = dom.clone(); //robi nowy obiekt
        dom2.setLiczbaPieter(5);

        System.out.println(dom);
        System.out.println(dom2);

        System.out.println("Czy obiekty są tym samym obiektem " + (dom == dom2));
        System.out.println(dom.getPomieszczenia().get(0) == dom2.getPomieszczenia().get(0) );

        dom.getPomieszczenia().add(new Pomieszczenie("lazienka"));

        System.out.println(dom);
        System.out.println(dom2);
    }
}
