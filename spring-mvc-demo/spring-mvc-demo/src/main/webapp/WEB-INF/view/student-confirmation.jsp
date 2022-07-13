<%--
  Created by IntelliJ IDEA.
  User: kingauther33
  Date: 13/07/2022
  Time: 22:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
The student is confirmed: ${student.firstName} ${student.lastName}
<br>
Country: ${student.country}
Favourite Language: ${student.favouriteLanguage}
Operating Systems:
<ul>
    <c:forEach var="temp" items="${student.operatingSystems}">
        <li>${temp}</li>
    </c:forEach>
</ul>
</body>
</html>
