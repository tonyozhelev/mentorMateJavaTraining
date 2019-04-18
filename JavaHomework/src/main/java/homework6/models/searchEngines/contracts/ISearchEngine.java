package homework6.models.searchEngines.contracts;

import homework6.models.media.contracts.Media;

import java.util.List;

public interface ISearchEngine {
    List<Media> searchByTitle(List<Media> media, String title);
    List<Media> searchByGenre(List<Media> media, String genre);
    List<Media> searchByRatingRange(List<Media> media, double minRating, double maxRating);
}
