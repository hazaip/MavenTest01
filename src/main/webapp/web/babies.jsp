<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="panel panel-primary add-baby-panel">
    <div class="panel-heading"><h3>Új baba hozzáadása</h3></div>
    <div class="panel-body">
        <form action="<c:url value='/web/babies'/>" method="post">

            <div class="input-group">
                <span class="input-group-addon" id="basic-addon1">Baba neve</span>
                <input type="text" class="form-control" id="name" name="name" aria-describedby="basic-addon1">
            </div>
            <br>

            <div class="input-group">
                <span class="input-group-addon" id="basic-addon2">Neme</span>
                <select name="add" id="gender" class="form-control" aria-describedby="basic-addon2">
                    <option value="boy">fiú</option>
                    <option value="girl">lány</option>
                </select>
            </div>
            <br>
            <input type="submit" value="Hozzáadás" class="btn btn-primary">
        </form>
    </div>
</div>

<div id="babies-wrapper">
    <c:forEach var="baby" items="${babies}">
        <div class="baby-photo-wrapper ${baby.gender.getCssClass()}">
            <a class="baby-photo" href="<c:url value='/web/babies/baby?id=${baby.id}'/>">
                <div class="baby-photo-name">${baby.name}</div>
            </a>
        </div>

    </c:forEach>
</div>




</body>
</html>
