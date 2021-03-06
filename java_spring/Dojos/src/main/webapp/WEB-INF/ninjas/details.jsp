<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css"/>
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

<script type="text/javascript" src="js/app.js"></script>
<title>Index View</title>
</head>
<body>
	<div class="container">
		
		<h1 class="h1">Ninja Details:</h1>
		<h3 class="h3">First Name: <c:out value="${ ninja.firstName }"></c:out></h3>
		<h3 class="h3">Last Name: <c:out value="${ ninja.lastName }"></c:out></h3>
		<h3 class="h3">Age: <c:out value="${ ninja.age }"></c:out></h3>
		<h3 class="h3">Current Dojo: <c:out value="${ ninja.dojo.name }"></c:out></h3>
		
		<a href="/dojos" class="btn btn-link">Home</a>
		
	</div>
</body>
</html>