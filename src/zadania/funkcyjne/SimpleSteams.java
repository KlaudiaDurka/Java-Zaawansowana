package zadania.funkcyjne;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SimpleSteams {

    public static void main(String[] args) {

        List<Integer> result1 = List.of(1, 2, 3)
                .stream()
                .map(t -> t * 3)
                .collect(Collectors.toList());

        System.out.println(result1);

        List<Integer> listaDoPosortowania = List.of(6, 3, 5, 20, 1, 1, 3);

        List<Integer> listaPosortowana = listaDoPosortowania
                .stream().sorted()
                .collect(Collectors.toList());

        System.out.println(listaPosortowana);

        List<Integer> bezPowtorzen = listaDoPosortowania.stream()
                .distinct().sorted()
                .collect(Collectors.toList());

        System.out.println(bezPowtorzen);


        List<String> dlugieNapisy = Stream.of("Ala", "poszła", "do", "lasu")
                .filter(t -> t.length() > 2)
                .collect(Collectors.toList());

        System.out.println(dlugieNapisy);


        List<String> listaNapisow = List.of("Ala", "poszła", "do", "lasu");
        List<String> dlugieNapisy2 = listaNapisow.stream()
                .filter(t -> t.length() > 2)
                .collect(Collectors.toList());


        List<Integer> lista1 = List.of(1, 2, 3);
        List<Integer> lista2 = List.of(4, 5, 6, 7);
        List<List<Integer>> listy = new ArrayList<>();
        listy.add(lista1);
        listy.add(lista2);

        List<Integer> listaWynikowa = listy.stream().flatMap(t -> t.stream())
                .collect(Collectors.toList());

    }
}
