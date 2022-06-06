package zadania.watki;

import java.util.Random;

public class Lotto implements Runnable {


    @Override
    public void run() {
        losuj(6);
    }

    public synchronized void losuj(int numberOfElements) {
        Random random = new Random();
        for (int i=0;i<numberOfElements;i++){
            int number = random.nextInt(49)+1;
            String string = String.format("%s -> number %d is: %d\n",
                    Thread.currentThread().getName(), i+1, number);
            System.out.println(string);
        }
    }
}
