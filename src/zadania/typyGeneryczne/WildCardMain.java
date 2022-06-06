package zadania.typyGeneryczne;

import java.util.List;

public class WildCardMain {

    public static void main(String[] args) {
        Pies pies = new Pies();

        List<Integer> lista1 = List.of(1,2,4);
        List<Double> lista2 = List.of(2.2, 4.0, 5.1);

        pies.setWynik(lista1);
        System.out.println(pies);

        pies.setWynik(lista2);
        System.out.println(pies);
    }
}
