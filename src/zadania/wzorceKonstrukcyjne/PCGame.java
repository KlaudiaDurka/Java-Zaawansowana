package zadania.wzorceKonstrukcyjne;

public class PCGame implements Game {

    @Override
    public String getName() {
        return "heroes";
    }

    @Override
    public String getType() {
        return "PC";
    }
}
