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
		<div class="d-flex p-2 bd-highlight justify-content-between">
			<h1 class="h1"><c:out value="${ book.title }"/></h1>
			<a href="/home" class="btn btn-link" >Back To The Shelves</a>
			
		</div>
		<c:choose>
			<c:when test="${ user_id == book.user.id }">
				<h3 class = "h3" >You read <c:out value="${ book.title }"/> by <c:out value="${ book.author }"/> </h3>
				<h3 class="h3">Here are your thoughts:</h3>
			</c:when>
			<c:otherwise>
				<h3 class = "h3" ><c:out value="${ book.user.userName }"/> read <c:out value="${ book.title }"/> by <c:out value="${ book.author }"/> </h3>
				<h3 class="h3">Here are <c:out value="${ book.user.userName }"/>'s thoughts.</h3>
			</c:otherwise>
		</c:choose>
		<div class="card p-5">
			<blockquote class="blockquote text-center">
				<p class="mb-2"><c:out value="${ book.myThoughts }"/></p>
				<footer class="blockquote-footer">Thoughts from <cite title="User Name"><c:out value="${ book.user.userName }"/></cite></footer>
			</blockquote>
		</div>
		<c:if test="${ user_id == book.user.id }">
			<a href="/books/edit/<c:out value="${ book.id }" />" class="btn btn-warning mt-2">Edit</a>
		</c:if>
	</div>
</body>
</html>