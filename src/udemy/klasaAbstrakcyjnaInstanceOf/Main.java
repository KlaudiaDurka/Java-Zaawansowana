package udemy.klasaAbstrakcyjnaInstanceOf;

public class Main {

    public static void main(String[] args) {

        Osoba[] osoba = new Osoba[4];
        osoba[0] = new Pracownik("Jan", "Kowlaski", 6000);
        osoba[1] = new Student("Anna", "Nowak");


        for (int i = 0; i < osoba.length; i++){

            if (osoba[i] instanceof Osoba){
                osoba[i].pobierzOpis();
            } else {
                break;
            }
        }

        /*
        for (Osoba person: osoba){
            if (person instanceof Osoba){
                person.pobierzOpis();
            }
        }
        */
    }
}
