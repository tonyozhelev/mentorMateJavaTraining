package homework6.models.searchEngines;

import homework6.models.media.contracts.Media;
import homework6.models.searchEngines.contracts.ISearchEngine;

import java.util.List;
import java.util.stream.Collectors;

public class SearchEngine implements ISearchEngine {
    @Override
    public List<Media> searchByTitle(List<Media> media, String title) {
        return media.stream().
                filter(x->title.equals(x.getTitle())).
                collect(Collectors.toList());
    }

    @Override
    public List<Media> searchByGenre(List<Media> media, String genre) {
        return media.stream().
                filter(x->genre.equals(x.getTitle())).
                collect(Collectors.toList());
    }

    @Override
    public List<Media> searchByRatingRange(List<Media> media, double minRating, double maxRating) {
        return media.stream().
                filter(x->(x.getRating()>=minRating || x.getRating()<= maxRating)).
                collect(Collectors.toList());
    }
}
