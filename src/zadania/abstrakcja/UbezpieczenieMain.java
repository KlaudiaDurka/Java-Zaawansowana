package zadania.abstrakcja;

public class UbezpieczenieMain {

    public static void main(String[] args) {

        UbezpieczenieOC ubezpieczenieOC = new UbezpieczenieOC();
        UbezpieczenieZycie ubezpieczenieZycie = new UbezpieczenieZycie();

        Ubezpieczenie[] ubezpieczenia = new Ubezpieczenie[]{ubezpieczenieOC, ubezpieczenieZycie};

        int suma = 0;
        for(int i=0;i<ubezpieczenia.length;i++){
            ubezpieczenia[i].obliczKoszt();
        }
    }
}
