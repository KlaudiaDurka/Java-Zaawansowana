package zadania.enumy;

public enum Kolor {

    CZARNY(100),
    BIALY(50),
    CZERWONY(20),
    ZIELONY(10);

    Kolor(Integer kontrast){
        this.kontrast = kontrast;
    }

    private final Integer kontrast;

    public Integer getKontrast() {
        return kontrast;
    }

}
