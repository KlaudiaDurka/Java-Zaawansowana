package bazaWiedzy.zadanie3;

public class Square extends Rectangle{

    public Square(String color, boolean isFilled, double size) {
        super(color, isFilled, size, size);
    }
    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }
    @Override
    public void setLength(double length) {
        super.setWidth(width);
        super.setLength(length);
    }
    @Override
    public String toString() {
        return "Square with width: " + width + " and length: " + length +
                " which is subclass off " + super.toString();
    }

}
