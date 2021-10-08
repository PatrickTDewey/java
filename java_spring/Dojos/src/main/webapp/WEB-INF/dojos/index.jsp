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
	
		<table class="table table-striped table-hover">
		
			<thead>
				<tr>
					<td>Dojo Name</td>
					<td>Number of Ninjas</td>
					<td>Actions</td>
				</tr>
			</thead>
			
			<tbody>
			
				<c:if test="${ !dojos.isEmpty() }">
				
					<c:forEach var="dojo" items="${ dojos }">
					
						<tr>
							<td>${ dojo.name }</td>
							<td>${ dojo.ninjas.size() }</td>
							<td>
								<a class="btn btn-link" href="dojos/view/${ dojo.id }">View</a>
								<a class="btn btn-link" href="dojos/edit/${ dojo.id }">Edit</a>
								<a class="btn btn-link" href="dojos/view/${ dojo.id }">Delete</a>
							</td>
						</tr>
						
					</c:forEach>
					
				</c:if>
				
			</tbody>
		
		</table>
		
		<a href="/dojos/add" class="btn btn-success">Add Dojo</a>
		<a href="/ninjas/add" class="btn btn-primary">Add Ninja</a>
		
	</div>
</body>
</html>