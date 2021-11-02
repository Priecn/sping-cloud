package learn.springcloud.movieinfoservice.resources;


import learn.springcloud.movieinfoservice.model.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieInfoResource {

    @GetMapping("/{movieId}")
    public Movie getMovieInfo(@PathVariable() Integer movieId) {
        return new Movie(movieId, "Iron man");
    }
}
