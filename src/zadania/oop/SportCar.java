package zadania.oop;

public class SportCar extends Car {

    private Integer enginePower;

    public SportCar() {
    }

    public SportCar(Integer enginePower) {
        this.enginePower = enginePower;
    }

    public Integer getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(Integer enginePower) {
        this.enginePower = enginePower;
    }

    public void drive(){
        System.out.println("Jadę sportowwym autem");
    }
}
