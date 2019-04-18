package homework6.models.media;

import homework6.models.media.contracts.Media;

import java.security.InvalidParameterException;
import java.util.Map;

public class MediaFactory {

    public Media createMedia(Map<String,String> args) {
        switch(args.get("type")){
            case "movie":
                return new TVMovie(args);
            case "game":
                return new VideoGame(args);
            case "series":
                return new TVSeries(args);

                default:
                    throw new InvalidParameterException("No such media type");
        }
    }
}
