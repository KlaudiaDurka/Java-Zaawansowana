package zadania.interfejsy;

public class AliorBank implements Bank {

    @Override
    public boolean otworzKonto(String pesel) {
        System.out.println("Otwieriam konto");
        return false;
    }

    @Override
    public boolean zrobPrzelew(String konto1, String konto2) {
        System.out.println("Robie przelew z konta " + konto1 + " na konto " + konto2);
        return false;
    }
}
