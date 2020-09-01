package day3.web.servlet;

import day3.domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/success")
public class SuccessServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        User user= (User) req.getAttribute("user");
        resp.setContentType("text/html;charset=utf-8");
        resp.getWriter().write("登录成功，欢迎您："+user.getUsername());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
//        System.out.println("我是post");
        this.doGet(req, resp);
    }
}
