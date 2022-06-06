package bazaWiedzy.zadanie2;

public class Staff extends Person{

    String specjalizacja;
    float wynagrodzenie;

    public Staff(String name, String address, String specjalizacja, float wynagrodzenie) {
        super(name, address);
        this.specjalizacja = specjalizacja;
        this.wynagrodzenie = wynagrodzenie;
    }

    public String getSpecjalizacja() {
        return specjalizacja;
    }

    public void setSpecjalizacja(String specjalizacja) {
        this.specjalizacja = specjalizacja;
    }

    public float getWynagrodzenie() {
        return wynagrodzenie;
    }

    public void setWynagrodzenie(float wynagrodzenie) {
        this.wynagrodzenie = wynagrodzenie;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", specialization='" + specjalizacja + '\'' +
                ", salary='" + wynagrodzenie + '\'' +
                '}';

    }
}
