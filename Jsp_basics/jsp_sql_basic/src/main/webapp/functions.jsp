<%--
  Created by IntelliJ IDEA.
  User: HomePC
  Date: 11/2/2025
  Time: 9:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="sql" uri="jakarta.tags.sql" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fn" uri="jakarta.tags.functions" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--Function to get the length of the string : --%>

<c:set var = "str" value = "Sonam Saini"/>
length of the string : ${fn:length(str)}

<%--Function to split the String--%>
<c:set var = "str1" value = "Hi My name is Sidhant"/>
<c:forEach items = "${fn:split(str1,' ')}" var = "splitted">
    <br> ${splitted}
</c:forEach>

<%--Index of Function : --%>

<br>index : ${fn:indexOf(str1,'is')}

<%--Contains method : --%>

<br> isThere : ${fn:contains(str1, 'Sidhant')}

<%--if condition : --%>

<c:if test = "${fn:contains(str1, 'Sidhant')}">
    <br>Yes your name is present
</c:if>

<%--if condition : --%>
<c:choose>
    <c:when test = "${fn:endsWith(str, 'saini')}">
        <br> Yeah her caste is 'hero'.
    </c:when>
    <c:otherwise><br>Nah</c:otherwise>
</c:choose>

</body>
</html>
