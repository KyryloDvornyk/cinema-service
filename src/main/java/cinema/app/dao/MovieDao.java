package cinema.app.dao;

import java.util.List;
import java.util.Optional;
import cinema.app.model.Movie;

public interface MovieDao {
    Movie add(Movie movie);

    Optional<Movie> get(Long id);

    List<Movie> getAll();
}
