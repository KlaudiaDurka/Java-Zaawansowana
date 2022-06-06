package zadania.watki;

public class WatkiMain {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Start");
        new HttpAction().start();

        Thread.sleep(1000);
        System.out.println("Koniec");

        new Thread(new HelloWorldRunnableThread()).start();

        Lotto lotto = new Lotto();
        Thread[] watki = new Thread[3];
        for (int i = 0; i < watki.length; i++) {

            watki[i] = new Thread(lotto);
            watki[i].start();
        }


        Thread thread = new Thread(new RandomNumbers());
        thread.start();
        thread.interrupt();
    }
}
