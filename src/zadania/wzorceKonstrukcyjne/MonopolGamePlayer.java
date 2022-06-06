package zadania.wzorceKonstrukcyjne;

public class MonopolGamePlayer extends Player {

    @Override
    public Game play() {
        return new BoardGame();
    }
}
