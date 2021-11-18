package cinema.app.security;

import java.util.Set;
import cinema.app.model.Role;
import cinema.app.model.User;
import cinema.app.service.RoleService;
import cinema.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;

@Component
public class DataInitializer {
    private final RoleService roleService;
    private final UserService userService;

    @Autowired
    public DataInitializer(RoleService roleService, UserService userService) {
        this.roleService = roleService;
        this.userService = userService;
    }

    @PostConstruct
    public void inject() {
        Role adminRole = new Role();
        adminRole.setName("ADMIN");
        roleService.add(adminRole);
        Role userRole = new Role();
        userRole.setName("USER");
        roleService.add(userRole);
        User user = new User();
        user.setEmail("admin@i.ua");
        user.setPassword("admin123");
        user.setRoles(Set.of(adminRole));
        userService.add(user);
        User user1 = new User();
        user1.setEmail("user@i.ua");
        user1.setPassword("user1234");
        user1.setRoles(Set.of(userRole));
        userService.add(user1);
    }
}
