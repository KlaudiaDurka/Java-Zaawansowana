package zadania.klasyZewnetrzne;

public class WewnetrzneMain {

    public static void main(String[] args) {

        KlasaZewnetrzna zewnetrzna = new KlasaZewnetrzna();
        zewnetrzna.setX(5);

        KlasaZewnetrzna.KlasaWewnetrzna wewnetrzna = zewnetrzna.new KlasaWewnetrzna();
        wewnetrzna.print();


        KlasaZewnetrzna2.KlasaWewnetrznaStatyczna wewnetrznaStatyczna = new KlasaZewnetrzna2.KlasaWewnetrznaStatyczna();
        wewnetrznaStatyczna.print();
    }
}
