package strefaKursanta.Zadanie1;

public class Main {

    public static void main(String[] args) {

        Point2D point2D = new Point2D(10, 20);
        point2D.setXY(43, 65);
        System.out.println(point2D);
        Point3D point3D = new Point3D(10, 20, 30);
        point3D.setXYZ(43, 64, 2);
        System.out.println(point3D);
    }

    public static class Point2D{

        protected static float x;
        protected static float y;

        public Point2D(){
        }

        public Point2D(float x, float y){
            this.x = x;
            this.y = y;
        }

        public static float getX() {

            return x;
        }

        public static float getY() {

            return y;
        }

        public void setX(float x) {

            this.x = x;
        }

        public void setY(float y) {
            this.y = y;
        }

        public float[] getXY(){

            return new float[]{x, y};
        }
        public void setXY(float x, float y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {

            return String.format("(%f, %f)", x, y);
        }
    }

    public static class Point3D extends Point2D{
        private float z;

        public Point3D(float x, float y, float z){
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public float getZ() {
            return z;
        }

        public void setZ(float z) {
            this.z = z;
        }

        public float[] getXYZ(){
            return new float[]{x, y, z};
        }

        public void setXYZ(float x, float y, float z){
            this.x = x;
            this.y = y;
            this.z = z;
        }

        @Override
        public String toString() {
            return String.format("(%f, %f, %f)", x, y, z);
        }
    }
}
