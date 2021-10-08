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
    
	   <form:form action='/users/register' method='POST' modelAttribute="newUser" class="mt-3">
			
			    <div class="form-floating mb-3">
			    
			    	<form:input  placeholder="enter a username." class="form-control" path="userName" />
			    	
					<form:label class="form-label" path="userName">Enter Username:</form:label >
			    	
			    	<form:errors class="text-danger" path="userName"/>
					
			    </div>
			    
			    <div class="form-floating mb-3">
			    
			    	<form:input type="text" placeholder="enter email:" class="form-control" path='email' />
					
					<form:label class="form-label" path="email">Enter Email: </form:label >
			    	
			    	<form:errors class="text-danger" path="email"/>
					
			    </div>
			    
			    <div class="form-floating mb-3">
			    	
			    	<form:input type="password" placeholder="enter password" class="form-control" path="password" />
					
					<form:label class="form-label" path="password">Enter Password:</form:label >
					
			    	<form:errors class="text-danger" path="password"/>
			    	
			    </div>
			    
			    <div class="form-floating mb-3">
			    	
			    	<form:input type="password" placeholder="Pages:" class="form-control" path="confirm" />
					
					<form:label class="form-label" path="confirm">Confirm Password:</form:label >
					
			    	<form:errors class="text-danger" path="confirm"/>
					
			    </div>
		   
		    
		    	<input class="btn btn-primary" type='submit' value='Register' >
		</form:form>
	    
	    <form:form action='/users/login' method='POST' modelAttribute="newLogin" class="mt-3">
			
			    <div class="form-floating mb-3">
			    
			    	<form:input  placeholder="Enter email:" class="form-control" path="email" />
			    	
					<form:label class="form-label" path="email">Email:</form:label >
			    	
			    	<form:errors class="text-danger" path="email"/>
					
			    </div>
			    
			    <div class="form-floating mb-3">
			    
			    	<form:input type="password" placeholder="Enter Password:" class="form-control" path='password' />
					
					<form:label class="form-label" path="password">Password</form:label >
			    	
			    	<form:errors class="text-danger" path="password"/>
					
			    </div>
			    
		    	<input class="btn btn-primary" type='submit' value='Login' >
		</form:form>
    
	</div>
</body>
</html>