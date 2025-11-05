<%--
  Created by IntelliJ IDEA.
  User: HomePC
  Date: 11/4/2025
  Time: 5:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <%--Taking inputs of the register information : --%>
        <%--passing it to register_controller servlet--%>
    <form action="register_controller" >
        Enter your Username : <input type="text" name="newUsername"><br>
        Set a new password : <input type="text" name="newPassword"><br>
        Enter your school name : <input type="text" name="newSchool"><br>
        Enter your grades :<br>
        <input type = "radio" name="newGrades" value="A"> A
        <input type = "radio" name="newGrades" value="B"> B
        <input type = "radio" name="newGrades" value="C"> C
        <input type = "radio" name="newGrades" value="D"> D

        Enter your height : <input type="text" name="newHeight"><br>
        Enter your weight : <input type="text" name="newWeight"><br>

        <input type="submit" value="Register">
    </form>

</body>
</html>
