<%--
  Created by IntelliJ IDEA.
  User: kingauther33
  Date: 12/07/2022
  Time: 23:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello World</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/test.css">
</head>
<body>
<p>Hello World of Spring!</p>
<br>
Student name: ${param.studentName}

<br>
The message: ${message}

</body>
</html>
