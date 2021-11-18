package cinema.app.dao;

import java.util.Optional;
import cinema.app.model.Role;

public interface RoleDao {
    Role add(Role role);

    Optional<Role> getRoleByName(String name);
}
