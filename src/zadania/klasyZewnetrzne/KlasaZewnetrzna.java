package zadania.klasyZewnetrzne;

public class KlasaZewnetrzna {

    private Integer x;
    private static Integer z;

    public class KlasaWewnetrzna {

        private Integer y;

        public void print() {
            System.out.println(x + " " + y + " " + z);
        }

        public Integer getY() {
            return y;
        }

        public void setY(Integer y) {
            this.y = y;
        }
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

}
