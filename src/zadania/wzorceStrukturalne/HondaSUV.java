package zadania.wzorceStrukturalne;

public class HondaSUV implements Car {

    private Car car;

    public HondaSUV(Car car) {
        this.car = car;
    }

    @Override
    public Double getPrice() {
        return car.getPrice() + 5.0;
    }

    @Override
    public String getDescription() {
        return car.getDescription() + " SUV";
    }
}
