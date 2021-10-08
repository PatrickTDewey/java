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
		<h1>Details For <c:out value="${ dojo.name }" /> Dojo</h1>
		
		<table class="table-striped table table-hover table-dark">
			<thead>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Age</th>
					<th>Actions</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="ninja" items = "${dojo.ninjas}" >
				
					<tr>
						<td><c:out value="${ ninja.firstName }" /></td>
						<td><c:out value="${ ninja.lastName }"/></td>
						<td><c:out value="${ ninja.age }" /></td>
						<td>
							<a class="btn-link btn text-light" href="/ninjas/delete/<c:out value="${ ninja.id }"/>">Delete</a>
							<a class="btn-link btn text-light" href="/ninjas/edit/<c:out value="${ ninja.id }"/>">Edit</a>
							<a class="btn-link btn text-light" href="/ninjas/view/<c:out value="${ ninja.id }"/>">View</a>
						</td>
					</tr>
					
				</c:forEach>			
			</tbody>
		</table>
		
		<a href="/dojos" class="btn btn-link">Home</a>
		
		
	</div>
</body>
</html>