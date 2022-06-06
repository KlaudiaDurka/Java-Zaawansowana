package zadania.funkcyjne;

import java.util.ArrayList;
import java.util.List;

public class SeasonDataGenerator {

    public static List<Season> getSeasons() {
        List<Video> videos = new ArrayList<>();
        Video video1 = new Video("Harry Potter", "http://filmweb.pl/", VideoType.EPISODE);
        Video video2 = new Video("Pierwsza Miłość", "http://polsat.pl/", VideoType.PREVIEW);
        Video video3 = new Video("Klan", "http://klan.pl/", VideoType.PREVIEW);
        videos.add(video1);
        videos.add(video2);
        videos.add(video3);

        List<Video> videos2 = new ArrayList<>();
        Video video21 = new Video("Swiat według kiepskich", "http://polsat2.pl/", VideoType.EPISODE);
        Video video22 = new Video("Rodzinka", "http://rodzinka.pl/", VideoType.PREVIEW);
        videos2.add(video21);
        videos2.add(video22);

        List<Video> videos3 = new ArrayList<>();
        Video video31 = new Video("Serial", "http://serial.pl/", VideoType.CLIP);
        videos3.add(video31);

        List<Episode> episodes = new ArrayList<>();
        Episode episode = new Episode("Episod 1", 1, videos);
        Episode episode2 = new Episode("Episod 2", 2, videos2);
        episodes.add(episode);
        episodes.add(episode2);

        List<Episode> episodes2 = new ArrayList<>();
        Episode episode3 = new Episode("Episod 3", 1, videos3);
        episodes2.add(episode3);

        List<Season> seasons = new ArrayList<>();
        Season season1 = new Season("Sezon 1", 1, episodes);
        Season season2 = new Season("Sezon 2", 2, episodes2);
        seasons.add(season1);
        seasons.add(season2);
        return seasons;
    }
}
