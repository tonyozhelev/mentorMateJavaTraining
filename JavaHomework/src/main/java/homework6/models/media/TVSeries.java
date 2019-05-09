package homework6.models.media;

import homework6.models.media.contracts.Media;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class TVSeries extends Media {
    private Map<Integer, String> seasonTitles;
    private int numberOfEpisodes;
    private int numberOfSeasons;
    private Map<Integer, Double> seasonRating;

    TVSeries(Map<String, String> args) {
        super(args);
        setSeasonTitles(args.get("Season titles"));
        setNumberOfEpisodes(args.get("Episodes Count"));
        setNumberOfSeasons(args.get("Season Count"));
        setSeasonRating(args.get("Season Rating"));
    }

    public Map<Integer, String> getSeasonTitles() {
        return seasonTitles;
    }

    private void setSeasonTitles(String seasonTitles) {
        this.seasonTitles = Arrays.stream(seasonTitles.split(";")).
                map(x->x.split(":",2)).
                collect(Collectors.toMap(x->Integer.parseInt(x[0].trim()),x->x[1]));
    }

    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    private void setNumberOfEpisodes(String numberOfEpisodes) {
        this.numberOfEpisodes = Integer.parseInt(numberOfEpisodes);
    }

    public int getNumberOfSeasons() {
        return numberOfSeasons;
    }

    private void setNumberOfSeasons(String numberOfSeasons) {
        this.numberOfSeasons = Integer.parseInt(numberOfSeasons);
    }

    public Map<Integer, Double> getSeasonRating() {
        return seasonRating;
    }

    private void setSeasonRating(String seasonRating) {
        this.seasonRating = Arrays.stream(seasonRating.split(";")).
                map(x->x.split(":",2)).
                collect(Collectors.toMap(x->Integer.parseInt(x[0].trim()),x->Double.parseDouble(x[1])));
    }


    public String toString() {
        return super.toString() +
                "\nSeason titles: " + this.getSeasonTitles() +
                "\nEpisodes Count: " + this.getNumberOfEpisodes() +
                "\nSeason Count: " + this.getNumberOfSeasons() +
                "\nSeason Rating: " + this.getSeasonRating();
    }
}
