<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<%
    int i = Integer.parseInt(request.getParameter("num1"));
    int j = Integer.parseInt(request.getParameter("num2"));

    int result = i + j;
    out.println("haahaa" +result);
%>


</body>
</html>