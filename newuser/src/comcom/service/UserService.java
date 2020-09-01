package comcom.service;

import comcom.domain.User;

import java.util.List;

public interface UserService
{
    public List<User> findAll();

    public void addUser(User user);

    void update(User user);
    void delete(String id);
    User findUserById(String id);
    User login(User user);

}
