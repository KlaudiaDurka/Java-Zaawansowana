package strefaKursanta.Zadanie3;

public class Rectangle extends Shape {
    protected double width, length;

    public Rectangle() {
        super();
        this.width = 1;
        this.length = 1;
    }

    public Rectangle(String color, boolean isFilled, double width,
                     double length) {
        super(color, isFilled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    protected void setWidth(double width) {
    }

    protected void setLength(double width) {
    }
}
