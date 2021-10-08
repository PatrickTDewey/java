<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>  

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
		
		<h1 class="h1">Expense Details for <c:out value="${ expense.name }" /></h1>
		
		<p class="h3">Name: <c:out value="${ expense.description }" /></p>
		
		<p class="h3">Vendor: <c:out value="${ expense.vendor }" /></p>
		
		<p class="h3">Description: <c:out value="${ expense.description }" /></p>
		
		<p class="h3">Amount: <fmt:formatNumber value="${ expense.amount }" type="currency" /></p>
		
		<a href="/expenses" class="btn btn-link">Home</a>
		
	</div>
</body>
</html>