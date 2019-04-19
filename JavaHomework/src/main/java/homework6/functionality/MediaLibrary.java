package homework6.functionality;

import homework6.libraries.MovieLibrary;
import homework6.libraries.TVSeriesLibrary;
import homework6.libraries.VideoGameLibrary;
import homework6.models.media.MediaFactory;
import homework6.models.media.contracts.Media;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MediaLibrary {
    public List<Media> mediaLibrary;
    private MediaFactory mediaFactory;

    public MediaLibrary() {
        this.mediaLibrary = new ArrayList<>();
        this.mediaFactory = new MediaFactory();
        addMediaToLibrary(MovieLibrary.movieLibrary);
        addMediaToLibrary(VideoGameLibrary.videoGameLibrary);
        addMediaToLibrary(TVSeriesLibrary.tvSeriesLibrary);
    }

    private void addMediaToLibrary(List<Map<String, String>> movies){
        for (Map<String, String> movie: movies) {
            mediaLibrary.add(mediaFactory.createMedia(movie));
        }
    }

}
