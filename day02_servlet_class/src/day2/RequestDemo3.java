package day2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/requestdemo3")
public class RequestDemo3 extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
      this.doPost(req,resp);
        String username=req.getParameter("username");
        System.out.println(req+"   "+resp);
        System.out.println(username);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        String username=req.getParameter("username");
        System.out.println(req+"   "+resp);
        System.out.println(username);

    }
}
