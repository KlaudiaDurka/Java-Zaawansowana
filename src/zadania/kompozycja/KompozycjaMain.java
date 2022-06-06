package zadania.kompozycja;

public class KompozycjaMain {

    public static void main(String[] args) {
        Processor processor = new Processor();
        Memory memory = new Memory();

        Computer computer = new Computer(processor, memory, "IBM");
        System.out.println(computer);

        computer.sprawdzZasoby();


    }
}
