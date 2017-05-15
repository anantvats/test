<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>

</head>
<body>
<form:form method="post" modelAttribute="student"  action="http://localhost:8080/restpractice/create">
<table>
<tr>
<th colspan="2">Add Student</th>
</tr>
<tr>
<form:hidden path="id"/>
<td>
<form:label path="name">Name</form:label>
</td>
<td>
<form:input path="name"/>
</td>
</tr>
<tr>
<td colspan="2"><input type="submit">
</td>
</tr>

</table>

</form:form>

</body>
</html>