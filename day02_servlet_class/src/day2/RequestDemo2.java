package day2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/qingqiutou")
public class RequestDemo2 extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        //获取请求头数据
        Enumeration<String> hearderName=req.getHeaderNames();
        while (hearderName.hasMoreElements())
        {
            String name=hearderName.nextElement();
            String value=req.getHeader(name);
            System.out.println(name+"-----"+value);
        }
        String header=req.getHeader("user-agent");
        if(header.contains("Firefox")){
            System.out.println("火狐");
        }
        else  if (header.contains("chrome"))
        {
            System.out.println("谷歌");
        }



    }
}
