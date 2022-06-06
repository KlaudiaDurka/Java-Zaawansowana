package zadania.adnotacja;

import java.time.Month;

public class Osoba {

    @PersonalInfo(dates = {"10-09-2021"}, month = Month.APRIL)
    private String pesel;

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public void wypisz() {
        System.out.println("Mój pesel to: " + pesel);
    }
}
