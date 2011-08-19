<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
    <tr>
        <td>person.name</td>
        <td><a href="person.id">Show</a> <a href="person.id/edit">Edit</a> <a href="#">Destroy</a></td>
    </tr>
    </tbody>
</table>
<strong>Name</strong>
- ... [Show] [Edit] [Destroy]

<a href="new">New Person</a>
</body>
</html>