package zadania.watki;

import java.util.concurrent.Callable;

public class Obliczenia implements Callable {

    @Override
    public Integer call() throws Exception {

        int wynik = 0;
        for(int i=0;i<1000000000;i++){
            if(i%1000==0)wynik++;
        }
        return wynik;
    }
}
