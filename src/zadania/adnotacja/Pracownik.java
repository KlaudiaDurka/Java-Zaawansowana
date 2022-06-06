package zadania.adnotacja;

@ComponentInfo(name = "mojaAdnotacja", date = "10-10-2020", revisionNumber = 1)
public class Pracownik extends Osoba {

    @Override
    @ComponentInfo(name = "mojaAdnotacja2", date = "08-08-2021", revisionNumber = 2)
    public void wypisz() {
        System.out.println("Pracownik ma pesel " + getPesel());
    }

    //użyj metody wykonaj2
    @SuppressWarnings(value = {"unchecked", "deprecated"})
    @Deprecated
    public void wykonaj() {
        int x;
        x = 5;
        new Integer(9);
        System.out.println("Wykonało się");
    }



}
