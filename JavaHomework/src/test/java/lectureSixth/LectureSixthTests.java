package lectureSixth;

import homework6.functionality.MediaLibrary;
import homework6.models.media.TVSeries;
import homework6.models.media.VideoGame;
import homework6.models.media.contracts.Media;
import homework6.models.searchEngines.CategorySearchEngine;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.stream.Collectors;

public class LectureSixthTests {

    private CategorySearchEngine search;
    private MediaLibrary library;

    @BeforeClass
    public void setup(){
        search = new CategorySearchEngine();
        library = new MediaLibrary();
    }

    @BeforeMethod
    public void separator(){
        System.out.println("================STARTING NEXT TEST================");
    }

    @Test
    public void lec6test1(){
        List<Media> gotSearch = search.searchByTitle(library.mediaLibrary, "Game of Thrones");
        System.out.println(gotSearch);
        System.out.println("The rating of Season 8 is " + ((TVSeries) gotSearch.get(0)).getSeasonRating().get(7));
    }

    @Test
    public void lec6test2(){
        System.out.println("All Action Media with Rating over 5");
        System.out.println(search.searchByGenre(library.mediaLibrary,"Action")
                .stream()
                .filter(x->x.getRating() >= 5)
                .collect(Collectors.toList()));
        System.out.println("===================================\nVideo Games Only with Rating over 5");
        System.out.println(search.searchByGenre(library.mediaLibrary,"Action",VideoGame.class)
                .stream()
                .filter(x->x.getRating() >= 5)
                .collect(Collectors.toList()));
    }

    @Test
    public void lec6test3(){
        List<Media> tvShows = search.searchByRatingRange(library.mediaLibrary, 6.0, 9.0, TVSeries.class);
        for (Media media: tvShows) {
            TVSeries tvShow = (TVSeries) media;
            System.out.println(tvShow);
            System.out.println("\nSeasons with rating over 7 are:");
            for (int i=1;i<=tvShow.getSeasonRating().size(); i++){
                if (tvShow.getSeasonRating().get(i) >= 7.0){
                    System.out.println(tvShow.getSeasonTitles().get(i) + " Rating: " + tvShow.getSeasonRating().get(i));
                }
            }
        }
    }
}
