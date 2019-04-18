package modelsHomework6;

import modelsHomework6.Contracts.Media;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TVMovie extends Media {
    private Duration duration;
    private List<String> listOfActors;

    public TVMovie(Map<String,String> args) {
        super(args);
        setDuration(args.get("duration"));
        setListOfActors(args.get("actors"));
    }

    public Duration getDuration() {
        return duration;
    }

    private void setDuration(String duration) {
        this.duration = Duration.ofSeconds(calcDurationSeconds(duration));
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

    private long calcDurationSeconds(String duration) {
        List<Long> timeIntervals = Arrays.stream(duration.split(":")).map(Long::parseLong).collect(Collectors.toList());
        return timeIntervals.get(0)*3600 + timeIntervals.get(1)*60 + timeIntervals.get(2);
    }
}
