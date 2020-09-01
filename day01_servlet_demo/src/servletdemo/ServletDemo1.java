package servletdemo;

import javax.servlet.*;
import java.io.IOException;

public class ServletDemo1 implements Servlet
{
    @Override
    public void init(ServletConfig servletConfig) throws ServletException
    {
        System.out.println('d');
    }

    @Override
    public ServletConfig getServletConfig()
    {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException
    {
        System.out.println("service被调用");

    }

    @Override
    public String getServletInfo()
    {
        return null;
    }

    @Override
    public void destroy()
    {

    }
}
