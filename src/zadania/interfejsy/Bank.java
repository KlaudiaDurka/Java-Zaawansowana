package zadania.interfejsy;

public interface Bank {

    boolean otworzKonto(String pesel);

    boolean zrobPrzelew(String konto1, String konto2);
}
