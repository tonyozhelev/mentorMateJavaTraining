package modelsHomework6.Contracts;

import java.util.Map;

public abstract class Media {
    private String title;
    private double rating;
    private String genre;

    public Media(Map<String,String> args) {
        setTitle(args.get("title"));
        setRating(Double.parseDouble(args.get("rating")));
        setGenre(args.get("genre"));
    }

    public String getTitle() {
        return title;
    }

    private void setTitle(String title){
        this.title = title;
    }

    public double getRating() {
        return rating;
    }

    private void setRating(double rating) {
        this.rating = rating;
    }

    public String getGenre() {
        return genre;
    }

    private void setGenre(String genre) {
        this.genre = genre;
    }
}
