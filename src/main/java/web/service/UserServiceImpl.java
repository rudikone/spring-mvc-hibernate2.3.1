package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDAO;
import web.models.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    @Transactional
    public List<User> index() {
        return userDAO.index();
    }

    @Override
    @Transactional
    public User show(Integer id) {
        return userDAO.show(id);
    }

    @Override
    @Transactional
    public void update(Integer id, User updateUser) {
        User userToBeUpdated = userDAO.show(id);
        userToBeUpdated.setName(updateUser.getName());
        userDAO.update(updateUser);
    }

    @Override
    @Transactional
    public void save(User user) {
        userDAO.save(user);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        userDAO.delete(userDAO.show(id));
    }
}
