<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/8/31
  Time: 13:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
//在域中存储数据
    session.setAttribute("name","ss");
    request.setAttribute("name","rr");
    session.setAttribute("age","23");
    request.setAttribute("str","0");
%>
<h3>获取</h3>
${requestScope.name}
${sessionScope.name}
${sessionScope.age}
${requestScope.str}
</body>
</html>
