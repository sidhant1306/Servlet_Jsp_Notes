<%@ page import="com.example.dao.info_dao" %>
<%@ page import="com.example.model.info_dataModel" %>
<%@ page import="java.io.PrintWriter" %>
<%@ taglib prefix="c" uri= "jakarta.tags.core" %>
<%--
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

    Your data : <br>

    <%
        info_dataModel data = (info_dataModel) session.getAttribute("data");
        if (data == null) {     // if the user reached this page with no data, means he opened the page directly
            response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
            response.sendRedirect("login.jsp"); // send back to the login page
            return;
        }
    %>
    <h3> Your data : </h3>

Username: <%= data.getPrint_username() %> <br>
School: <%= data.getPrint_school() %> <br>
Grades: <%= data.getPrint_grades() %> <br>
Height: <%= data.getPrint_height() %> <br>
Weight: <%= data.getPrint_weight() %> <br>

    <form action="logout">
        <input type="submit" value="logout">
    </form>



</body>
</html>
