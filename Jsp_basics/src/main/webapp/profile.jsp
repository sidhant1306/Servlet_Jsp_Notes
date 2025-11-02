<%--
  Created by IntelliJ IDEA.
  User: HomePC
  Date: 11/1/2025
  Time: 6:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%--TO CONNECT JDBC, WE FIRST HAVE TO IMPORT SQL : --%>
<%@ page import="java.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--Adding a tag library which will provide us options of printing, forEach etc.--%>
<%@ taglib prefix="c" uri ="jakarta.tags.core"%>

<html>
<head>
    <title>Title</title>
</head>
<body>
  <%--  101<br>
    Sidhant <br>
    98<br>
    <br>--%>
<%--Connecting the drivers : --%>

<%--comment start :


<%
    try {

        Class.forName("com.mysql.cj.jdbc.Driver");
    }
    catch (ClassNotFoundException e) {
        throw new RuntimeException(e);
    }

    try {
        final String url = "jdbc:mysql://127.0.0.1:3306/jspPractice";
        final String username = "root";
        final String password = "Sonam@1108";
        // establishing the connection :
        Connection connection = DriverManager.getConnection(url, username, password);
        String printTable_query = "SELECT * FROM children";
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(printTable_query);
        while(rs.next()){
            out.println("id : " +rs.getInt("id"));
            out.println("marks : " +rs.getInt("marks"));
            out.println("name : " +rs.getString("name"));
        }

} catch (SQLException e) {
    throw new RuntimeException(e);
}
%>

--%>    <%--Comment end--%>
<%--
<%
    String name = request.getAttribute("label").toString();
    out.println(name);
%>
--%>

<%--Now this what we did above to print can be replaced by : --%>

  <%--
${label}    <%--This also fetches the value of label variable from the servlet and prints it--%>
  <%--
<c:out value = "Hello world"/>
--%>


<%--printing any objects : --%>
  <%-- ${student.name}  --%>       <%--printing only the name, requires getters and setters--%>

  <%-- ${student} --%>      <%--printing the entire object, requires toString method--%>

<%--Printing the list of objects : --%>
<%-- ${students} --%>   <%-- Will print all the objects in a single list of objects --%>

<%--Printing the list of objects in different list for each objects : --%>

    <c:forEach items = "${students}" var = "s">
    ${s} <br/>
    </c:forEach>

          <%-- "s" is the varible name for each object in each call.--%>


</body>
</html>
