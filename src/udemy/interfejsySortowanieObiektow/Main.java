package udemy.interfejsySortowanieObiektow;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        /*
        nazwaInterfejsu a = new Pracownik();

        // rzutowanie w dół
        ((Pracownik)a).getWynagrodzenie();

        System.out.println(nazwaInterfejsu.PI);
        */

        Pracownik[] pracownik = new Pracownik[3];
        pracownik[0] = new Pracownik(10000);
        pracownik[1] = new Pracownik(5000);
        pracownik[2] = new Pracownik(12000);

        Arrays.sort(pracownik);

        // sortowanie odwrotne
        // Arrays.sort(pracownik, Collections.reverseOrder());

        int[] tab = new int[3];
        tab[0] = 3;
        tab[1] = -5;
        tab[2] = 13;

        Arrays.sort(tab);

        System.out.println(tab[0]);
        System.out.println(pracownik[0].getWynagrodzenie());
    }

    interface nazwaInterfejsu{

        double PI = 3.14; // public static final

        void metoda(); // public abstract
    }

    interface nazwaInterfejsu2{

    }

    // rozszerzać możemy max jedną klasę, interfejsy bez ograniczeń (wielodziedziczenie)
    static class Pracownik implements nazwaInterfejsu, nazwaInterfejsu2{


        @Override
        public void metoda() {

        }

        private double wynagrodzenie;
        public double getWynagrodzenie(){

            return this.wynagrodzenie;
        }

        Pracownik(double wynagrodzenie){
            this.wynagrodzenie = wynagrodzenie;
        }

    }
}
