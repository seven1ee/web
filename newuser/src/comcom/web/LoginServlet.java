package comcom.web;

import comcom.domain.User;
import comcom.service.Impl.UserServiceImpl;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

public class LoginServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        req.setCharacterEncoding("utf-8");
        String vcode=req.getParameter("verifycode");
        HttpSession session = req.getSession();
        String checkcode_server = (String) session.getAttribute("CHECKCODE_SERVER");
        session.removeAttribute("CHECKCODE_SERVER");
        if(!checkcode_server.equalsIgnoreCase(vcode)){
            req.setAttribute("login_msg","验证码错误");
            req.getRequestDispatcher("/login.jsp").forward(req,resp);
            return;
        }
        else {
            Map<String,String[]> map=req.getParameterMap();
            User user=new User();
            try {
                BeanUtils.populate(user,map);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
            //查询
            UserServiceImpl service = new UserServiceImpl();
            User loginUser=service.login(user);
            if(loginUser!=null){
                session.setAttribute("user",loginUser);
                resp.sendRedirect(req.getContextPath()+"/index.jsp");
            }
            else{
                req.setAttribute("login_msg","用户名或密码错误");
                req.getRequestDispatcher("/login.jsp").forward(req,resp);
            }

        }
    }
}
