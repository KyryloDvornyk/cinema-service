package cinema.app.service.impl;

import java.util.List;
import cinema.app.dao.MovieDao;
import cinema.app.exception.DataProcessingException;
import cinema.app.model.Movie;
import cinema.app.service.MovieService;
import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService {
    private final MovieDao movieDao;

    public MovieServiceImpl(MovieDao movieDao) {
        this.movieDao = movieDao;
    }

    @Override
    public Movie add(Movie movie) {
        return movieDao.add(movie);
    }

    @Override
    public Movie get(Long id) {
        return movieDao.get(id).orElseThrow(
                () -> new DataProcessingException("Can't get movie by id " + id));
    }

    @Override
    public List<Movie> getAll() {
        return movieDao.getAll();
    }
}
