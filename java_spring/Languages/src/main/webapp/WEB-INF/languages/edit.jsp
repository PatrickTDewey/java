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
		
		<a href="/languages">Dashboard</a>
		<form:form action="/languages/delete/${ language.id }" method="DELETE"> 
			<input type="submit" value="Delete" class="btn btn-link" />
		</form:form>
		
		<form:form action='/languages/edit/${ language.id }' method='PUT' modelAttribute="language" class="mt-3">
		
		    <div class="form-floating mb-3">
		    
		    	<form:input  placeholder="enter a name." class="form-control" path="name" />
		    	
				<form:label class="form-label" path="name">Name:</form:label >
		    	
		    	<form:errors class="text-danger" path="name"/>
				
		    </div>
		    
		    <div class="form-floating mb-3">
		    
		    	<form:input type="text" placeholder="enter creator name." class="form-control" path='creator' />
				
				<form:label class="form-label" path="creator">Creator: </form:label >
		    	
		    	<form:errors class="text-danger" path="creator"/>
				
		    </div>
		    
		    <div class="form-floating mb-3">
		    	
		    	<form:input type="text" placeholder="enter version number." class="form-control" path="version" />
				
				<form:label class="form-label" path="version">Version:</form:label >
				
		    	<form:errors class="text-danger" path="version"/>
		    	
		    </div>
		    
	    	<input class="btn btn-primary" type='submit' value='Update' >
		</form:form>
		
	</div>
</body>
</html>