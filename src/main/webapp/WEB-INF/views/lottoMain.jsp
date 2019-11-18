<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
<link rel="stylesheet" href="/resources/css/style.css" type="text/css"></link>
</head>
<body>
    <div>
        <div>
            <h1>Lotto Number Generator Game</h1>
	    <lotto class="button" onclick="myFunction()">Get Numbers!!!</lotto>
	    <p id="lottoNumbers"></p>
        </div>
    </div>
    <script>
    function myFunction() {
	   var s = document.getElementById("lottoNumbers");
	   <c:forEach items="${numbers}" var="number">
		s.innerHTML = s.innerHTML + " " + "<strong>"+ ${number} + "</strong>";
	   </c:forEach>
    }
    </script>
</body>
</html>
