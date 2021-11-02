package learn.springcloud.ratingdataservice.resources;

import learn.springcloud.ratingdataservice.model.Rating;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratings")
public class RatingResource {

    @GetMapping("/{movieId}")
    public Rating getRating(@PathVariable Integer movieId) {
        return new Rating(movieId, 4.5f);
    }
}
