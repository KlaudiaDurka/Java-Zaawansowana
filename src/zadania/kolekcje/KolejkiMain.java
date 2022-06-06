package zadania.kolekcje;

import java.util.ArrayDeque;
import java.util.Queue;

public class KolejkiMain {

    public static void main(String[] args) {
        Queue<Integer> kolejka = new ArrayDeque<>();
        kolejka.add(1);
        kolejka.add(2);
        kolejka.add(4);
        kolejka.add(-2);

        for(int i=0;i<4;i++){
            Integer element = kolejka.poll();
            System.out.println(element);
        }

        System.out.println("Koleka to: " + kolejka);

//        System.out.println(kolejka.poll());
//        System.out.println(kolejka);

    }
}
