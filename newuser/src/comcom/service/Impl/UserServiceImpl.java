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
}
