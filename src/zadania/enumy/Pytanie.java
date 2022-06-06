package zadania.enumy;

public enum Pytanie {

    ZWIERZE_ALI(new String[]{"Pies", "Kot", "Wiewiorka"}),
    KOSMOS(new String[]{"Ziemia", "Mars"});

    Pytanie(String[] odpowiedzi){
        this.odpowiedzi = odpowiedzi;
    }

    private String[] odpowiedzi;

    public String[] getOdpowiedzi() {
        return odpowiedzi;
    }
}
