package zadania.mapy;

import java.util.HashMap;
import java.util.Map;

public class MapyMain {

    public static void main(String[] args) {
        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("klucz1", 10);
        mapa.put("klucz2", 20);
        mapa.put("klucz3", 0);

        Integer x = mapa.get("klucz2");
        System.out.println(x);

        //.containsKey .containsValue .keySet
        boolean klucz4 = mapa.containsKey("klucz4");
        System.out.println("Klucz4 " + klucz4);

        boolean wartosc = mapa.containsValue(10);
        System.out.println("Czy wartosc istnieje " + wartosc);

        System.out.println(mapa.keySet());

        for (String klucz : mapa.keySet()) {
            System.out.println("Klucz to " + klucz + " wartosc to: " + mapa.get(klucz));
        }

        for (Integer liczba : mapa.values()) {
            System.out.println("Wartość to " + liczba);
        }

        for(Map.Entry<String, Integer> entry : mapa.entrySet()){
            System.out.println("Klucz: " + entry.getKey() + " wartosc: " + entry.getValue());
        }

        mapa.remove("klucz2");
        System.out.println("---------------------------");
        for(Map.Entry<String, Integer> entry : mapa.entrySet()){
            System.out.println("Klucz: " + entry.getKey() + " wartosc: " + entry.getValue());
        }
    }
}

