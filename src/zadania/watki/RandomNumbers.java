package zadania.watki;

import java.util.Random;

public class RandomNumbers implements Runnable {

    @Override
    public void run() {
        int[] wylosowane = new int[1000];
        for(int i=0;i<wylosowane.length;i++){
            wylosowane[i] = new Random().nextInt(100);
        }

        if(Thread.currentThread().isInterrupted()){
            System.out.println("Wychodzę z wątku");
            return;
        }

        System.out.println("Dalej działam");
    }
}
