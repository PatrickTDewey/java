<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- for Bootstrap CSS -->
<!--  <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" /> -->
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/main.css"/>
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

<script type="text/javascript" src="js/app.js"></script>
<title>Index View</title>
</head>
<body>
	<div class="wrapper">
        <h1>Reach 300 Gold in Less Than 15 Attempts, Challenger</h1>
        <div class="flex-top">
            <div class="your-gold">
                <h3>Your Gold:</h3>
                <p class="your-gold-p"><c:out value="${ gold }"/></p>
            </div>
            <div class="your-gold">
                <h3>Attempts:</h3>
                <p class="your-gold-p">tries</p>
            </div>
        </div>
        <div class="win/lose">
            <h1>Hey You, Win/Lose </h1>
        </div>
        <div class="flex {% if session['switch'] == True%}hide{% endif %}">
            <div class="farm box">
                <h3>Farm</h3>
                <p>(earns 10 - 20 golds)</p>
                <form action="/process" method="post">
                    <input class="button" type="submit" value="Find Gold">
                    <input type="hidden" name="process" value='farm'>
                </form>
            </div>
            <div class="cave box">
                <h3>Cave</h3>
                <p>(earns 5 - 10 golds)</p>
                <form action="/process" method="post">
                    <input class="button" type="submit" value="Find Gold">
                    <input type="hidden" name="process" value='cave'>
                </form>
            </div>
            <div class="house box">
                <h3>House</h3>
                <p>(earns 2 - 5 gold)</p>
                <form action="/process" method="post">
                    <input class="button" type="submit" value="Find Gold">
                    <input type="hidden" name="process" value='house'>
                </form>
            </div>
            <div class="casino box">
                <h3>Casino</h3>
                <p>(earns/takes 0-50 gold)</p>
                <form action="/process" method="post">
                    <input class="button" type="submit" value="Find Gold">
                    <input type="hidden" name="process" value='casino'>
                </form>
            </div>
        </div>
        
        <div class="activity-log">
           <c:if test="${ messages.size() >= 1 }">
           		<ul>
           		<c:forEach var="message" items="${ messages }">
           		
					
						<li class='green'><c:out value="${ message }"/></li>
					         		 
           		</c:forEach>
           		</ul>
           </c:if>
        </div>
        <div class="reset-section">
            <form action="/reset" method="post">
                <input class="reset-button" type="submit" value="Reset">
            </form>
        </div>
    </div>
</body>
</html>