package web.dao;

import org.springframework.stereotype.Repository;
import web.models.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

//@Component
@Repository
public class UserDAOImpl implements UserDAO {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<User> index() {
        List<User> users = entityManager.createQuery("from User").getResultList();
        return users;
    }

    @Override
    public User show(Integer id) {
        User user = entityManager.find(User.class, id);
        return user;
    }

    @Override
    public void update(User userToBeUpdated) {
        entityManager.merge(userToBeUpdated);
    }

    @Override
    public void save(User user) {
        entityManager.persist(user);
    }

    @Override
    public void delete(User user) {
        entityManager.remove(user);
    }
}

