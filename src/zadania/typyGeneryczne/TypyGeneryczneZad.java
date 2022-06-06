package zadania.typyGeneryczne;

public class TypyGeneryczneZad<T> {

    private T[] values;

    public TypyGeneryczneZad(T[] values) {
        this.values = values;
    }

    private void swap(int index1, int index2) {
        int max = Math.max(index1, index2);
        if(values == null || max > values.length){
            return;
        }

        T element = values[index1];
        values[index1] = values[index2];
        values[index2] = element;
    }

}