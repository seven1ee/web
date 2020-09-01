<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/8/29
  Time: 14:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script>
        window.onload=function () {
            document.querySelector("#img").onclick=function () {
                this.src="/CheckCodeServlet?"+new Date().getTime();

            }

        }
    </script>
</head>
<body>
<form action="/loginServlet" method="post">
    <table>
        <tr>
            <td>用户名</td>
            <td><input type="text" name="username"></td>
        </tr>
        <tr>
            <td>密码</td>
            <td><input type="password" name="password"></td>
        </tr>
        <tr>
            <td>验证码</td>
            <td><input type="text" name="checkcode"></td>
        </tr>
        <tr>
            <td colspan="2"><img id="img" src="/checkCodeServlet"   alt=""></td>
        </tr>
        <tr>
            <td ><input type="submit"  value="登录"></td>
        </tr>
    </table>
</form>
</body>
</html>
