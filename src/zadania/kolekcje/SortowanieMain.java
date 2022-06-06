package zadania.kolekcje;

import java.util.*;

public class SortowanieMain {

    public static void main(String[] args) {
        List<String> napisy = Arrays.asList("Drzewo", "Pies", "Kot", "Kosmos", "Ala");

        System.out.println(napisy);

        Collections.sort(napisy);
        System.out.println(napisy);

        List<User> users = new ArrayList<>();
        users.add(new User("Adam", "Skutnik", 30));
        users.add(new User("Kasia", "Nowak", 21));
        users.add(new User("Kasia", "Pogrzebniak", 20));

        System.out.println(users);
        System.out.println(users);

        User adam = new User("Adam", "Skutnik", 30);
        User kasia = new User("Kasia", "Nowak", 21);
        System.out.println(adam.compareTo(kasia));

        List<Drzewo> drzewa = new ArrayList<>();
        drzewa.add(new Drzewo(10,20, 2));
        drzewa.add(new Drzewo(12,20, 2));
        drzewa.add(new Drzewo(8,20, 2));


        Comparator<Drzewo> comparator = new Comparator<>() {
            @Override
            public int compare(Drzewo o1, Drzewo o2) {
                return o1.getWiek().compareTo(o2.getWiek());
            }
        };
        Collections.sort(drzewa, comparator);

        System.out.println(drzewa);

    }
}