package zadania.wzorceStrukturalne;

public class DekoratorCarMain {

    public static void main(String[] args) {
        Car honda = new Honda();
        System.out.println(honda.getPrice());
        System.out.println(honda.getDescription());

        Car suv = new HondaSUV(honda);
        System.out.println(suv.getPrice());
        System.out.println(suv.getDescription());
    }
}
