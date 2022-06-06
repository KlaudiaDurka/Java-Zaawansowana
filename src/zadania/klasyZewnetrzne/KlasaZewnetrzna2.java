package zadania.klasyZewnetrzne;

public class KlasaZewnetrzna2 {

    private Integer x;
    private static Integer z;

    public static class KlasaWewnetrznaStatyczna {

        private Integer y;

        public void print() {
            System.out.println(y + " " + z);
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

