<%@ page import="framework.Baby" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<% Baby baby = (Baby) getServletConfig().getServletContext().getAttribute("id"); %>

<div class="panel panel-primary add-baby-panel">
    <div class="panel-heading"><h3>${baby.name}</h3></div>
    <div class="panel-body">
        <div class="input-group">
            <span class="input-group-addon" id="basic-addon1">Szülő</span>
            <span type="text" class="form-control" id="parent" name="name" aria-describedby="basic-addon1">${baby.parent.name}</span>
        </div>
        <br>


        <form action="<c:url value='/web/babies/baby'/>" method="post">

            <div class="input-group">
                <span class="input-group-addon" id="basic-addon2">Súly érték</span>
                <input type="number" class="form-control" id="weight" name="weight" aria-describedby="basic-addon2">
                <input type="text" hidden name="id" id="id" value="${baby.id}">
            </div>
            <br>

            <input type="submit" value="Hozzáadás" class="btn btn-primary">
        </form>
    </div>
</div>
<div class="panel panel-default">
    <div class="panel-heading">Rögzített súlyértékek</div>

    <!-- Table -->
    <table class="table">
        <thead>
            <tr>
                <th>Dátum</th>
                <th>Súly (g)</th>
            </tr>
        </thead>

        <c:forEach var="data" items="${dataset}">
            <tr>
                <td>${data.date.toString()}</td>
                <td>${data.weight}</td>
            </tr>
        </c:forEach>
    </table>
</div>






<body>

</body>
</html>
