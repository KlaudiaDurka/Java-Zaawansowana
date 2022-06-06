package zadania.kolekcje;

public class Drzewo {

    private Integer wiek;
    private Integer wysokosc;


    private Integer szerokosc;

    public Drzewo(Integer wiek, Integer wysokosc, Integer szerokosc) {
        this.wiek = wiek;
        this.wysokosc = wysokosc;
        this.szerokosc = szerokosc;
    }

    public Integer getWiek() {
        return wiek;
    }

    public void setWiek(Integer wiek) {
        this.wiek = wiek;
    }

    public Integer getWysokosc() {
        return wysokosc;
    }

    public void setWysokosc(Integer wysokosc) {
        this.wysokosc = wysokosc;
    }

    public Integer getSzerokosc() {
        return szerokosc;
    }

    public void setSzerokosc(Integer szerokosc) {
        this.szerokosc = szerokosc;
    }

    @Override
    public String toString() {
        return "Drzewo{" +
                "wiek=" + wiek +
                ", wysokosc=" + wysokosc +
                ", szerokosc=" + szerokosc +
                '}';
    }
}

