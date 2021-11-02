package learn.springcloud.moviecatalogservice.resources;

import learn.springcloud.moviecatalogservice.model.CatalogItem;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

    @GetMapping("/{userId}")
    public List<CatalogItem> getCatalog(String userId) {

        return Collections.singletonList(
                new CatalogItem("Iron Man", "1st avenger", 5.0f)
        );
    }
}
