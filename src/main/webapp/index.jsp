<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link rel="stylesheet" href="<c:url value="/resources/assests/css/test.css"/> ">
    <link rel="stylesheet" href="<c:url value="/resources/assests/bootstrap/css/bootstrap.min.css"/>" >
</head>
<body>
<h1 class="text-danger"><%= "Hello World!" %>
</h1>
<br/>
<a href="spring">Hello Servlet</a>
<a href="Log">Log</a>
    <script src="<c:url value="/resources/assests/js/jquery.js"/>"></script>
    <script src="<c:url value="/resources/assests/bootstrap/js/bootstrap.min.js"/>"></script>
</body>
</html>