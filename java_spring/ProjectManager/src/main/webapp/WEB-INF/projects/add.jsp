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
		<form:form action='/projects/new' method='POST' modelAttribute="newProject" class="mt-3">
			
			    <div class="form-floating mb-3">
			    
			    	<form:input  placeholder="enter a title." class="form-control" path="title" />
			    	
					<form:label class="form-label" path="title">Title: </form:label >
			    	
			    	<form:errors class="text-danger" path="title"/>
					
			    </div>
			    
			    <div class="form-floating mb-3">
			    
			    	<form:input type="text" placeholder="enter description:" class="form-control" path='description' />
					
					<form:label class="form-label" path="description">Enter Description: </form:label >
			    	
			    	<form:errors class="text-danger" path="description"/>
					
			    </div>
			    
			    <div class="form-floating mb-3">
			    	
			    	<form:input type="date" placeholder="enter dueDate" class="form-control" path="dueDate" />
					
					<form:label class="form-label" path="dueDate">Enter Date:</form:label >
					
			    	<form:errors class="text-danger" path="dueDate"/>
			    	
			    </div>
			    
		   		 <form:hidden path="lead" value="${ user.id }" />
		    
		    	<input class="btn btn-primary" type='submit' value='Register' >
		</form:form>
		
	</div>
</body>
</html>