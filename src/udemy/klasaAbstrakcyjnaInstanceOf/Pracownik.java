package udemy.klasaAbstrakcyjnaInstanceOf;

public class Pracownik extends Osoba{

        double wynagrodzenie;

        Pracownik(String imie, String nazwisko, double wynagrodzenie){

        super(imie, nazwisko);
        this.wynagrodzenie = wynagrodzenie;
        }

@Override
    void pobierzOpis(){

            System.out.println("Jestem pracownikiem");
            System.out.println("Imię: " + imie);
            System.out.println("Nazwisko: " + nazwisko);
            System.out.println("Wynagrodzenie: " + wynagrodzenie);
            }

            }
