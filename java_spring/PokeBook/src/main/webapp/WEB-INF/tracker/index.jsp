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
					<th>Expense</th>
					<th>Vendor</th>
					<th>Description</th>
					<th>Amount</th>
				</tr>
				
			</thead>
			<tbody> 
			
				<c:if test="${ !expenses.isEmpty() }">
					<c:forEach var="expense" items="${ expenses }">
						
						<tr>
							<td>
								<a href="/expenses/<c:out value="${ expense.id }"/>" ><c:out value="${ expense.name }" /></a>
							</td>
							
							<td><c:out value="${ expense.vendor }"/></td>
							
							<td><c:out value="${ expense.description }"/></td>
							
							<td><c:out value="${ expense.amount }" /></td>
						</tr>
						
					</c:forEach>
				</c:if>
				
			</tbody>			
		</table>
		
		
		<form:form action='/expenses/create' method='POST' modelAttribute="expense" class="mt-3">
		
		    <div class="form-floating mb-3">
		    
		    	<form:input  placeholder="Expense Name:" class="form-control" path="name" />
		    	
				<form:label class="form-label" path="name">Expense Name:</form:label >
		    	
		    	<form:errors class="text-danger" path="name"/>
				
		    </div>
		    
		    <div class="form-floating mb-3">
		    
		    	<form:input type="text" placeholder="Vendor:" class="form-control" path='vendor' />
				
				<form:label class="form-label" path="vendor">Vendor:</form:label >
		    	
		    	<form:errors class="text-danger" path="vendor"/>
				
		    </div>
		    
		    <div class="form-floating mb-3">
		    	
		    	<form:input type="number" step="0.01" placeholder="00.00" value="0.00" class="form-control" path="amount" />
				
				<form:label class="form-label" path="amount">Amount:</form:label >
				
		    	<form:errors class="text-danger" path="amount"/>
		    	
		    </div>
		    
		    <div class="form-floating mb-3">
		    	
		    	<form:textarea  placeholder="Description:" class="form-control" path="description" />
				
				<form:label class="form-label" path="description">Description:</form:label >
				
		    	<form:errors class="text-danger" path="description"/>
				
		    </div>
		  
		   
		   	<input class="btn btn-primary" type='submit' value='Add Expense' >
		</form:form>
		
	</div>
</body>
</html>