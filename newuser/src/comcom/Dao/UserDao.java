package comcom.Dao;

import comcom.domain.User;

import java.util.List;
import java.util.Map;

public interface UserDao
{
    public List<User> findAll();

    void add(User user);

    void update(User user);
    void delete (int id);
    User findById (int id);
    User findUserByNameAndPW(String username,String password);
    int findTotalCount(Map<String,String[]> condition);

}
