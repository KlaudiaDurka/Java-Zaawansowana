package bazaWiedzy.zadadnie1;

public class Point2D {
    public static void main(String[] args) {

        Point2D point2D = new Point2D(8, 9);
        point2D.setXY(5, 8);
        System.out.println(point2D);

        Point3D point3D = new Point3D(3 , 2, 1);
        point3D.setXYZ(1, 2, 3);
        System.out.println(point3D);
    }

    float x;
    float y;

    public Point2D(){

    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY(float x, float y){
        return new float[]{x, y};
    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("%f, %f", x, y);
    }
}
