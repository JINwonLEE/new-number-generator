<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
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
	   document.getElementById("lottoNumbers").innerHTML = ${numbers};
    }
    </script>
</body>
</html>
