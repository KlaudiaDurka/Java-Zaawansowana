package zadania.wzorceKonstrukcyjne;

public class Pomieszczenie {

    private String typ;

    public Pomieszczenie(String typ) {
        this.typ = typ;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    @Override
    public String toString() {
        return "Pomieszczenie{" +
                "typ='" + typ + '\'' +
                '}';
    }
}
