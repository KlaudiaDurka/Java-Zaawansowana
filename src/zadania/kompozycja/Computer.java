package zadania.kompozycja;

public class Computer {

    private Processor processor;
    private Memory memory;
    private String name;

    public Computer(Processor processor, Memory memory, String name) {
        this(processor, name);
        this.memory = memory;
    }

    public Computer(Processor processor, String name) {
        this.processor = processor;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sprawdzZasoby(){
        processor.obliczZuzycieProcesora();
        memory.obliczWolnaPamiec();
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processor=" + processor +
                ", memory=" + memory +
                ", name='" + name + '\'' +
                '}';
    }
}
