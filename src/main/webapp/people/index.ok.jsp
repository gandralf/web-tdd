<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>Listing people</title></head>
<body>
<h1>Listing people</h1>

<%--@elvariable id="people" type="java.util.List"--%>
<table>
    <tr>
        <th>Name</th>
        <th></th>
        <th></th>
        <th></th>
    </tr>
    <c:forEach items="${people}" var="person">
        <tr>
            <td>${person.name}</td>
            <td><a href="/people/${person.id}">Show</a></td>
            <td><a href="/people/${person.id}/edit">Edit</a></td>
            <td><a href="/people/${person.id}">Delete</a></td>
        </tr>
    </c:forEach>
</table>

<a href="/people/new">New Person</a>

</body>
</html>