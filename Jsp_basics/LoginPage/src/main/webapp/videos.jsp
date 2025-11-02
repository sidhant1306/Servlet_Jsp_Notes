<%--
  Created by IntelliJ IDEA.
  User: HomePC
  Date: 11/3/2025
  Time: 12:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%

    if(session.getAttribute("username") == null){
        response.sendRedirect("login.jsp");
    }
%>

video
</body>
</html>
