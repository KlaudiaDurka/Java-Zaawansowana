package udemy.klasaAnonimowa;

public class Main {

    public static void main(String[] args) {

        ZachowaniePoWcisnieciu z = new ZachowaniePoWcisnieciu() {
            @Override
            public void akcja() {
                System.out.println("Jestem z klasy anonimowej");
            }
        };
    }

    interface ZachowaniePoWcisnieciu{

        void akcja();
    }

    static class Przycisk{

        void dodajAkcje(ZachowaniePoWcisnieciu z){

            z.akcja();
        }
    }
}
