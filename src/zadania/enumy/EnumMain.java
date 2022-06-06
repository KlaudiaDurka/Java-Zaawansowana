package zadania.enumy;

import java.util.Arrays;

public class EnumMain {

    public static void main(String[] args) {

        Kolor kolor = Kolor.CZERWONY;
        System.out.println(kolor);

        Pytanie pytanie  = Pytanie.ZWIERZE_ALI;

        Pytanie[] pytania = Pytanie.values();
        for (Pytanie pyt : pytania) {
            System.out.println("Pytanie to: " + pyt + " odpowiedzi : " + Arrays.toString(pyt.getOdpowiedzi()));
        }


        Kolor moj  = Kolor.BIALY;

        System.out.println("Moj kontrast " + moj.getKontrast());


        ///////////////////////

        Ubezpieczenie ubezpieczenie = new Ubezpieczenie(1, "mojeUbezpieczenie", TypUbezpieczenia.FUNERAL, StatusUbezpieczenia.NEW);

        System.out.println(ubezpieczenie);

    }
}
