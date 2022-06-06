package zadania.wzorceStrukturalne;

public class Engine {

    private String name;
    private String volume;
    private String type;

    public Engine(String name, String volume, String type) {
        this.name = name;
        this.volume = volume;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getVolume() {
        return volume;
    }

    public String getType() {
        return type;
    }
}
