package modelsHomework6;

import modelsHomework6.Contracts.Media;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TVMovie extends Media {
    private Duration duration;
    List<String> listOfActors;

    public TVMovie(Map<String,String> args) {
        super(args);
        this.duration = Duration.ofSeconds(calcDurationSeconds(args.get("duration")));
        this.listOfActors = Arrays.asList(args.get("actors").split(";"));
    }

    private long calcDurationSeconds(String duration) {
        List<Long> timeIntervals = Arrays.stream(duration.split(":")).map(x->Long.parseLong(x)).collect(Collectors.toList());
        return timeIntervals.get(0)*3600 + timeIntervals.get(1)*60 + timeIntervals.get(2);
    }
}
