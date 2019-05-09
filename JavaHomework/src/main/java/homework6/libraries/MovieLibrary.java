package homework6.libraries;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MovieLibrary {
    private static Map<String, String> movie1 = Stream.of(new String[][]{
            {"type", "movie"},
            {"title", "The Shawshank Redemption"},
            {"rating", "9.3"},
            {"genre", "Drama"},
            {"duration", "142"},
            {"actors", "Tim Robbins; Morgan Freeman"}
    }).collect(Collectors.toMap(p -> p[0], p -> p[1]));

    private static Map<String, String> movie2 = Stream.of(new String[][]{
            {"type", "movie"},
            {"title", "The Godfather"},
            {"rating", "9.2"},
            {"genre", "Crime"},
            {"duration", "175"},
            {"actors", "Marlon Brando; Al Pacino"}
    }).collect(Collectors.toMap(p -> p[0], p -> p[1]));

    private static Map<String, String> movie3 = Stream.of(new String[][]{
            {"type", "movie"},
            {"title", "The Dark Knight"},
            {"rating", "9.0"},
            {"genre", "Action"},
            {"duration", "152"},
            {"actors", "Christian Bale; Heath Ledger"}
    }).collect(Collectors.toMap(p -> p[0], p -> p[1]));

    private static Map<String, String> movie4 = Stream.of(new String[][]{
            {"type", "movie"},
            {"title", "The Godfather: Part 2"},
            {"rating", "9.0"},
            {"genre", "Crime"},
            {"duration", "202"},
            {"actors", "Al Pacino; Robert de Niro"}
    }).collect(Collectors.toMap(p -> p[0], p -> p[1]));

    private static Map<String, String> movie5 = Stream.of(new String[][]{
            {"type", "movie"},
            {"title", "The Lord of the Rings: The Return of the King"},
            {"rating", "8.9"},
            {"genre", "Adventure, Action"},
            {"duration", "201"},
            {"actors", "Elijah Wood; Viggo Mortensen"}
    }).collect(Collectors.toMap(p -> p[0], p -> p[1]));

    public static List<Map<String, String>> movieLibrary = Arrays.asList(movie1, movie2, movie3, movie4, movie5);
}
