package udemy.klasaAbstrakcyjnaInstanceOf;

public class Student extends Osoba{

    Student(String imie, String nazwisko){

        super(imie, nazwisko);
    }

    @Override
    void pobierzOpis(){

        System.out.println("Jestem studentem");
        System.out.println("Imię: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
    }
}