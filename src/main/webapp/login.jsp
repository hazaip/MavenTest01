<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>BabyNet WebApp - Bejelentkezés</title>
    <link rel="stylesheet" type="text/css" href="<c:url value='/css/style.css'/>"/>
    <script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
</head>
<body>
    <div id="root">

        <div class="login-form">

            <h2>Jelentkezz be!</h2>
            <form method="POST" action="j_security_check">
                <label for="username">Felhasználónév</label>
                <input type="text" name="j_username" id="username" />
                <br>
                <label for="password">Jelszó</label>
                <input type="password" name="j_password" id="password" />
                <br>
                <input class="submit-btn btn btn-primary" type="submit" value="Bejelentkezés" />

                <p>Ha még nincs hozzáférésed, <a href="<c:url value='/register'/>">itt</a> tudsz regisztrálni.</p>
            </form>

        </div>
    </div>
</body>
</html>
