package zadania.typyGeneryczne;

public class Coffiee<T, E> {

    private T value;
    private E element;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return "Coffie{" +
                "value=" + value +
                ", element=" + element +
                '}';
    }
}

