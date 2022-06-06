package udemy.dziedziczenie;

import udemy.dziedziczeniePotwory.Potwor;
import udemy.dziedziczeniePotwory.Szkielet;
import udemy.dziedziczeniePotwory.Zombie;

public class Dziedziczenie {

    public static void main(String[] args) {

        Potwor p = new Potwor(10, 100);
        System.out.println(p.predkoscChodzenia);

        Szkielet s = new Szkielet(20, 50, "łuk");
        System.out.println(s.predkoscChodzenia);

        Zombie z = new Zombie();

    }
}
