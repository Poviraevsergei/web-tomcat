<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>History</title>
</head>
<body style="background-color: beige">
<table style="margin-left: auto;margin-right: auto;text-align: center" border="2">
    <tr>
        <th>Equation</th>
        <th>Result</th>
    </tr>
    <c:forEach var="line" items="${history}">
        <c:set var="parts" value="${fn:split(line, '|')}"/>
        <tr>
            <c:forEach var="part" items="${parts}">
                <td>${part}</td>
            </c:forEach>
        </tr>
    </c:forEach>
</table>
<br>
<br>
<form align="center" action="/">
    <input type="submit" value="Home page">
</form>
</body>
</html>

