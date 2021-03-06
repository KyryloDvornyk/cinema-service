package cinema.app.dao.impl;

import java.util.Optional;
import cinema.app.dao.AbstractDao;
import cinema.app.dao.RoleDao;
import cinema.app.exception.DataProcessingException;
import cinema.app.model.Role;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class RoleDaoImpl extends AbstractDao<Role> implements RoleDao {
    public RoleDaoImpl(SessionFactory factory) {
        super(factory, Role.class);
    }

    @Override
    public Optional<Role> getRoleByName(String name) {
        try (Session session = factory.openSession()) {
            Query<Role> getByName = session.createQuery(
                    "FROM Role r WHERE r.name = :name", Role.class);
            getByName.setParameter("name", name);
            return Optional.ofNullable(getByName.getSingleResult());
        } catch (Exception e) {
            throw new DataProcessingException("Can't get "
                    + Role.class.getSimpleName() + ", name: " + name, e);
        }
    }
}
