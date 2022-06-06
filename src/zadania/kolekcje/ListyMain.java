package zadania.kolekcje;

import java.util.*;

public class ListyMain {

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(5);
        lista.add(3);
        lista.add(20);
        lista.add(-1);
        lista.add(-1);
        System.out.println(lista);

        lista.add(2,100);
        System.out.println(lista);

        Collections.swap(lista, 0, 1);

        System.out.println(lista);
        System.out.println("Element o indeksie 2 to: " + lista.get(2));
        System.out.println("Dlugość listy to " + lista.size());
    }
}

