package zadania.typyGeneryczne;

import java.util.List;

public class Pies {

    private Integer nazwa;
    private List<? extends Number> wynik;

    public List<? extends Number> getWynik() {
        return wynik;
    }

    public void setWynik(List<? extends Number> wynik) {
        this.wynik = wynik;
    }

    public Integer getNazwa() {
        return nazwa;
    }

    public void setNazwa(Integer nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public String toString() {
        return "Pies{" +
                "nazwa=" + nazwa +
                ", wynik=" + wynik +
                '}';
    }
}

