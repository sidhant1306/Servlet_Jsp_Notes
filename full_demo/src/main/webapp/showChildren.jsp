<%@ page import="com.example.dao.Children_dao" %>
<%@ page import="com.example.model.children_dataModel" %><%--
  Created by IntelliJ IDEA.
  User: HomePC
  Date: 11/3/2025
  Time: 4:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        children_dataModel child = (children_dataModel) request.getAttribute("child");
        out.println(child);
    %>
</body>
</html>
