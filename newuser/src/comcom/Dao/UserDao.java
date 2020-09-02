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


    /**
     * 查询总记录数
     */
    int findTotalCount(Map<String,String[]> condition);
    /**
     * 分页查询每页记录
     */
    List<User> findByPage(int start,int rows,Map<String,String[]> condition);

}
