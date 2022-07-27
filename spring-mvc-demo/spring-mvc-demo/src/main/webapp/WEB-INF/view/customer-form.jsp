<%--
  Created by IntelliJ IDEA.
  User: kingauther33
  Date: 15/07/2022
  Time: 22:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Customer Registration Form</title>
    <style>
        .error {
            color: red;
        }
    </style>
</head>
<body>

    Fill out the form. Asterisk (*) means required.

    <br>

    <form:form action="processForm" modelAttribute="customer">

        First name: <form:input path="firstName" />

        <br>

        Last name (*): <form:input path="lastname" />

        <form:errors path="lastName" cssClass="error" />

        <br>

        <input type="submit" value="Submit" />

    </form:form>
</body>
</html>