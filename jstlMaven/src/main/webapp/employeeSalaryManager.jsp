<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.List" %>
<%@ page import="jrout.tutorial.servlet.domain.Employee" %>	

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"
	integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7"
	crossorigin="anonymous">
</head>
<body>
	<table class="table table-striped table-bordered">
		<thead>
			<tr>
				<th>FIRST Name</th>
				<th>Salary</th>
				<th>Manager</th>
			</tr>
		</thead>
		<tbody>

		<c:forEach var="emp" items="${employeeList}">
			<tr>
				<td class="info" bgcolor="black"><c:out value="${emp.fname}"/></td>
				<td><c:out value="${emp.salary}"/></td>
				<td><c:out value="${emp.managerId}"/></td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</body>
</html>