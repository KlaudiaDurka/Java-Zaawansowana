package strefaKursanta.Zadanie1;

public class Rozwiazanie {

    public static void main(String[] args) {

        Point2D point2D = new Point2D(10, 20);
        point2D.setXY(43, 65);
    }

    static class Point2D {
        protected float x, y;
        public Point2D() {
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
        public float[] getXY() {
            return new float[]{x, y};
        }
        public void setXY(float x, float y) {
            this.x = x;
            this.y = y;
        }
        @Override
        public String toString() {
            return String.format("(%f,%f)", x, y);
        }
    }
}
