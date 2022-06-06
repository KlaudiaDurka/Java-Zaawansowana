package zadania.wzorceStrukturalne;

public class Honda implements Car {

    @Override
    public Double getPrice() {
        return 10.0;
    }

    @Override
    public String getDescription() {
        return "Honda CRV";
    }
}
