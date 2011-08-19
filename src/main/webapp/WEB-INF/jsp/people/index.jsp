<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head><title>Listing people</title></head>
<body>
<h1>Listing people</h1>

<table>
    <thead>
    <tr>
        <th>Name</th>
    </tr>
    </thead>
    <tbody>
    <%--@elvariable id="personList" type="java.util.List"--%>
    <c:forEach items="${personList}" var="person">
        <tr>
            <td>${person.name}</td>
            <td><a href="/people/${person.id}">Show</a> <a href="/people/${person.id}/edit">Edit</a> <a href="#">Destroy</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<a href="/people/new">New Person</a>
</body>
</html>