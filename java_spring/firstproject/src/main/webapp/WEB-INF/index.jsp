<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index</title>
</head>
<body>
	<h1>Hello World</h1>
	<h2><c:out value="${2+2}" /></h2>
	<h3>Fruit of the Day</h3>
	<h4><c:out value="${fruit}"/></h4>
</body>
</html>