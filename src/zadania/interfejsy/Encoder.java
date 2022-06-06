package zadania.interfejsy;

public interface Encoder {

    default String encode(String text) {
        return text;
    }

    default String decode(String text) {
        return text;
    }

}
