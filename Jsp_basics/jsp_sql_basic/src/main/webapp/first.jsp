<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="sql" uri="jakarta.tags.sql" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
    <sql:setDataSource var = "elec" driver = "com.mysql.cj.jdbc.Driver" url = "jdbc:mysql://127.0.0.1:3306/electronics" user = "root" password = "Sonam@1108" />
    <sql:query var = "rs" dataSource = "${elec}">SELECT * FROM gadgets</sql:query>

    <c:forEach items = "${rs.rows}" var = "gadget">
        <br><c:out value = "${gadget.model}"></c:out> : <c:out value = "${gadget.gName}"></c:out> : <c:out value = "${gadget.price}"></c:out>
    </c:forEach>

    <sql:query var = "prices" dataSource = "${elec}">SELECT price FROM gadgets WHERE gName = "Oneplus";</sql:query>
    <c:forEach items = "${prices.rows}" var = "price">
        <br> <c:out value = "${price}"></c:out>
    </c:forEach>

</body>
</html>