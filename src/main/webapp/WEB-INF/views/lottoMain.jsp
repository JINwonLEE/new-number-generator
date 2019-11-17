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
            ${numbers}
            <lotto class="button" onclick="${numbers}">Get Numbers!!!</lotto>

        </div>
    </div>
</body>
</html>
