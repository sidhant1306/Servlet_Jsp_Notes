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
    response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
    if(session.getAttribute("username") == null){
        response.sendRedirect("login.jsp");
    }
%>

<iframe width="560" height="315" src="https://www.youtube.com/embed/-Fe0zk-F4OA?si=p5eE8Yub8vv80Njg" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe>
</body>
</html>
