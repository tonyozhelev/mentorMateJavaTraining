package homework6.libraries;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TVSeriesLibrary {
    private static Map<String, String> tvShow1 = Stream.of(new String[][]{
            {"type", "series"},
            {"title", "Friends"},
            {"rating", "9.3"},
            {"genre", "Sitcom"},
            {"Season titles", "1:Season One; 2:Season Two; 3:Season Three"},
            {"Episodes Count", "58"},
            {"Season Count", "3"},
            {"Season Rating", "1:9.8; 2:9.3; 3:8.9"}
    }).collect(Collectors.toMap(p -> p[0], p -> p[1]));

    private static Map<String, String> tvShow2 = Stream.of(new String[][]{
            {"type", "series"},
            {"title", "Supernatural"},
            {"rating", "8.8"},
            {"genre", "Horror"},
            {"Season titles", "1:Demons; 2:Angels; 3:More Demons and Angels"},
            {"Episodes Count", "876"},
            {"Season Count", "3"},
            {"Season Rating", "1:9.0; 2:8.2; 3:6.9"}
    }).collect(Collectors.toMap(p -> p[0], p -> p[1]));

    private static Map<String, String> tvShow3 = Stream.of(new String[][]{
            {"type", "series"},
            {"title", "Hells Kitchen"},
            {"rating", "8.5"},
            {"genre", "Cooking"},
            {"Season titles", "1:Cakes; 2:Sandwiches; 3:Steak"},
            {"Episodes Count", "20"},
            {"Season Count", "3"},
            {"Season Rating", "1:8.6; 2:7.3; 3:7.9"}
    }).collect(Collectors.toMap(p -> p[0], p -> p[1]));

    private static Map<String, String> tvShow4 = Stream.of(new String[][]{
            {"type", "series"},
            {"title", "Game of Thrones"},
            {"rating", "9.3"},
            {"genre", "Fantasy"},
            {"Season titles", "1:Eddard Stark Dies; 2:Renly Baratheon Dies; 3:Rob Star Dies; 4:Joffrey Dies; " +
                    "5:Stannis Baratheon Dies; 6:Ramsay Bolton Dies; 7:Peter Baelish Dies; 8:Everybody Dies"},
            {"Episodes Count", "20"},
            {"Season Count", "8"},
            {"Season Rating", "1:8.6; 2:8.3; 3:8.9; 4:9.2; 5: 9.0; 6:8.5; 7:9.1; 8:8.9"}
    }).collect(Collectors.toMap(p -> p[0], p -> p[1]));

    public static List<Map<String, String>> tvSeriesLibrary = Arrays.asList(tvShow1, tvShow2, tvShow3, tvShow4);
}
