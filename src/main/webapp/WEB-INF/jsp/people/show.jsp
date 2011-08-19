<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--@elvariable id="person" type="people.model.Person"--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>${person.name}</title></head>
<body>
<%--@elvariable id="isNew" type="java.lang.Boolean"--%>
<c:if test="${isNew}">
    <div>Person was successfully created.</div>
</c:if>

Name: ${person.name}

<a href="/people/${person.id}/edit">Edit</a> | <a href="/people">Back</a>

</body>
</html>