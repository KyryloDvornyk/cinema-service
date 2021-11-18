package cinema.app.service;

import cinema.app.model.User;

public interface AuthenticationService {
    User registerUser(String email, String password);

    User registerAdmin(String email, String password);
}
