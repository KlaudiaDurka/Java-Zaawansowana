package zadania.funkcyjne;

import java.util.List;
import java.util.stream.Collectors;

public class StreamyMain {

    public static void main(String[] args) {

        List<Season> seasons = SeasonDataGenerator.getSeasons();

        //lista wszystkich epizodow
        List<Episode> listaWszystkichEpizodow =
                seasons.stream().map(t -> t.getEpisodes())
                        .flatMap(t -> t.stream())
                        .collect(Collectors.toList());

        //lista wszystkich filmow
        List<Video> listaWszystkichFilmow =
                seasons.stream()
                        .flatMap(t -> t.getEpisodes().stream())
                        .flatMap(t -> t.getVideos().stream())
                        .collect(Collectors.toList());

        //lista wszystkich nazw sezonow
        List<String> listaNazwSezonow = seasons.stream()
                .map(Season::getSeasonName)
                .collect(Collectors.toList());

        //lista wszystkich numerow sezonow
        List<Integer> listaNumerowSezonow = seasons
                .stream()
                .map(t -> t.getSeasonNumber())
                .collect(Collectors.toList());

        //lista wszystkich nazw epizodow
        List<String> listaNazwEpizodow =
                seasons.stream()
                        .flatMap(t -> t.getEpisodes().stream())
                        .map(t -> t.getEpisodeName())
                        .collect(Collectors.toList());

        //lista wszystkich numerow epizodow
        List<Integer> listaNumerowEpizodow =
                seasons.stream().flatMap(t -> t.getEpisodes().stream())
                        .map(t -> t.getEpisodeNumber())
                        //.peek(System.out::println)
                        .collect(Collectors.toList());

        seasons.forEach(t -> System.out.println(t));

    }
}
