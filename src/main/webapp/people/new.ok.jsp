<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>New person</title></head>
<body>
<h1>New person</h1>

<form action="/people" method="post">
    <label for="name">Name</label><br />
    <input name="name" type="text" id="name" /><br />

    <input type="submit" value="create person" id="submit">
</form>

<a href="/people">Back</a>

</body>
</html>