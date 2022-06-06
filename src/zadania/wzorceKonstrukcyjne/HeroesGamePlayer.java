package zadania.wzorceKonstrukcyjne;

public class HeroesGamePlayer extends Player {

    @Override
    public Game play() {
        return new PCGame();
    }
}
