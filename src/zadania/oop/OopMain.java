package zadania.oop;

public class OopMain {

    public static void main(String[] args) {

        Car car = new Car();
        car.setId(1L);
        car.setBrand("BMW");
        car.setHeight(200);
        car.setWith(300);

        SportCar sportCar = new SportCar();
        sportCar.setId(2L);
        sportCar.setBrand("Honda");
        sportCar.setHeight(100);
        sportCar.setWith(400);

        Lamborgini lamborgini = new Lamborgini();
        lamborgini.setId(3L);
        lamborgini.setBrand("Lamborgini");
        lamborgini.setHeight(80);
        lamborgini.setWith(400);

        Ferrari ferrari = new Ferrari();
        ferrari.setId(4L);
        ferrari.setBrand("Ferrari");
        ferrari.setHeight(80);
        ferrari.setWith(400);

    }
}
