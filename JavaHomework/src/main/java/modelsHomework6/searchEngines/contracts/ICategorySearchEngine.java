package modelsHomework6.searchEngines.contracts;

import modelsHomework6.media.contracts.Media;

import java.util.List;

public interface ICategorySearchEngine {
    <T extends Media> List<Media> filterByMediaType(List<Media> media, Class<T> mediaType);
}
