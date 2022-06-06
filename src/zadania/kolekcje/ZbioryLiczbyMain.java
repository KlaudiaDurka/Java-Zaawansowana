package zadania.kolekcje;

import java.util.HashSet;
import java.util.Set;

public class ZbioryLiczbyMain {

    public static void main(String[] args) {
        Set<Integer> zbior = new HashSet<>();
        zbior.add(1);
        zbior.add(5);
        zbior.add(3);
        zbior.add(-10);
        zbior.add(100);
        int x = 4;
        zbior.add(x);
        for (Integer liczba : zbior){
            System.out.println(liczba);
        }
    }
}
