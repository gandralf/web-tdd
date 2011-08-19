<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>New person</title></head>
<body>
<h1>New person</h1>

<form action="/people" method="post">
    <label for="name">Name</label><input name="person.name" id="name">
    <input type="submit" value="Create Person" id="submit" />
</form>

<a href="../">Back</a>
</body>
</html>