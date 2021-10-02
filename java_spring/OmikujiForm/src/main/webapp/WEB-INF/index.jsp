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
<title>Index View</title>
</head>
<body>
	<div class="container">
	
		<h1 class="h1">Hello World</h1>
		    <h3>Send an Omikuji</h3>
	    <form action='/submit' method='POST'>
	    <!--  <div class="form-floating mb-3">
	    	<input placeholder="Email:" class="form-control"type="text" name='email'>
			<label class="form-label">Email:</label>
	    </div>
	    <div class="form-floating mb-3">
	    	<input type='password' placeholder="Password:" class="form-control" name='password'>
			<label class="form-label">Password:</label>
	    </div>
	    -->
	    <div class="form-floating mb-3">
	    	<input type='number' placeholder="0" class="form-control" name='number'>
			<label class="form-label">Pick any Number from 5 to 25:</label>
	    </div>
	    <div class="form-floating mb-3">
	    	<input type="text" placeholder="City:" class="form-control" name='city'>
			<label class="form-label">Enter the name of any city:</label>
	    </div>
	    <div class="form-floating mb-3">
	    	<input type="text" placeholder="Name:" class="form-control" name='name'>
			<label class="form-label">Enter the name of any real person:</label>
	    </div>
	    <div class="form-floating mb-3">
	    	<input type="text" placeholder="Hobby:" class="form-control" name="hobby">
			<label class="form-label">Enter a hobby:</label>
	    </div>
	    <div class="form-floating mb-3">
	    	<input type="text" placeholder="Animal:" class="form-control" name='animal'>
			<label class="form-label">Enter an animal:</label>
	    </div>
	    <div class="form-floating mb-3">
	    	<textarea rows="5" cols="33" placeholder="Nice:" class="form-control" name='nice'></textarea>
			<label class="form-label">Say something nice:</label>
	    </div>
	    	<input class="btn btn-primary" type='submit' value='Get Fortune'>
	    </form>
	    
	</div>
</body>
</html>