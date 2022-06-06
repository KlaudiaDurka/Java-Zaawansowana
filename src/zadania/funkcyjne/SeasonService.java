package zadania.funkcyjne;

import java.util.ArrayList;
import java.util.List;

public class SeasonService {

    private List<Season> seasons;

    public SeasonService(List<Season> seasons) {
        this.seasons = seasons;
    }

    public List<Episode> getAllEpisodes() {
        List<Episode> episodes = new ArrayList<>();

        for (Season season : seasons) {
            episodes.addAll(season.getEpisodes());
        }
        return episodes;
    }

    public List<Video> getAllVideos() {
        List<Video> videos = new ArrayList<>();

        for (Season season : seasons) {
            for (Episode episode : season.getEpisodes()) {
                videos.addAll(episode.getVideos());
            }
        }
        return videos;
    }

    public List<String> getAllSeasonNames() {
        List<String> names = new ArrayList<>();

        for (Season season : seasons) {
            names.add(season.getSeasonName());
        }
        return names;
    }
}
