<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
    <%--Login form : --%>
    <form action="get_data" method="post">
        Enter your username : <input type="text" name="username"> <br>
        Enter your password : <input type="password" name = "password"> <br>

        <input type="submit" name="login">
    </form>
    <br>
    <%--Register a new user form : --%>
    <form action="register_info.jsp">
        New user : <input type="submit" value="Sign up">
    </form>
</body>
</html>