package strefaKursanta.Zadanie4;

public class Shape {

    public static void main(String[] args) {

        Shape circle = new Circle("blue", true, 20);
        System.out.println(circle);
        Shape rectangle = new Rectangle("yellow", true, 20, 30);
        System.out.println(rectangle);
        Shape square = new Square("green", false, 40);
        System.out.println(square);
    }


    protected String color;
    protected boolean isFilled;

    protected Shape(){
        this.color = "unknown";
        this.isFilled = false;
    }

    protected Shape(String color, boolean isFilled){
        this.color = color;
        this.isFilled = isFilled;
    }

    protected String getColor() {

        return color;
    }

    protected void setColor(String color) {

        this.color = color;
    }

    protected boolean isFilled() {

        return isFilled;
    }

    protected void setFilled(boolean filled) {

        isFilled = filled;
    }

    @Override
    public String toString() {
        return String.format("Shape with color of %s and %s",
                color, isFilled ? "filled" : "NotFilled");
    }
}
