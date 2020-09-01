package day3.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/demo11")
public class RequestDemo2 extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {

        this.doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        req.setAttribute("msg","nmsl");
//        RequestDispatcher requestDispatcher=req.getRequestDispatcher("/requestDemo5");
//        requestDispatcher.forward(req,resp);
        req.getRequestDispatcher("/requestDemo5").forward(req,resp);

    }
}
