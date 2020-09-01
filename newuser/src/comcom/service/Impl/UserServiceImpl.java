package comcom.service.Impl;

import comcom.Dao.Impl.UserDaoImpl;
import comcom.Dao.UserDao;
import comcom.domain.User;
import comcom.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService
{
    private  UserDao dao = new UserDaoImpl();
    @Override
    public List<User> findAll()
    {

        return dao.findAll();
    }

    @Override
    public void addUser(User user)
    {
        dao.add(user);
    }

    @Override
    public void update(User user)
    {
        dao.update(user);
    }

    @Override
    public void delete(String id)
    {
        dao.delete(Integer.parseInt(id));
    }

    @Override
    public User findUserById(String id)
    {
        return dao.findById(Integer.parseInt(id));
    }

    @Override
    public User login(User user)
    {
        return dao.findUserByNameAndPW(user.getUsername(),user.getPassword());
    }
}
