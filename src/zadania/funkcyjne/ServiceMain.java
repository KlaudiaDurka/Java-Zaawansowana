package zadania.funkcyjne;

import java.util.List;

public class ServiceMain {

    public static void main(String[] args) {

        List<Season> seasons = SeasonDataGenerator.getSeasons();

        SeasonService seasonService = new SeasonService(seasons);

        System.out.println(seasonService.getAllEpisodes());

        System.out.println("Wszystkie filmy " + seasonService.getAllVideos());

    }

}
