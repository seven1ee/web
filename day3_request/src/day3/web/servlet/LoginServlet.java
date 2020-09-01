package day3.web.servlet;
//登录模块

import day3.dao.UserDao;
import day3.dao.impl.UserDaoImpl;
import day3.domain.User;

import javax.jws.soap.SOAPBinding;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        //1.设置编码
        req.setCharacterEncoding("utf-8");
        //2.获取请求参数
        String name=req.getParameter("username");
        String password=req.getParameter("password");
        //3.封装成对象
        User loginuser=new User();
        loginuser.setUsername(name);
        loginuser.setPassword(password);
        //4.调用Dao方法
        UserDao Dao=new UserDaoImpl();
        User user=null;
        try {
            user=Dao.login(loginuser);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //5.判断
        if(user==null)
        {
            System.out.println("登录失败");
            req.getRequestDispatcher("/fail").forward(req,resp);
        }
        else {
            System.out.println("登陆成功");
            req.setAttribute("user",user);
            req.getRequestDispatcher("success").forward(req,resp);

        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        this.doGet(req, resp);
    }
}
