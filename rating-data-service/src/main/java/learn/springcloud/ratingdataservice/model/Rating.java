package learn.springcloud.ratingdataservice.model;

public class Rating {

    private Integer movieId;
    private Float rating;

    public Rating(Integer movieId, Float rating) {
        this.movieId = movieId;
        this.rating = rating;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }
}
