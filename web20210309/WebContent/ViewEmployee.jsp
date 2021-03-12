<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employees View</title>
</head>
<body>
<table border="1" width="80%">
		<tr>
			<th>Employee No.</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>JobTitle</th>
			<th>email</th>
			<th>extension</th>
		</tr>
		<c:forEach var="current" items="${emps}">
			<tr>
				<td><c:out value="${current.employeeNumber}" />
				</td>
				<td><c:out value="${current.firstName}" />
				</td>
				<td><c:out value="${current.lastName}" />
				</td>
				<td><c:out value="${current.jobTitle}" />
				</td>
				<td><c:out value="${current.email}" />
				</td>
				<td><c:out value="${current.extension}" />
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>