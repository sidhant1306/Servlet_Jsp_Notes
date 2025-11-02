<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body bgcolor="#00ffff">
<%  // Scriptlet
    int i = Integer.parseInt(request.getParameter("num1"));
    int j = Integer.parseInt(request.getParameter("num2"));

    int result = i + j;
    // out.println("output is : " +result);    // in jsp there is no need of out.println
    // to print :
%>
Result is lala: <%= result %>       <%--Expression--%>
jj
<%--// declaring a variable outside the servlet service method(),
// as sometimes we might want to use a variabel in multiple methods on the servlet.--%>

<%!
    int global = 88; // it helps to declare something outside the service method,(declaration)
%>

<%-- to import some package : DIRECTIVE  : --%>

<%@ page import="java.util.ArrayList, java.util.HashMap" %>  <%--Just an example of adding multiple imports--%>

</body>
</html>