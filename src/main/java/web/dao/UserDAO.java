package web.dao;

import web.models.User;

import java.util.List;

public interface UserDAO {

    public List<User> index();
    public User show(Integer id);
    public void update(User userToBeUpdated);
    public void save(User user);
    public void delete(User user);
}
