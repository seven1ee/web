package comcom.web;

import comcom.domain.User;
import comcom.service.Impl.UserServiceImpl;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/addUserServlet")
public class addUserServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        //1.设置编码
        req.setCharacterEncoding("utf-8");
        //2.获取参数
        Map<String,String[]> map= req.getParameterMap();
//        String name = req.getParameter("name");
//        String sex = req.getParameter("sex");
//        String address = req.getParameter("address");
//        String qq = req.getParameter("qq");
//        String email = req.getParameter("email");
//        String age = req.getParameter("age");


        //3.封装成对象
        User user=new User();

//        user.setName(name);
//        user.setGender(sex);
//        user.setAddress(address);
//        user.setQq(qq);
//        user.setEmail(email);
//        user.setAge(Integer.parseInt(age));
        try {
            BeanUtils.populate(user,map);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        System.out.println(user);
        //4.调用service add方法
        UserServiceImpl service = new UserServiceImpl();
        service.addUser(user);
        //5.转到list
        resp.sendRedirect(req.getContextPath()+"/userListServlet");
    }
}
