package zadania.wzorceKonstrukcyjne;

public class JablkoFactory implements RoslinaFactory {
    @Override
    public Roslina zrobRosline() {
        return new Jablko();
    }

    @Override
    public Zbieracz zrobZbieracza() {
        return new ZbieraczJablek();
    }
}
