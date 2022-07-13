<%--
  Created by IntelliJ IDEA.
  User: kingauther33
  Date: 13/07/2022
  Time: 22:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form:form action="processForm" modelAttribute="student" >
        First name: <form:input path="firstName" />
        <br>
        Last name: <form:input path="lastName" />
        <br>
        <form:select path="country">
            <form:options items="${theCountryOptions}" />
        </form:select>
        <br>
        Favourite Languages
        <form:radiobuttons path="favouriteLanguage" items="${theLanguageOptions}" />
        <br>
        <form:checkboxes path="operatingSystems" items="${theSystemOptions}" />
        <br>
        <input type="submit" value="Submit" />
    </form:form>
</body>
</html>
