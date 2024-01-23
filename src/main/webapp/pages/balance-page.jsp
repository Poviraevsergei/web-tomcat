<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Jsp example</title>
</head>
<body>
<c:if test="${visible == true}">

JSTL Example

<c:forEach var="name" items="${names}">
    <h1><c:out value="${name}"/></h1>
</c:forEach>
</c:if>
</body>
</html>
