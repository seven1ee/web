package comcom.Test;

import comcom.Dao.Impl.UserDaoImpl;
import comcom.Dao.UserDao;
import comcom.domain.User;
import org.apache.commons.beanutils.BeanUtils;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;

public class TestUserDao
{

    @Test
    public void userDaoImplTest()
    {
        UserDao dao= new UserDaoImpl();
        List<User> users=dao.findAll();
        System.out.println(users);

    }
    @Test
    public void Test2(){
        User user = new User();
        user.setName("dd");
        user.setGender("nan");
        user.setAge(11);
        user.setAddress("ddadadadad");
        user.setQq("111113333");
        user.setEmail("ddd@");
        UserDao dao= new UserDaoImpl();
        dao.add(user);
    }

    @Test
    public void Test3() throws InvocationTargetException, IllegalAccessException
    {
        HashMap<String,String>  map=new HashMap<>();
        map.put("name","dd");
        User user=new User();
        BeanUtils.populate(user,map);
        System.out.println(user);

    }
}
