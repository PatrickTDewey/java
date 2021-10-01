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
<link rel="stylesheet" href="/css/main.css"/>
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

<script type="text/javascript" src="js/app.js"></script>
<title>Insert title here</title>
</head>
<body>
 <div class="container-sm">
	<table class="table table-hover table-striped">
		<thead>
			<tr>
			<td>Name</td>
			<td>Price</td>
			</tr>
		</thead>
		<tbody>
		<c:forEach var="fruit" items="${fruits}">
			<tr>
				<td><c:out value="${fruit.name}"/></td>
				<td><c:out value="${fruit.price}"/></td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
	</div>
</body>
</html>