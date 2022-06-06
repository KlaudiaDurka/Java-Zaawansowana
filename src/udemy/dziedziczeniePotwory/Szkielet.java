package udemy.dziedziczeniePotwory;

public class Szkielet extends Potwor {

    String typBroni;
    public Szkielet(){

        System.out.println("Domyslny konstruktor z klasy szkielet");
    }

    public Szkielet(double predkoscChodzenia, double zywotnosc){

        super(predkoscChodzenia, zywotnosc);

    }

    public Szkielet(double predkoscChodzenia, double zywotnosc, String typBroni) {

        super(predkoscChodzenia, zywotnosc);
        this.typBroni = typBroni;

        System.out.println("NieDomyslny konstruktor z klasy szkielet");


    }
}
