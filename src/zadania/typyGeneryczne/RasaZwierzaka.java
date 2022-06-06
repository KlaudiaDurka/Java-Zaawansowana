package zadania.typyGeneryczne;

public abstract class RasaZwierzaka<T> {

    private T wartosc;

    public T getWartosc() {
        return wartosc;
    }

    public void setWartosc(T wartosc) {
        this.wartosc = wartosc;
    }

    @Override
    public String toString() {
        return "RasaZwierzaka{" +
                "wartosc=" + wartosc +
                '}';
    }
}
