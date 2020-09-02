package comcom.web;

import comcom.service.Impl.UserServiceImpl;
import comcom.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//单个删除
@WebServlet("/delUserServlet")
public class DelUserServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        String id=req.getParameter("id");
        UserServiceImpl service = new UserServiceImpl();
        service.delete(id);
        resp.sendRedirect(req.getContextPath()+"/userListServlet");
    }
}
