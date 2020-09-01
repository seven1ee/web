package comcom.web;

import comcom.domain.User;
import comcom.service.Impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/finduserServlet")
public class FindUserServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        String id = req.getParameter("id");
        UserServiceImpl service = new UserServiceImpl();
        User user=service.findUserById(id);
        req.setAttribute("user",user);


        req.getRequestDispatcher("/update.jsp").forward(req,resp);
    }
}
