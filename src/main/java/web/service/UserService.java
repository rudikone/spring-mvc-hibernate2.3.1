package web.service;

import web.models.User;

import java.util.List;

public interface UserService {
    public List<User> index();
    public User show(Integer id);
    public void update(Integer id, User updateUser);
    public void save(User user);
    public void delete(Integer id);
}
