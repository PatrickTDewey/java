<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css" />
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

<script type="text/javascript" src="js/app.js"></script>
<title>Index View</title>
</head>
<body>
	<div class="container">
		<h1 class="h1">Dash board</h1>
		<div class="container-sm p-5 bg-primary">
			<p class="text-light">In <c:out value="${ number }"/> years, you will live in <c:out value="${ city }"/> with <c:out value="${ name }"/> as your roommate, selling oragamis for a living, The next time you see a <c:out value="${ animal }"/> you will have good luck. Also, <c:out value="${ nice }"/></p>
		</div>
   	</div>
</body>
</html>