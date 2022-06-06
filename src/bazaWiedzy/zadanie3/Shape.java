package bazaWiedzy.zadanie3;

public class Shape {

    public static void main(String[] args) {
        Circle circle = new Circle("red", true, 5);
        System.out.println(circle);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        System.out.println();

        Rectangle rectangle = new Rectangle("blue", true, 9, 7);
        System.out.println(rectangle);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());

        System.out.println();

        Square square = new Square("pink", false, 6);
        System.out.println(square);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());

    }

    private String color;
    private boolean isFilled;

    public Shape() {
        this.color = "unknow";
        this.isFilled = false;
    }

    public Shape(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    @Override
    public String toString() {
        return "Shape with color of " + color + " and " + isFilled;
    }
}
