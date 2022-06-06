package zadania.typyGeneryczne;

public class Water<T> {

    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Water{" +
                "value=" + value +
                '}';
    }
}