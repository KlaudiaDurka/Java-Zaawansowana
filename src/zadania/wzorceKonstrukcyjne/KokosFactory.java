package zadania.wzorceKonstrukcyjne;

public class KokosFactory implements RoslinaFactory{
    @Override
    public Roslina zrobRosline() {
        return new Kokos();
    }

    @Override
    public Zbieracz zrobZbieracza() {
        return new ZbieraczKokosow();
    }
}
