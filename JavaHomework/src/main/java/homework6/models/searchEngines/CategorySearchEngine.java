package homework6.models.searchEngines;

import homework6.models.media.contracts.Media;
import homework6.models.searchEngines.contracts.ICategorySearchEngine;
import java.util.List;
import java.util.stream.Collectors;


public class CategorySearchEngine extends SearchEngine implements ICategorySearchEngine {
    @Override
    public <T extends Media> List<Media> filterByMediaType(List<Media> media, Class<T> mediaType) {
        return media.
                stream().
                filter(mediaType::isInstance).
                collect(Collectors.toList());
    }

    public <T extends Media> List<Media> searchByTitle(List<Media> media, String title, Class<T> mediaType) {
        return super.searchByTitle(filterByMediaType(media,mediaType),title);
    }


    public <T extends Media> List<Media> searchByGenre(List<Media> media, String genre, Class<T> mediaType) {
        return super.searchByGenre(filterByMediaType(media,mediaType),genre);
    }


    public <T extends Media> List<Media> searchByRatingRange(List<Media> media, double minRating, double maxRating, Class<T> mediaType) {
        return super.searchByRatingRange(filterByMediaType(media,mediaType),minRating,maxRating);
    }
}
