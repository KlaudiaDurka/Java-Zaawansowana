package zadania.wzorceKonstrukcyjne;

public class BoardGame implements Game {

    @Override
    public String getName() {
        return "Monopol";
    }

    @Override
    public String getType() {
        return "planszówka";
    }
}