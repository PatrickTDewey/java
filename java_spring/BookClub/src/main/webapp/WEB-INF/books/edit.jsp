<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>

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
		<a href="/home" class="btn btn-link" >Back To The Shelves</a>
		<form:form action='/books/edit/${ book.id }' method='PUT' modelAttribute="book" class="mt-3">
		
		    <div class="form-floating mb-3">
		    
		    	<form:input  placeholder="Book Title:" class="form-control" path="title" />
		    	
				<form:label class="form-label" path="title">Book Title:</form:label >
		    	
		    	<form:errors class="text-danger" path="title"/>
				
		    </div>
		    
		    <div class="form-floating mb-3">
		    
		    	<form:input type="text" placeholder="enter author name" class="form-control" path='author' />
				
				<form:label class="form-label" path="author">Author</form:label >
		    	
		    	<form:errors class="text-danger" path="author"/>
				
		    </div>
		    
		    <div class="form-floating mb-3">
		    	
		    	<form:textarea type="text" placeholder="My Thoughts:" class="form-control" path="myThoughts" />
				
				<form:label class="form-label" path="myThoughts">My Thoughts:</form:label >
				
		    	<form:errors class="text-danger" path="myThoughts"/>
		    	
		    </div>
		    <form:hidden path="user" value="${ user.id }" />
	    
	    	<input class="btn btn-primary" type='submit' value='Add Book' >
	    </form:form>
	    
	</div>
</body>
</html>