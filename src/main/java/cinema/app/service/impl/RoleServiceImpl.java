package cinema.app.service.impl;

import cinema.app.dao.RoleDao;
import cinema.app.model.Role;
import cinema.app.service.RoleService;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    private final RoleDao roleDao;

    public RoleServiceImpl(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public void add(Role role) {
        roleDao.add(role);
    }

    @Override
    public Role getRoleByName(String roleName) {
        return roleDao.getRoleByName(roleName).orElseThrow(() ->
                new RuntimeException("Role with name " + roleName + " doesn't exist"));
    }
}
