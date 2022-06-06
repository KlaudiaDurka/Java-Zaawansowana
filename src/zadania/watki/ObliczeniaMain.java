package zadania.watki;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ObliczeniaMain {

    public static void main(String[] args) throws Exception {

        int iloscWatkow = 4;
        Long start = System.currentTimeMillis();
        for(int i=0;i<iloscWatkow;i++){
            new Obliczenia().call();
        }
        Long end = System.currentTimeMillis();
        System.out.println("Obliczenia trwaly " + (end - start));


        Long start2 = System.currentTimeMillis();
        Obliczenia obliczenia = new Obliczenia();
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        Future[] futures = new Future[4];

        for(int i=0;i<4;i++){
            futures[i] = executorService.submit(obliczenia);
        }

        Integer wynikObliczen = 0;
        for(int i=0;i<4;i++){
            wynikObliczen += (Integer)futures[i].get();
        }
        Long end2 = System.currentTimeMillis();

        System.out.println("Obliczenia wielowątkowe trwaly " + (end2 - start2));
    }
}
