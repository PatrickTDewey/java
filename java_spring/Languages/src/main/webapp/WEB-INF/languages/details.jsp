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
	
		<h1 class="h1">Details</h1>
		
		<div class="row">
		
			<div class="col-sm-8">
				
				<p class="p"><c:out value="${ language.name }"></c:out></p>
				<p class="p"><c:out value="${ language.creator }"></c:out></p>
				<p class="p"><c:out value="${ language.version }"></c:out></p>
				<a href="/languages/edit/${ language.id }">Edit</a>
				<form:form action="/languages/delete/${ language.id }" method="DELETE"> 
						<input type="submit" value="Delete" class="btn btn-link" />
				</form:form>
								
			</div>
			
			<div class="col-sm-4">
				
				<a href="/languages">Dashboard</a>
								
			</div>
			
		</div>
		
	</div>
</body>
</html>