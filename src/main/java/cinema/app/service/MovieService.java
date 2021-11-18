package cinema.app.service;

import java.util.List;
import cinema.app.model.Movie;

public interface MovieService {
    Movie add(Movie movie);

    Movie get(Long id);

    List<Movie> getAll();
}
