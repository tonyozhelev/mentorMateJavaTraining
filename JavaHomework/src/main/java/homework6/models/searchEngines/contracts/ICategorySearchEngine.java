package homework6.models.searchEngines.contracts;

import homework6.models.media.contracts.Media;

import java.util.List;

public interface ICategorySearchEngine {
    <T extends Media> List<Media> filterByMediaType(List<Media> media, Class<T> mediaType);
}
