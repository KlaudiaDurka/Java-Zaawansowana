package zadania.funkcyjne;

import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunkcyjneMain {

    Supplier<String> lambda1 = () -> "Hello World";

    public static String wypisz() {
        return "Hello world";
    }

    public static boolean sprawdzNapisJestDlugi(String napis) {
        return napis.length() > 10;
    }

    public static void main(String[] args) {
        Supplier<String> lambda1 = () -> "Hello World";  //brak parametrów wejściowych, jest wynik funkcji
        System.out.println(lambda1.get());

        Function<Integer, Integer> potega = t -> t * t; //są parametry, jak i wynik funkcji

        System.out.println("Potęga to: " + potega.apply(8));


        Predicate<String> sprawdz = t -> t.length() > 10;
        System.out.println(sprawdz.test("Ala poszła do szkoły"));


        MyFunctionalInterface myFunctionalInterface = t -> {
            System.out.println("Hello world " + t);
            return t.length();
        };
        Integer wynik = myFunctionalInterface.wypisz("Janek");
        System.out.println("Wynik: " + wynik);


        Integer liczba = null;
        Optional<Integer> optional = Optional.ofNullable(liczba);

        System.out.println("Czy liczba istnieje " + optional.isPresent());
        if (optional.isEmpty()) {
            System.out.println("Brak liczby");
        }

        if (optional.isPresent()) {
            System.out.println("Wartość optionala to " + optional.get());
        }

        optional.orElse(null);

        System.out.println("Domyślna wartość " + optional.orElse(100));

    }
}
