<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
	<%
		List<Employee> employeeList = (List<Employee>)request.getAttribute("employeeList");
	%>
	
	<table class="table table-striped table-bordered">
		<thead>
			<tr>
				
				<th>FIRST Name</th>
				<th>Salary</th>
				<th>Manager</th>
			</tr>
		</thead>
		<tbody>
<!-- 		out.println("<tr><td>" + emp.getFname() + "</td><td>"
						+ emp.getSalary() + "</td><td>" + emp.getManagerId() + "</td></tr>");
 -->
 		<%
			for(Employee emp : employeeList){
		%>
			<tr>
				<td class="info" bgcolor="black"><%=emp.getFname()%></td>
				<td><%=emp.getSalary()%></td>
				<td><%=emp.getManagerId()%></td>
			</tr>
		<%	
			}
		%>
			<!-- <tr>
				<td class="info">100</td>
				<td>Steven</td>
				<td>King</td>
				<td>SKING</td>
			</tr> -->
		</tbody>
	</table>
</body>
</html>