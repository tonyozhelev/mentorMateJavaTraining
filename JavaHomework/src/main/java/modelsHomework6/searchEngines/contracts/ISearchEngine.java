package modelsHomework6.searchEngines.contracts;

import modelsHomework6.media.contracts.Media;

import java.util.List;

public interface ISearchEngine {
    List<Media> searchByTitle(List<Media> media, String title);
    List<Media> searchByGenre(List<Media> media, String genre);
    List<Media> searchByRatingRange(List<Media> media, double minRating, double maxRating);
}
