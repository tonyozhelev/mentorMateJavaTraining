package homework6.libraries;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class VideoGameLibrary {
    private static Map<String, String> game1 = Stream.of(new String[][]{
            {"type", "game"},
            {"title", "Half Life"},
            {"rating", "9.3"},
            {"genre", "Action"},
            {"OS", "Windows"},
            {"Multiplayer", "yes"}
    }).collect(Collectors.toMap(p -> p[0], p -> p[1]));

    private static Map<String, String> game2 = Stream.of(new String[][]{
            {"type", "game"},
            {"title", "Star Craft"},
            {"rating", "9.0"},
            {"genre", "RTS"},
            {"OS", "Windows"},
            {"Multiplayer", "yes"}
    }).collect(Collectors.toMap(p -> p[0], p -> p[1]));

    private static Map<String, String> game3 = Stream.of(new String[][]{
            {"type", "game"},
            {"title", "F1 2019"},
            {"rating", "8.5"},
            {"genre", "Racing"},
            {"OS", "Windows"}
    }).collect(Collectors.toMap(p -> p[0], p -> p[1]));

    private static Map<String, String> game4 = Stream.of(new String[][]{
            {"type", "game"},
            {"title", "Candy Crush"},
            {"rating", "8.5"},
            {"genre", "Puzzle"},
            {"OS", "Android"},
            {"Multiplayer", "yes"}
    }).collect(Collectors.toMap(p -> p[0], p -> p[1]));

    private static Map<String, String> game5 = Stream.of(new String[][]{
            {"type", "game"},
            {"title", "Words with Friends"},
            {"rating", "7.9"},
            {"genre", "Puzzle"},
            {"OS", "iOS"},
            {"Multiplayer", "yes"}
    }).collect(Collectors.toMap(p -> p[0], p -> p[1]));

    private static Map<String, String> game6 = Stream.of(new String[][]{
            {"type", "game"},
            {"title", "Fallout 76"},
            {"rating", "4.9"},
            {"genre", "Action"},
            {"OS", "Windows"},
    }).collect(Collectors.toMap(p -> p[0], p -> p[1]));
    public static List<Map<String, String>> videoGameLibrary = Arrays.asList(game1, game2, game3, game4, game5, game6);
}
