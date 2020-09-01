package comcom.service;

import comcom.domain.User;

import java.util.List;

public interface UserService
{
    public List<User> findAll();

    public void addUser(User user);
}