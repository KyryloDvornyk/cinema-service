package cinema.app.dao;

import java.util.Optional;
import cinema.app.model.User;

public interface UserDao {
    User add(User user);

    Optional<User> get(Long id);

    Optional<User> findByEmail(String email);
}
