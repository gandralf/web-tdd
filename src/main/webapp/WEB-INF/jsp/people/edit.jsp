<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--@elvariable id="person" type="people.model.Person"--%>

<html>
<head><title>Editing person</title></head>
<body>
<h1>Editing person</h1>

<form action="/people/${person.id}" method="post">
    <input type="hidden" name="_method" value="PUT">
    <input type="hidden" name="person.id" value="${person.id}">
    <label for="name">Name</label><input name="person.name" id="name" value="${person.name}">
    <input type="submit" value="Create Person" id="submit" />
</form>

<a href="../">Back</a>
</body>
</html>