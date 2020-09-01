package comcom.Dao;

import comcom.domain.User;

import java.util.List;

public interface UserDao
{
    public List<User> findAll();

    void add(User user);
}
