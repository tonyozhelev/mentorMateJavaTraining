package homework6.models.media;

import homework6.models.media.contracts.Media;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TVMovie extends Media {
    private Duration duration;
    private List<String> listOfActors;

    TVMovie(Map<String, String> args) {
        super(args);
        setDuration(args.get("duration"));
        setListOfActors(args.get("actors"));
    }

    public Duration getDuration() {
        return duration;
    }

    private void setDuration(String duration) {
        this.duration = Duration.ofMinutes(Long.parseLong(duration));
    }

    public List<String> getListOfActors() {
        return listOfActors;
    }

    private void setListOfActors(String listOfActors) {
        this.listOfActors = Arrays.asList(listOfActors.split(";"));
    }


    public void addActor(String actorName){
        this.listOfActors.add(actorName);
    }
}
