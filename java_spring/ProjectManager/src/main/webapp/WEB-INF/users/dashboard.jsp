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
	
		<div class="row">
		
			<div class="col-sm-8">
				<h1 class="h1">Welcome, <c:out value="${ user.firstName }" /></h1>
				<h3 class="h3">Projects.</h3>
			</div>
			<div class="col-auto">
				<a href="/users/logout" class="btn btn-link">Logout</a>
				<a href="/projects/new" class="btn btn-link">+ Add a project</a>
			</div>
			
		</div>
		
		<table class="table table-dark text-light table-striped table-hover">
			<thead>
				<tr>
					<th>Id</th>
					<th>Title</th>
					<th>Author</th>
					<th>Posted By</th>
				</tr>
			</thead>
			<tbody>
				<%-- <c:if test="${ !books.isEmpty() }">
					<c:forEach var="book" items="${ books }">
						<tr>
							<td><c:out value="${ book.id }" /></td>
							<td><a href="/books/view/<c:out value="${ book.id }" />"><c:out value="${ book.title }" /></a></td>
							<td><c:out value="${ book.author }" /></td>
							<td><c:out value="${ book.user.userName }" /></td>
						</tr>
					</c:forEach> 
				</c:if>--%>
			</tbody>
		</table>
	</div>
</body>
</html>