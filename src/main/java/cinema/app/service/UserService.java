package cinema.app.service;

import java.util.Optional;
import cinema.app.model.User;

public interface UserService {
    User add(User user);

    User get(Long id);

    Optional<User> findByEmail(String email);
}
