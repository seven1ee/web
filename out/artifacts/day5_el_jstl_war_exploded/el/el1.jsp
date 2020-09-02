<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/8/31
  Time: 12:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="true" %> //让所有el表达式都失效--%>
<html>
<head>
    <title>Title</title>
</head>
<body>
${3>4}
<br>
\${3>4}
<br>
<h3>算数运算符</h3>
${3+4}
${3-4}
${3*4}
${3/4}
${3%4}
${3 mod 4}
<h3>比较运算符</h3>
${3==4}
<h3>逻辑运算符</h3>
${3>4 && 3<4}
${3>4 and 3<4}
<h3>empty 运算符</h3>
<%
String str="";
request.setAttribute("aa",str);
    ArrayList<Object> list = new ArrayList<>();
    list.add("xx");
    request.setAttribute("list",list);
%>
${list}
${empty aa}
${empty list}
${not empty aa}
${not empty list}






</body>
</html>
